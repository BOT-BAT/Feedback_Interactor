package com.example.softwarequality.SoftwareQuality.Data;


public class Questions {

    public Questions(int questionID, String question)
    {
        this.questionID = questionID;
        this.question = question;
    }
    public Questions()
    {
        this.questionID = 0;
        this.question = "";
    }
    public String getQuestions()
    {
        return question;
    }

    public void setQuestions(String question)
    {
        this.question = question;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    private String question;
    private int questionID;

}
