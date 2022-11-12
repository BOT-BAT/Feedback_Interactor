package com.example.softwarequality.SoftwareQuality.Controller;

import com.example.softwarequality.SoftwareQuality.Data.Questions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @RequestMapping("/get-questions")
    public Questions getQuestion(){
        Questions qs =  new Questions("Was your data good?");
        return qs;
    }
}
