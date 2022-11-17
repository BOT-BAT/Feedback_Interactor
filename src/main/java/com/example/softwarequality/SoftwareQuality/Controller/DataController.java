package com.example.softwarequality.SoftwareQuality.Controller;

import com.example.softwarequality.SoftwareQuality.DBFunctionInterface.QuestionInterface;
import com.example.softwarequality.SoftwareQuality.Data.Questions;
import com.example.softwarequality.SoftwareQuality.Data.Modules;
import com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@RestController
public class DataController implements QuestionInterface{
    private final String FIND_TOP1_QUESTION = "SELECT *  FROM QUESTIONBANK";

    private final String LIST_MODULES = "SELECT * FROM MODULE";
    ArrayList<Questions> list_0f_questions = new ArrayList<>();
    ArrayList<Modules> list_0f_modules = new ArrayList<>();

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

    @Override
    public void getAllQuestions() {
        try
        {
            MySQLDataConnection con = new MySQLDataConnection();
            Connection conn =  con.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(FIND_TOP1_QUESTION);
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
            MySQLDataConnection con = new MySQLDataConnection();
            Connection conn =  con.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(LIST_MODULES);
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
            case 'q': while(rs.next())
                    {
                        Questions questions = new Questions(rs.getInt("QuestionID"), rs.getString("Question"));
                        list_0f_questions.add(questions);
                    }
                    break;
        }

    }
}
