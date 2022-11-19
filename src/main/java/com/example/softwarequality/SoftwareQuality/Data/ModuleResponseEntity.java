package com.example.softwarequality.SoftwareQuality.Data;

public class ModuleResponseEntity {

    private int response, count, moduleID, questionID;
    private String question;

    public void setResponse(int response) {
        this.response = response;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setModuleID(int moduleID) {
        this.moduleID = moduleID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public int getResponse() {
        return response;
    }

    public int getCount() {
        return count;
    }

    public int getModuleID() {
        return moduleID;
    }

    public int getQuestionID() {
        return questionID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
