package com.example.softwarequality.SoftwareQuality.Data;


public class Questions {

    public Questions(int questionID, String question)
    {
        this.questionID = questionID;
        this.quesText = question;
    }
    public Questions()
    {
        this.questionID = 0;
        this.quesText = "";
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getQuesText() {
        return quesText;
    }

    public void setQuesText(String quesText) {
        this.quesText = quesText;
    }

    private String quesText;
    private int questionID;

}
