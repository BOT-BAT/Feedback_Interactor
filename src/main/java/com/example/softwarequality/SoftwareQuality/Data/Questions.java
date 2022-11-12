package com.example.softwarequality.SoftwareQuality.Data;

public class Questions {

    public Questions(String questions) {
        this.questions_in_db = questions;
    }

    public String getQuestions() {
        return questions_in_db;
    }

    public void setQuestions(String questions) {
        this.questions_in_db = questions;
    }

    private String questions_in_db;
}
