package com.example.softwarequality.SoftwareQuality.Controller;

import com.example.softwarequality.SoftwareQuality.DBFunctionInterface.QuestionInterface;
import com.example.softwarequality.SoftwareQuality.Data.*;
import com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection;
import org.springframework.web.bind.annotation.*;


import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@RestController
public class DataController implements QuestionInterface{
    private final String getAllQuestions = "SELECT *  FROM QUESTIONBANK";
    private final String LIST_MODULES = "SELECT * FROM MODULE";
    private int userID = 0;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    Connection conn;
    ArrayList<Questions> list_0f_questions = new ArrayList<>();
    ArrayList<Modules> list_0f_modules = new ArrayList<>();
    ArrayList<ModuleResponseEntity> response_list = new ArrayList<>();

    @CrossOrigin
    @RequestMapping("/get-questions")
    public List<Questions> getQuestions(){
        this.getAllQuestions();
        return list_0f_questions;
    }

    @CrossOrigin
    @RequestMapping("/get-modules")
    public List<Modules> getModules(){
        this.getModuleList();
        return list_0f_modules;
    }

    @CrossOrigin
    @RequestMapping("/get-module-response/")
    public Object getModuleBasedResponse(@RequestParam("moduleID") int moduleID) {

        if(this.checkModuleID(moduleID))
        {
            this.moduleBasedResponse(moduleID);
            return response_list;
        }
        else
        {
            return "Error 100024 ModuleId doesn't exist";
        }


    }

    private boolean checkModuleID(int moduleID) {

        try
        {
            String checkModuleID = "Select * from Module where ModuleID = " + moduleID;
            ResultSet rs = this.getResultSet(checkModuleID);
            if (rs.next())
            {
                conn.close();
                return true;

            }
            else {
                conn.close();
            }
        }
        catch(Exception ex)
        {
            System.out.println(""+ ex);
        }
        return false;
    }

    @CrossOrigin
    @RequestMapping("/allow-response-addition")
    public Object checkResponseExists(@RequestParam("moduleID") int moduleID, @RequestParam("emailAddress") String emailAddress)
    {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailAddress);
        if(matcher.matches())
        {
            this.getUserID(emailAddress);
            boolean shouldResponseBeAdded = true;
            if(userID != 0)
            {
                shouldResponseBeAdded = this.checkResponseInDB(userID, moduleID);
                userID = 0;
            }
            return  shouldResponseBeAdded;
        }
        else
        {
            return getException();
        }

    }

    private static String getException() {
        IllegalArgumentException ex =  new IllegalArgumentException("Incorrect Email Address format");
        return ex.getMessage();
    }

    @CrossOrigin
    @PostMapping(value = "/submit-feedback", consumes = "application/json")
    public Object submitFeedback(@RequestBody FeedbackRequestEntity feedback)
    {
        boolean shouldResponseBeAdded = (boolean) this.checkResponseExists(feedback.getModuleID(), feedback.getEmailAddress());

        if(shouldResponseBeAdded)
        {
            this.insertFeedbackToDB(feedback);
            return  true;
        }
        else
        {
            return false;
        }
    }

    private void insertFeedbackToDB(FeedbackRequestEntity feedback) {
        try
        {
            userID = 0;
            this.addUser(feedback.getEmailAddress());
            this.getUserID(feedback.getEmailAddress());
            String insertResponse = "Insert into response (Response, ModuleID, QuestionID, UserID) values (?,?,?,?)";
            MySQLDataConnection con = new MySQLDataConnection();
            conn =  con.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement prepareStatement = conn.prepareStatement(insertResponse);
            Iterator<RequestEntity> it = feedback.getRequestList().iterator();
            while(it.hasNext()){
                RequestEntity requestEntity = it.next();
                prepareStatement.setInt(2, feedback.getModuleID());
                prepareStatement.setInt(3,requestEntity.getQuestionID());
                prepareStatement.setInt(1,requestEntity.getResponse());
                prepareStatement.setInt(4, userID);
                prepareStatement.addBatch();
            }

            int [] numUpdates = prepareStatement.executeBatch();
            for (int i=0; i < numUpdates.length; i++) {
                if (numUpdates[i] == -2)
                    System.out.println("Execution " + i +
                            ": unknown number of rows updated");
                else
                    System.out.println("Execution " + i +
                            "successful: " + numUpdates[i] + " rows updated");
            }
            conn.commit();
        }
        catch (Exception ex)
        {
            System.out.print("" + ex);
        }
    }

    private void addUser(String emailAddress) {
        try
        {
            String insertUser =  "Insert into user (EmailAddress) values ('" + emailAddress + "')";
            this.getStatementObject().executeUpdate(insertUser);
        }
        catch (Exception ex)
        {
            System.out.print("" + ex);
        }
    }

    public void getUserID(String emailAddress)
    {
        try
        {
            String get_UserID = "SELECT * FROM User where EmailAddress = '" + emailAddress + "'";
            ResultSet rs = this.getResultSet(get_UserID);
            this.mapRow(rs, 'u');
            conn.close();
        }
        catch (Exception ex)
        {
            System.out.print(ex);
        }
    }

    public boolean checkResponseInDB(int userID, int moduleID)
    {
        try
        {
            String s = " AND moduleID = " + moduleID;
            String getResponse = "SELECT * FROM response where userID = " + userID + s;
            ResultSet rs =  this.getResultSet(getResponse);
            if(rs.next())
            {
                conn.close();
                return false;
            }
            else
            {
                conn.close();
                return true;
            }

        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }
        return true;
    }

    public void moduleBasedResponse(int moduleID)
    {
        try
        {
            String getResponseByModuleID = "SELECT Count(response.response) AS COUNT, response.Response, response.ModuleID, response.QuestionID, questionbank.Question  FROM response JOIN questionbank ON response.QuestionID=questionbank.QuestionID WHERE response.ModuleID = " + moduleID + " GROUP BY response.ModuleID,response.QuestionID";
            ResultSet rs = this.getResultSet(getResponseByModuleID);
            response_list.clear();
            this.mapRow(rs, 'n');
            conn.close();
        }
        catch (Exception ex)
        {
            System.out.println("" + ex);
        }
    }
    public Statement getStatementObject()
    {
        try
        {
            MySQLDataConnection con = new MySQLDataConnection();
            conn =  con.getConnection();
            return conn.createStatement();
        }
        catch(Exception ex)
        {
            System.out.println("" + ex);
        }
        return null;
    }

    public ResultSet getResultSet(String rsQuery) {
        try {
            return this.getStatementObject().executeQuery(rsQuery);
        }
        catch(Exception ex)
        {
            System.out.println("" + ex);
        }
        return null;
    }
    @Override
    public void getAllQuestions() {
        try
        {
            ResultSet rs = this.getResultSet(getAllQuestions);
            list_0f_questions.clear();
            this.mapRow(rs, 'q');
            conn.close();
        }
        catch(Exception ex)
        {
            System.out.println("" + ex);
        }
    }

    @Override
    public void getModuleList() {
        try
        {
            ResultSet rs = this.getResultSet(LIST_MODULES);
            list_0f_modules.clear();
            this.mapRow(rs, 'm');
            conn.close();
        }
        catch(Exception ex)
        {
            System.out.println("" + ex);
        }
    }

    public void mapRow(ResultSet rs, char type) throws SQLException {

        switch (type) {
            case 'm' : while(rs.next())
            {
                Modules m = new Modules(rs.getInt("ModuleID"), rs.getString("ModuleName"));
                list_0f_modules.add(m);
            }
                break;
            case 'n' : while(rs.next())
            {
                ModuleResponseEntity moduleResponseEntity = new ModuleResponseEntity();
                moduleResponseEntity.setCount(rs.getInt(1));
                moduleResponseEntity.setResponse(rs.getInt(2));
                moduleResponseEntity.setModuleID(rs.getInt(3));
                moduleResponseEntity.setQuestionID(rs.getInt(4));
                moduleResponseEntity.setQuestion(rs.getString(5));
                response_list.add(moduleResponseEntity);
            }
            case 'q': while(rs.next())
            {
                Questions questions = new Questions(rs.getInt("QuestionID"), rs.getString("Question"));
                list_0f_questions.add(questions);
            }
                break;
            case 'u' : if(rs.next())
            {
                userID =  rs.getInt(1);
            }
                break;
        }

    }
}
