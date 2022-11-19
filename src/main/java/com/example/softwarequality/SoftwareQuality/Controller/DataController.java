package com.example.softwarequality.SoftwareQuality.Controller;

import com.example.softwarequality.SoftwareQuality.DBFunctionInterface.QuestionInterface;
import com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity;
import com.example.softwarequality.SoftwareQuality.Data.Questions;
import com.example.softwarequality.SoftwareQuality.Data.Modules;
import com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@RestController
public class DataController implements QuestionInterface{
    private final String getAllQuestions = "SELECT *  FROM QUESTIONBANK";
    private final String LIST_MODULES = "SELECT * FROM MODULE";
    Connection conn;
    ArrayList<Questions> list_0f_questions = new ArrayList<>();
    ArrayList<Modules> list_0f_modules = new ArrayList<>();
    ArrayList<ModuleResponseEntity> response_list = new ArrayList<>();

    @RequestMapping("/get-questions")
    public List<Questions> getQuestions(){
        this.getAllQuestions();
        return list_0f_questions;
    }

    @RequestMapping("/get-modules")
    public List<Modules> getModules(){
        this.getModuleList();
        return list_0f_modules;
    }

    @RequestMapping("/get-module-response/")
    public List<ModuleResponseEntity> getModuleBasedResponse(@RequestParam("moduleID") int moduleID)
    {
        this.moduleBasedResponse(moduleID);
        return response_list;
    }

    public void moduleBasedResponse(int moduleID)
    {
        try
        {
            String getResponseByModuleID = "SELECT Count(response.response) AS COUNT, response.Response, response.ModuleID, response.QuestionID, questionbank.Question  FROM response JOIN questionbank ON response.QuestionID=questionbank.QuestionID WHERE response.ModuleID = " + moduleID + " GROUP BY response.ModuleID,response.QuestionID";
            ResultSet rs = this.getStatementObject().executeQuery(getResponseByModuleID);
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
    @Override
    public void getAllQuestions() {
        try
        {
            ResultSet rs = this.getStatementObject().executeQuery(getAllQuestions);
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
            ResultSet rs = this.getStatementObject().executeQuery(LIST_MODULES);
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
        }

    }
}
