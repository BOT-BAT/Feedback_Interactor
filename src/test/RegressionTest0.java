import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList1 = dataController0.getQuestions();
        org.junit.Assert.assertNotNull(questionsList1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.getModuleList();
        dataController0.getAllQuestions();
        java.sql.Statement statement3 = dataController0.getStatementObject();
        org.junit.Assert.assertNull(statement3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.moduleBasedResponse((int) (byte) 10);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList3 = dataController0.getModules();
        java.lang.Class<?> wildcardClass4 = dataController0.getClass();
        org.junit.Assert.assertNotNull(modulesList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.getAllQuestions();
        java.sql.ResultSet resultSet2 = null;
        dataController0.mapRow(resultSet2, ' ');
        dataController0.getModuleList();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.lang.Object obj2 = dataController0.getModuleBasedResponse((int) (byte) 1);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList3 = dataController0.getModules();
        java.sql.ResultSet resultSet4 = null;
        dataController0.mapRow(resultSet4, '4');
        dataController0.getAllQuestions();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList8 = dataController0.getQuestions();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj2, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertNotNull(modulesList3);
        org.junit.Assert.assertNotNull(questionsList8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.getAllQuestions();
        java.sql.ResultSet resultSet2 = null;
        dataController0.mapRow(resultSet2, ' ');
        dataController0.getUserID("");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.moduleBasedResponse((int) (byte) 10);
        java.lang.Object obj5 = dataController0.checkResponseExists(100, "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Incorrect Email Address format" + "'", obj5, "Incorrect Email Address format");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.lang.Object obj2 = dataController0.getModuleBasedResponse((int) (byte) 1);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList3 = dataController0.getModules();
        java.sql.ResultSet resultSet4 = null;
        dataController0.mapRow(resultSet4, '4');
        dataController0.getAllQuestions();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList8 = dataController0.getModules();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj2, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertNotNull(modulesList3);
        org.junit.Assert.assertNotNull(modulesList8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.moduleBasedResponse((int) (byte) 10);
        dataController0.moduleBasedResponse(0);
        java.sql.Statement statement5 = dataController0.getStatementObject();
        org.junit.Assert.assertNull(statement5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.getModuleList();
        dataController0.getAllQuestions();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList3 = dataController0.getQuestions();
        java.lang.Class<?> wildcardClass4 = questionsList3.getClass();
        org.junit.Assert.assertNotNull(questionsList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.getAllQuestions();
        java.sql.ResultSet resultSet2 = null;
        dataController0.mapRow(resultSet2, ' ');
        java.lang.Object obj6 = dataController0.getModuleBasedResponse(0);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj6, "Error 100024 ModuleId doesn't exist");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.lang.Object obj2 = dataController0.getModuleBasedResponse((int) (byte) 1);
        dataController0.moduleBasedResponse(10);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj2, "Error 100024 ModuleId doesn't exist");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.getModuleList();
        dataController0.getAllQuestions();
        java.sql.ResultSet resultSet3 = null;
        dataController0.mapRow(resultSet3, '4');
        dataController0.getAllQuestions();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.getAllQuestions();
        java.sql.ResultSet resultSet2 = null;
        dataController0.mapRow(resultSet2, ' ');
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dataController0.submitFeedback(feedbackRequestEntity5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity.getModuleID()\" because \"feedback\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.getModuleList();
        dataController0.getAllQuestions();
        java.sql.ResultSet resultSet3 = null;
        dataController0.mapRow(resultSet3, '4');
        dataController0.getUserID("Incorrect Email Address format");
        java.sql.ResultSet resultSet9 = dataController0.getResultSet("Incorrect Email Address format");
        java.lang.Object obj12 = dataController0.checkResponseExists(10, "Incorrect Email Address format");
        dataController0.moduleBasedResponse((-1));
        org.junit.Assert.assertNull(resultSet9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "Incorrect Email Address format" + "'", obj12, "Incorrect Email Address format");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.lang.Object obj2 = dataController0.getModuleBasedResponse((int) (byte) 1);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList3 = dataController0.getModules();
        dataController0.getUserID("Incorrect Email Address format");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj2, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertNotNull(modulesList3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.lang.Object obj2 = dataController0.getModuleBasedResponse((int) (byte) 1);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList3 = dataController0.getModules();
        java.sql.ResultSet resultSet4 = null;
        dataController0.mapRow(resultSet4, '4');
        dataController0.getModuleList();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj2, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertNotNull(modulesList3);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.sql.ResultSet resultSet2 = dataController0.getResultSet("");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dataController0.submitFeedback(feedbackRequestEntity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity.getModuleID()\" because \"feedback\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resultSet2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        dataController0.getAllQuestions();
        java.sql.ResultSet resultSet2 = null;
        dataController0.mapRow(resultSet2, ' ');
        java.lang.Object obj6 = dataController0.getModuleBasedResponse((int) (short) 0);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList7 = dataController0.getModules();
        boolean boolean10 = dataController0.checkResponseInDB((int) (short) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj6, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertNotNull(modulesList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.sql.ResultSet resultSet2 = dataController0.getResultSet("");
        java.sql.ResultSet resultSet4 = dataController0.getResultSet("hi!");
        org.junit.Assert.assertNull(resultSet2);
        org.junit.Assert.assertNull(resultSet4);
    }
}

