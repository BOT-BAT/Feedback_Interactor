import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    package com.example.softwarequality.SoftwareQuality;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

    @SpringBootTest
    class RegressionTest0 {
        public static boolean debug = false;

        @Test
        public void test01() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test01");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity1 = null;
            // The following exception was thrown during execution in test generation
            try {
                java.lang.Object obj2 = dataController0.submitFeedback(feedbackRequestEntity1);
                org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity.getModuleID()\" because \"feedback\" is null");
            } catch (java.lang.NullPointerException e) {
                // Expected exception.
            }
        }

        @Test
        public void test02() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test02");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            java.lang.Object obj2 = dataController0.getModuleBasedResponse((int) (byte) 1);
            java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList3 = dataController0.getModules();
            java.lang.Class<?> wildcardClass4 = dataController0.getClass();
            org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj2, "Error 100024 ModuleId doesn't exist");
            org.junit.Assert.assertNotNull(modulesList3);
            org.junit.Assert.assertNotNull(wildcardClass4);
        }

        @Test
        public void test03() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test03");
            java.util.regex.Pattern pattern0 = com.example.softwarequality.SoftwareQuality.Controller.DataController.VALID_EMAIL_ADDRESS_REGEX;
            org.junit.Assert.assertNotNull(pattern0);
            org.junit.Assert.assertEquals(pattern0.toString(), "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
        }

        @Test
        public void test04() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test04");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            java.lang.Object obj3 = dataController0.checkResponseExists(1, "Error 100024 ModuleId doesn't exist");
            org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "Incorrect Email Address format" + "'", obj3, "Incorrect Email Address format");
        }

        @Test
        public void test05() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test05");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            java.lang.Object obj2 = dataController0.getModuleBasedResponse((int) (byte) 1);
            boolean boolean5 = dataController0.checkResponseInDB((int) 'a', (int) 'a');
            org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj2, "Error 100024 ModuleId doesn't exist");
            org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        }

        @Test
        public void test06() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test06");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            dataController0.getAllQuestions();
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity2 = null;
            // The following exception was thrown during execution in test generation
            try {
                java.lang.Object obj3 = dataController0.submitFeedback(feedbackRequestEntity2);
                org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity.getModuleID()\" because \"feedback\" is null");
            } catch (java.lang.NullPointerException e) {
                // Expected exception.
            }
        }

        @Test
        public void test07() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test07");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            java.lang.Object obj2 = dataController0.getModuleBasedResponse((int) (byte) 1);
            java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList3 = dataController0.getModules();
            dataController0.moduleBasedResponse((int) (byte) -1);
            org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj2, "Error 100024 ModuleId doesn't exist");
            org.junit.Assert.assertNotNull(modulesList3);
        }

        @Test
        public void test08() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test08");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            java.lang.Object obj2 = dataController0.getModuleBasedResponse((int) (byte) 1);
            java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList3 = dataController0.getModules();
            java.sql.ResultSet resultSet4 = null;
            dataController0.mapRow(resultSet4, '4');
            java.lang.Class<?> wildcardClass7 = dataController0.getClass();
            org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj2, "Error 100024 ModuleId doesn't exist");
            org.junit.Assert.assertNotNull(modulesList3);
            org.junit.Assert.assertNotNull(wildcardClass7);
        }

        @Test
        public void test09() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test09");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            dataController0.getModuleList();
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity2 = null;
            // The following exception was thrown during execution in test generation
            try {
                java.lang.Object obj3 = dataController0.submitFeedback(feedbackRequestEntity2);
                org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity.getModuleID()\" because \"feedback\" is null");
            } catch (java.lang.NullPointerException e) {
                // Expected exception.
            }
        }

        @Test
        public void test10() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test10");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            dataController0.getAllQuestions();
            java.sql.ResultSet resultSet2 = null;
            dataController0.mapRow(resultSet2, ' ');
        }

        @Test
        public void test11() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test11");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            dataController0.getModuleList();
            dataController0.getAllQuestions();
            java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList3 = dataController0.getQuestions();
            org.junit.Assert.assertNotNull(questionsList3);
        }

        @Test
        public void test12() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test12");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            dataController0.moduleBasedResponse((int) (byte) 10);
            java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList3 = dataController0.getModules();
            org.junit.Assert.assertNotNull(modulesList3);
        }

        @Test
        public void test13() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test13");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList1 = dataController0.getQuestions();
            org.junit.Assert.assertNotNull(questionsList1);
        }

        @Test
        public void test14() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test14");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            java.lang.Object obj2 = dataController0.getModuleBasedResponse((int) (byte) 1);
            java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList3 = dataController0.getModules();
            java.sql.ResultSet resultSet4 = null;
            dataController0.mapRow(resultSet4, '4');
            dataController0.getAllQuestions();
            org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj2, "Error 100024 ModuleId doesn't exist");
            org.junit.Assert.assertNotNull(modulesList3);
        }

        @Test
        public void test15() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test15");
            com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
            dataController0.getModuleList();
            dataController0.getAllQuestions();
            java.sql.ResultSet resultSet3 = null;
            dataController0.mapRow(resultSet3, '4');
            dataController0.getUserID("Incorrect Email Address format");
            java.sql.ResultSet resultSet9 = dataController0.getResultSet("Error 100024 ModuleId doesn't exist");
            org.junit.Assert.assertNull(resultSet9);
        }

        @Test
        public void test16() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test16");
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
            java.lang.Class<?> wildcardClass1 = feedbackRequestEntity0.getClass();
            org.junit.Assert.assertNotNull(wildcardClass1);
        }

        @Test
        public void test17() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test17");
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
            feedbackRequestEntity0.setEmailAddress("hi!");
        }

        @Test
        public void test18() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test18");
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
            int int1 = feedbackRequestEntity0.getModuleID();
            java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
            feedbackRequestEntity0.setModuleID((int) 'a');
            java.lang.Class<?> wildcardClass5 = feedbackRequestEntity0.getClass();
            org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
            org.junit.Assert.assertNull(str2);
            org.junit.Assert.assertNotNull(wildcardClass5);
        }

        @Test
        public void test19() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test19");
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
            int int1 = feedbackRequestEntity0.getModuleID();
            java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
            feedbackRequestEntity0.setModuleID((int) 'a');
            java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList5 = feedbackRequestEntity0.getRequestList();
            java.lang.String str6 = feedbackRequestEntity0.getEmailAddress();
            org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
            org.junit.Assert.assertNull(str2);
            org.junit.Assert.assertNotNull(requestEntityList5);
            org.junit.Assert.assertNull(str6);
        }

        @Test
        public void test20() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test20");
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
            int int1 = feedbackRequestEntity0.getModuleID();
            java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
            feedbackRequestEntity0.setModuleID((int) (short) 1);
            org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
            org.junit.Assert.assertNull(str2);
        }

        @Test
        public void test21() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test21");
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
            int int1 = feedbackRequestEntity0.getModuleID();
            java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
            int int3 = feedbackRequestEntity0.getModuleID();
            org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
            org.junit.Assert.assertNull(str2);
            org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        }

        @Test
        public void test22() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test22");
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
            int int1 = feedbackRequestEntity0.getModuleID();
            java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
            feedbackRequestEntity0.setModuleID((int) 'a');
            java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList5 = feedbackRequestEntity0.getRequestList();
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity6 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
            int int7 = feedbackRequestEntity6.getModuleID();
            java.lang.String str8 = feedbackRequestEntity6.getEmailAddress();
            feedbackRequestEntity6.setModuleID((int) 'a');
            java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList11 = feedbackRequestEntity6.getRequestList();
            feedbackRequestEntity0.setRequestList(requestEntityList11);
            org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
            org.junit.Assert.assertNull(str2);
            org.junit.Assert.assertNotNull(requestEntityList5);
            org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
            org.junit.Assert.assertNull(str8);
            org.junit.Assert.assertNotNull(requestEntityList11);
        }

        @Test
        public void test23() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test23");
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
            int int1 = feedbackRequestEntity0.getModuleID();
            java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
            com.example.softwarequality.SoftwareQuality.Data.RequestEntity[] requestEntityArray3 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity[] {};
            java.util.ArrayList<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList4 = new java.util.ArrayList<com.example.softwarequality.SoftwareQuality.Data.RequestEntity>();
            boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.example.softwarequality.SoftwareQuality.Data.RequestEntity>) requestEntityList4, requestEntityArray3);
            feedbackRequestEntity0.setRequestList((java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity>) requestEntityList4);
            org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
            org.junit.Assert.assertNull(str2);
            org.junit.Assert.assertNotNull(requestEntityArray3);
            org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        }

        @Test
        public void test24() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test24");
            com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
            java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList1 = feedbackRequestEntity0.getRequestList();
            java.lang.Class<?> wildcardClass2 = feedbackRequestEntity0.getClass();
            org.junit.Assert.assertNotNull(requestEntityList1);
            org.junit.Assert.assertNotNull(wildcardClass2);
        }

        @Test
        public void test25() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test25");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) (byte) 1);
            moduleResponseEntity0.setQuestion("");
        }

        @Test
        public void test26() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test26");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) '4');
            int int3 = moduleResponseEntity0.getResponse();
            org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        }

        @Test
        public void test27() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test27");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setQuestionID((int) '4');
        }

        @Test
        public void test28() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test28");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) (byte) 1);
            moduleResponseEntity0.setQuestionID((int) 'a');
            int int5 = moduleResponseEntity0.getResponse();
            java.lang.String str6 = moduleResponseEntity0.getQuestion();
            int int7 = moduleResponseEntity0.getModuleID();
            org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
            org.junit.Assert.assertNull(str6);
            org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        }

        @Test
        public void test29() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test29");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) (byte) 1);
            moduleResponseEntity0.setQuestionID((int) 'a');
            int int5 = moduleResponseEntity0.getResponse();
            int int6 = moduleResponseEntity0.getQuestionID();
            java.lang.String str7 = moduleResponseEntity0.getQuestion();
            org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
            org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
            org.junit.Assert.assertNull(str7);
        }

        @Test
        public void test30() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test30");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) (byte) 1);
            moduleResponseEntity0.setQuestionID((int) 'a');
            int int5 = moduleResponseEntity0.getModuleID();
            moduleResponseEntity0.setCount((int) (short) 0);
            org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        }

        @Test
        public void test31() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test31");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) (byte) 1);
            moduleResponseEntity0.setCount((int) (byte) 10);
            int int5 = moduleResponseEntity0.getCount();
            org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        }

        @Test
        public void test32() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test32");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) '4');
            int int3 = moduleResponseEntity0.getModuleID();
            moduleResponseEntity0.setQuestionID((int) '4');
            org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        }

        @Test
        public void test33() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test33");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) (byte) 1);
            moduleResponseEntity0.setQuestionID((int) 'a');
            moduleResponseEntity0.setModuleID((int) ' ');
            moduleResponseEntity0.setQuestionID((int) (byte) -1);
        }

        @Test
        public void test34() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test34");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) (byte) 1);
            moduleResponseEntity0.setQuestionID((int) 'a');
            int int5 = moduleResponseEntity0.getResponse();
            int int6 = moduleResponseEntity0.getQuestionID();
            int int7 = moduleResponseEntity0.getQuestionID();
            org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
            org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
            org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        }

        @Test
        public void test35() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test35");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) (byte) 1);
            moduleResponseEntity0.setQuestionID((int) 'a');
            int int5 = moduleResponseEntity0.getResponse();
            int int6 = moduleResponseEntity0.getQuestionID();
            int int7 = moduleResponseEntity0.getResponse();
            moduleResponseEntity0.setQuestionID((int) (short) 100);
            org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
            org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
            org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        }

        @Test
        public void test36() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test36");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) (byte) 1);
            int int3 = moduleResponseEntity0.getCount();
            org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        }

        @Test
        public void test37() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test37");
            com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
            moduleResponseEntity0.setCount((int) (byte) 1);
            moduleResponseEntity0.setCount((int) (byte) 10);
            int int5 = moduleResponseEntity0.getQuestionID();
            org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        }

        @Test
        public void test38() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test38");
            java.lang.Object obj0 = new java.lang.Object();
            java.lang.Class<?> wildcardClass1 = obj0.getClass();
            org.junit.Assert.assertNotNull(wildcardClass1);
        }

        @Test
        public void test39() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test39");
            com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (short) 100, "hi!");
        }

        @Test
        public void test40() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test40");
            com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
            int int3 = modules2.getModuleID();
            java.lang.Class<?> wildcardClass4 = modules2.getClass();
            org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
            org.junit.Assert.assertNotNull(wildcardClass4);
        }

        @Test
        public void test41() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test41");
            com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
            int int3 = modules2.getModuleID();
            modules2.setModule("hi!");
            modules2.setModuleID((int) (short) 0);
            java.lang.Class<?> wildcardClass8 = modules2.getClass();
            org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
            org.junit.Assert.assertNotNull(wildcardClass8);
        }

        @Test
        public void test42() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test42");
            com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (byte) -1, "hi!");
        }

        @Test
        public void test43() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test43");
            com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
            int int3 = modules2.getModuleID();
            java.lang.String str4 = modules2.getModule();
            modules2.setModule("");
            org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
            org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        }

        @Test
        public void test44() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test44");
            com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) 'a', "hi!");
            modules2.setModuleID((int) ' ');
            modules2.setModuleID((-1));
            java.lang.String str7 = modules2.getModule();
            org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        }

        @Test
        public void test45() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test45");
            com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) 'a', "hi!");
            modules2.setModuleID((int) ' ');
            modules2.setModuleID((int) '4');
        }

        @Test
        public void test46() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test46");
            com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
            modules2.setModuleID((int) (short) 0);
            java.lang.String str5 = modules2.getModule();
            modules2.setModule("");
            org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        }

        @Test
        public void test47() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test47");
            com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
            modules2.setModuleID((int) (short) 0);
            java.lang.String str5 = modules2.getModule();
            modules2.setModule("hi!");
            org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        }

        @Test
        public void test48() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test48");
            java.lang.Object obj0 = new java.lang.Object();
            java.lang.Class<?> wildcardClass1 = obj0.getClass();
            org.junit.Assert.assertNotNull(wildcardClass1);
        }

        @Test
        public void test49() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test49");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
            questions0.setQuesText("");
            int int3 = questions0.getQuestionID();
            questions0.setQuesText("hi!");
            org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        }

        @Test
        public void test50() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test50");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
            questions0.setQuesText("");
            int int3 = questions0.getQuestionID();
            java.lang.Class<?> wildcardClass4 = questions0.getClass();
            org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
            org.junit.Assert.assertNotNull(wildcardClass4);
        }

        @Test
        public void test51() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test51");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
            questions0.setQuesText("");
            questions0.setQuestionID(0);
            questions0.setQuesText("");
            java.lang.Class<?> wildcardClass7 = questions0.getClass();
            org.junit.Assert.assertNotNull(wildcardClass7);
        }

        @Test
        public void test52() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test52");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
            questions0.setQuesText("");
            questions0.setQuestionID(0);
            questions0.setQuesText("");
            questions0.setQuestionID((int) (short) 0);
        }

        @Test
        public void test53() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test53");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions((int) 'a', "hi!");
            questions2.setQuestionID((int) ' ');
        }

        @Test
        public void test54() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test54");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
            questions0.setQuesText("");
            questions0.setQuestionID((-1));
        }

        @Test
        public void test55() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test55");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
            int int1 = questions0.getQuestionID();
            java.lang.String str2 = questions0.getQuesText();
            org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
            org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        }

        @Test
        public void test56() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test56");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions((int) 'a', "hi!");
            questions2.setQuestionID((int) (short) 0);
        }

        @Test
        public void test57() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test57");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions((int) (byte) -1, "hi!");
        }

        @Test
        public void test58() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test58");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
            questions0.setQuesText("");
            questions0.setQuestionID(0);
            questions0.setQuesText("");
            int int7 = questions0.getQuestionID();
            questions0.setQuesText("hi!");
            questions0.setQuesText("");
            org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        }

        @Test
        public void test59() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test59");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
            java.lang.String str1 = questions0.getQuesText();
            org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        }

        @Test
        public void test60() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test60");
            com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
            questions0.setQuesText("");
            questions0.setQuestionID(0);
            questions0.setQuesText("");
            java.lang.String str7 = questions0.getQuesText();
            questions0.setQuestionID((int) '4');
            org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        }

        @Test
        public void test61() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test61");
            java.lang.Object obj0 = new java.lang.Object();
            java.lang.Class<?> wildcardClass1 = obj0.getClass();
            org.junit.Assert.assertNotNull(wildcardClass1);
        }

        @Test
        public void test62() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test62");
            com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
            int int1 = requestEntity0.getQuestionID();
            int int2 = requestEntity0.getResponse();
            org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
            org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        }

        @Test
        public void test63() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test63");
            com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
            requestEntity0.setQuestionID((int) (byte) 1);
            requestEntity0.setResponse((int) '4');
            requestEntity0.setQuestionID((int) (short) 1);
            int int7 = requestEntity0.getQuestionID();
            int int8 = requestEntity0.getQuestionID();
            int int9 = requestEntity0.getResponse();
            org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
            org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
            org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        }

        @Test
        public void test64() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test64");
            com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
            requestEntity0.setQuestionID((int) (byte) 1);
            requestEntity0.setResponse((int) '4');
            requestEntity0.setQuestionID((int) (short) 1);
            int int7 = requestEntity0.getQuestionID();
            int int8 = requestEntity0.getQuestionID();
            requestEntity0.setQuestionID((int) (byte) 10);
            org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
            org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        }

        @Test
        public void test65() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test65");
            com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
            requestEntity0.setQuestionID((int) (byte) 1);
            requestEntity0.setResponse((int) '4');
            requestEntity0.setQuestionID((int) (short) 1);
            int int7 = requestEntity0.getQuestionID();
            requestEntity0.setQuestionID((int) (short) 0);
            requestEntity0.setResponse((int) '4');
            org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        }

        @Test
        public void test66() throws Throwable {
            if (debug)
                System.out.format("%n%s%n", "RegressionTest0.test66");
            com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
            requestEntity0.setQuestionID((int) (byte) 1);
            requestEntity0.setResponse((int) '4');
            requestEntity0.setQuestionID((int) (short) 1);
            requestEntity0.setQuestionID((int) '4');
            requestEntity0.setResponse(0);
        }


    }

}

