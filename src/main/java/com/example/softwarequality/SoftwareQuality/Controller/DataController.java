package com.example.softwarequality.SoftwareQuality.Controller;

import com.example.softwarequality.SoftwareQuality.DBFunctionInterface.QuestionInterface;
import com.example.softwarequality.SoftwareQuality.Data.Questions;
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
    ArrayList<Questions> list_0f_questions = new ArrayList<>();

    @RequestMapping("/get-questions")
    public List<Questions> getQuestions(){
        this.getAllQuestions();
        return list_0f_questions;
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
            this.mapRow(rs);
            conn.close();
        }
        catch(Exception ex)
        {
            System.out.println("" + ex);
        }
    }

    public void mapRow(ResultSet rs) throws SQLException {

        while(rs.next())
        {
            Questions questions = new Questions(rs.getInt("QuestionID"), rs.getString("Question"));
            list_0f_questions.add(questions);
        }
    }
}
