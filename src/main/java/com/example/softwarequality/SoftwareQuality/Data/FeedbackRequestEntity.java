package com.example.softwarequality.SoftwareQuality.Data;

import java.util.ArrayList;
import java.util.List;

public class FeedbackRequestEntity {
    private int moduleID;
    private String emailAddress;
    private List<RequestEntity> requestList = new ArrayList<RequestEntity>();

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getModuleID() {
        return moduleID;
    }

    public void setModuleID(int moduleID) {
        this.moduleID = moduleID;
    }

    public List<RequestEntity> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<RequestEntity> requestList) {
        this.requestList = requestList;
    }
}
