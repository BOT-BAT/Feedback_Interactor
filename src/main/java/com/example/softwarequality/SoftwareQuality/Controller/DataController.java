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
import java.util.List;
@RestController
public class DataController implements QuestionInterface{
    private final String FIND_TOP1_QUESTION = "SELECT *  FROM QUESTIONBANK LIMIT 1";
    Questions qs =  new Questions();
    @RequestMapping("/get-questions")
    public Questions getQuestions(){
        this.getQuestion();
        return qs;
    }

    @Override
    public void getQuestion() {
        try
        {
            MySQLDataConnection con = new MySQLDataConnection();
            Connection conn =  con.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(FIND_TOP1_QUESTION);
            qs = this.mapRow(rs, 1);
            conn.close();
        }
        catch(Exception ex)
        {
            System.out.println("" + ex);
        }
    }

    @Override
    public List<Questions> getAllQuestionns() {
        return null;
    }

    public Questions mapRow(ResultSet rs, int rowNum) throws SQLException {
        Questions questions = new Questions();
        if(rs.next())
        {
            questions.setQuestions(rs.getString("Question"));
        }
        return questions;
    }
}
