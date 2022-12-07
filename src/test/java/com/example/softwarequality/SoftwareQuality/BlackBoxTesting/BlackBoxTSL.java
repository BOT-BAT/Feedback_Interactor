package com.example.softwarequality.SoftwareQuality.BlackBoxTesting;

import com.example.softwarequality.SoftwareQuality.Controller.DataController;
import com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity;
import com.example.softwarequality.SoftwareQuality.Data.RequestEntity;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackBoxTSL {
    @Test
    void submitFeedbackWithFeedbackTest()
    {
        DataController DC  = new DataController();
        FeedbackRequestEntity feedbackRequestEntity = new FeedbackRequestEntity();
        feedbackRequestEntity.setModuleID(8);
        feedbackRequestEntity.setEmailAddress("rose@test.com");

        List<RequestEntity> reqEntityList = new ArrayList<>();

        for(int i = 4; i <=10; i++){
            RequestEntity reqEntity =  new RequestEntity();
            reqEntity.setQuestionID(i);
            reqEntity.setResponse((int) ((Math.random() * (5 - 1)) + 1));
            reqEntityList.add(reqEntity);
        }
        feedbackRequestEntity.setRequestList(reqEntityList);

        boolean responseReturnedByFunction  = (boolean) DC.submitFeedback(feedbackRequestEntity);
        assertEquals(responseReturnedByFunction, false);
    }
}