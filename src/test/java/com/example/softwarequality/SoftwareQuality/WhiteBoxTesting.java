package com.example.softwarequality.SoftwareQuality;

import com.example.softwarequality.SoftwareQuality.Controller.DataController;
import com.example.softwarequality.SoftwareQuality.Data.*;
import com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;

class WhiteBoxTesting {


    MySQLDataConnection dbConnection = Mockito.mock(MySQLDataConnection.class);
    public Connection dummyConnection()
    {
        Connection con = null;
        String connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem_whitebox?useSSL=false";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(connectionUrl,"root","admin");
        }
        catch (Exception ex)
        {
            System.out.println("" + ex);
        }
        return con;
    }


    @Test
    void getQuestionsTest() {
        DataController dataController = getDataControllerWithDummyConnection();
        String listReturnedByFunction = new Gson().toJson(dataController.getQuestions());
        String dummyList = "[{\"quesText\":\"I feel part of a community of students and staff in this module\",\"questionID\":4},{\"quesText\":\"The module is well organised and is running smoothly\",\"questionID\":5},{\"quesText\":\"I understand what I need to do for my assessment(s) in this module\",\"questionID\":6},{\"quesText\":\"My programme provides me with opportunities to apply what I have learnt\",\"questionID\":7},{\"quesText\":\"Feedback has enabled me to improve my future work\",\"questionID\":8},{\"quesText\":\"Marking and assessment has been fair\",\"questionID\":9},{\"quesText\":\"I have been able to access programme-specific resources (e.g. equipment, facilities, software, library collections) when I needed to\",\"questionID\":10}]";
        assertEquals(listReturnedByFunction, dummyList);
    }

    private DataController getDataControllerWithDummyConnection() {
        DataController dataController  = new DataController(dbConnection);
        when(dbConnection.getConnection()).thenReturn(this.dummyConnection());
        return dataController;
    }

    @Test
    void getQuestionsWithNullConnectionTest() {
        DataController dataController = getDataControllerWithNullConnection();
        String listReturnedByFunction = new Gson().toJson(dataController.getQuestions());
        String dummyList = "[]";
        assertEquals(listReturnedByFunction, dummyList);
    }

    private DataController getDataControllerWithNullConnection() {
        DataController dataController  = new DataController(dbConnection);
        when(dbConnection.getConnection()).thenReturn(null);
        return dataController;
    }

    @Test
    void getModulesTestWithConnectionObjectTest()
    {
        DataController dataController  = getDataControllerWithDummyConnection();
        String listReturnedByFunction = new Gson().toJson(dataController.getModules());
        String dummyList = "[{\"moduleID\":8,\"module\":\"CO3095, CO7095 Software Measurement and Quality Assurance\"},{\"moduleID\":9,\"module\":\"CO3105/CO4105/CO7105 C++ Programming\"},{\"moduleID\":10,\"module\":\"CO4215-CO7215-CO7515 Advanced Web Technologies\"},{\"moduleID\":11,\"module\":\"CO4219/CO7219 Internet and Cloud Computing\"},{\"moduleID\":12,\"module\":\"CO3102-CO7102 Mobile and Web Applications\"}]";
        assertEquals(listReturnedByFunction, dummyList);
    }
    @Test
    void getModulesTestWithNullConnectionObjectTest()
    {
        DataController dataController  = getDataControllerWithNullConnection();
        String listReturnedByFunction = new Gson().toJson(dataController.getModules());
        String dummyList = "[]";
        assertEquals(listReturnedByFunction, dummyList);
    }



    @Test
    void getModuleBasedResponseWithConnectionObjectTest()
    {
        DataController dataController  = getDataControllerWithDummyConnection();
        String listReturnedByFunction = new Gson().toJson(dataController.getModuleBasedResponse(9));
        String dummyList = "[{\"response\":2,\"count\":1,\"moduleID\":9,\"questionID\":4,\"question\":\"I feel part of a community of students and staff in this module\"},{\"response\":4,\"count\":1,\"moduleID\":9,\"questionID\":5,\"question\":\"The module is well organised and is running smoothly\"},{\"response\":3,\"count\":1,\"moduleID\":9,\"questionID\":6,\"question\":\"I understand what I need to do for my assessment(s) in this module\"},{\"response\":5,\"count\":1,\"moduleID\":9,\"questionID\":7,\"question\":\"My programme provides me with opportunities to apply what I have learnt\"},{\"response\":1,\"count\":1,\"moduleID\":9,\"questionID\":8,\"question\":\"Feedback has enabled me to improve my future work\"},{\"response\":3,\"count\":1,\"moduleID\":9,\"questionID\":9,\"question\":\"Marking and assessment has been fair\"},{\"response\":4,\"count\":1,\"moduleID\":9,\"questionID\":10,\"question\":\"I have been able to access programme-specific resources (e.g. equipment, facilities, software, library collections) when I needed to\"}]";
        assertEquals(listReturnedByFunction, dummyList);
    }

    @Test
    void getModuleBasedResponseWithModuleIDNotInDBTest()
    {
        DataController dataController  = getDataControllerWithDummyConnection();
        String errorReturnedByFunction = dataController.getModuleBasedResponse(1).toString();
        String dummyError = "Error 100024 ModuleId doesn't exist";
        assertEquals(errorReturnedByFunction, dummyError);
    }


    @Test
    void checkResponseExistsWithIncorrectEmailAddressTest()
    {
        DataController dataController  = getDataControllerWithNullConnection();
        String errorReturnedByFunction = dataController.checkResponseExists(8, "xyz").toString();
        String dummyError = "Incorrect Email Address format";
        assertEquals(errorReturnedByFunction, dummyError);
    }

    @Test
    void checkResponseExistsWithDataInDBTest()
    {
        DataController dataController  = getDataControllerWithDummyConnection();
        boolean responseReturnedByFunction = (boolean) dataController.checkResponseExists(8, "xyz@test.com");
        boolean dummyResponseShouldNotBeAdded = false;
        assertEquals(responseReturnedByFunction, dummyResponseShouldNotBeAdded);
    }

    @Test
    void checkResponseExistsWithDataNotInDBTest()
    {
        DataController dataController  = getDataControllerWithDummyConnection();
        boolean responseReturnedByFunction = (boolean) dataController.checkResponseExists(9, "xyz@test.com");
        boolean dummyResponseShouldNotBeAdded = true;
        assertEquals(responseReturnedByFunction, dummyResponseShouldNotBeAdded);
    }

    @Test
    void checkMySQLDataConnectionGetConnectionTest()
    {
        MySQLDataConnection mySQLDataConnection  = new MySQLDataConnection();
        Object objectReturnedByFunction = mySQLDataConnection.getConnection();
        if(objectReturnedByFunction instanceof Connection)
            assertTrue(true);

        else
            assertTrue(false);
    }

    @Test
    void checkMySQLDataConnectionGetConnectionWithNullTest()
    {
        MySQLDataConnection mySQLDataConnection  = new MySQLDataConnection();
        mySQLDataConnection.connectionUrl = "";
        Object objectReturnedByFunction = mySQLDataConnection.getConnection();
        if(objectReturnedByFunction == null)
            assertTrue(true);

        else
            assertTrue(false);
    }

    public String generateRandomEmail()
    {
        String emailAddress = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while (emailAddress.length() < 5) {
            int character = (int) (Math.random() * 26);
            emailAddress += alphabet.substring(character, character + 1);
            emailAddress += Integer.valueOf((int) (Math.random() * 99)).toString();
            emailAddress += "@" + "whiteboxtest.com";
        }
        return emailAddress;
    }
    @Test
    void submitFeedbackTest()
    {
        DataController dataController  = new DataController(dbConnection);
        when(dbConnection.getConnection()).thenReturn(this.dummyConnection());
        FeedbackRequestEntity feedbackRequestEntity = new FeedbackRequestEntity();
        feedbackRequestEntity.setModuleID(8);
        feedbackRequestEntity.setEmailAddress(this.generateRandomEmail());
        setRequestEntity(feedbackRequestEntity);

        boolean responseReturnedByFunction  = (boolean) dataController.submitFeedback(feedbackRequestEntity);
        assertEquals(responseReturnedByFunction, true);
    }

    @Test
    void submitFeedbackWithFeedbackInDBTest()
    {
        DataController dataController  = new DataController(dbConnection);
        when(dbConnection.getConnection()).thenReturn(this.dummyConnection());
        FeedbackRequestEntity feedbackRequestEntity = new FeedbackRequestEntity();
        feedbackRequestEntity.setModuleID(8);
        feedbackRequestEntity.setEmailAddress("xyz@test.com");
        setRequestEntity(feedbackRequestEntity);

        boolean responseReturnedByFunction  = (boolean) dataController.submitFeedback(feedbackRequestEntity);
        assertEquals(responseReturnedByFunction, false);
    }

    private void setRequestEntity(FeedbackRequestEntity feedbackRequestEntity) {
        List<RequestEntity> requestEntityList = new ArrayList<>();

        for(int i = 4; i <=10; i++){
            RequestEntity requestEntity =  new RequestEntity();
            requestEntity.setQuestionID(i);
            requestEntity.setResponse((int) ((Math.random() * (5 - 1)) + 1));
            requestEntityList.add(requestEntity);
        }

        feedbackRequestEntity.setRequestList(requestEntityList);
    }

    @Test
    public void testEntryOfApplication()
    {
        SoftwareQualityApplication softwareQualityApplication = new SoftwareQualityApplication();
    }

    @Test
    public void checkModuleResponseEntityTest()
    {
        Modules module = new Modules(1, "testModule");
        assertEquals(module.getModuleID(), 1);
        assertEquals(module.getModule(), "testModule");
        module.setModuleID(2);
        assertEquals(module.getModuleID(), 2);
        module.setModule("testModule2");
        assertEquals(module.getModule(), "testModule2");
    }
    @Test
    public void checkQuestionsTest()
    {
        Questions questions = new Questions();
        assertEquals(questions.getQuestionID(), 0);
        assertEquals(questions.getQuesText(), "");
        questions.setQuestionID(2);
        assertEquals(questions.getQuestionID(), 2);
        questions.setQuesText("testquestion?");
        assertEquals(questions.getQuesText(), "testquestion?");
    }

    @Test
    public void checkModuleResponseTest()
    {
        ModuleResponseEntity moduleResponseEntity = new ModuleResponseEntity();

        moduleResponseEntity.setQuestion("Do you like WhiteBox Testing?");
        assertEquals(moduleResponseEntity.getQuestion(), "Do you like WhiteBox Testing?");

        moduleResponseEntity.setCount(2);
        assertEquals(moduleResponseEntity.getCount(), 2);

        moduleResponseEntity.setModuleID(8);
        assertEquals(moduleResponseEntity.getModuleID(), 8);

        moduleResponseEntity.setQuestionID(5);
        assertEquals(moduleResponseEntity.getQuestionID(), 5);

        moduleResponseEntity.setResponse(3);
        assertEquals(moduleResponseEntity.getResponse(), 3);

    }
}




