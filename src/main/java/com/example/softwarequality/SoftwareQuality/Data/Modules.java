package com.example.softwarequality.SoftwareQuality.Data;

public class Modules {

    private int moduleID;

    private String module;

    public Modules(int moduleID, String module) {
        this.moduleID = moduleID;
        this.module = module;
    }

    public int getModuleID() {
        return moduleID;
    }

    public void setModuleID(int moduleID) {
        this.moduleID = moduleID;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
