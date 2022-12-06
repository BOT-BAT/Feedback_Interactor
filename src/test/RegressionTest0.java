import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void DataController01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController01");
        java.util.regex.Pattern pattern0 = com.example.softwarequality.SoftwareQuality.Controller.DataController.VALID_EMAIL_ADDRESS_REGEX;
        java.lang.Class<?> wildcardClass1 = pattern0.getClass();
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void DataController02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController02");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.sql.ResultSet resultSet1 = null;
        dataController0.mapRow(resultSet1, '#');
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity4 = null;
        // The following exception was thrown during execution in DataController generation
        try {
            java.lang.Object obj5 = dataController0.submitFeedback(feedbackRequestEntity4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity.getModuleID()\" because \"feedback\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void DataController03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController03");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity2 = null;
        // The following exception was thrown during execution in DataController generation
        try {
            java.lang.Object obj3 = dataController1.submitFeedback(feedbackRequestEntity2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity.getModuleID()\" because \"feedback\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void DataController04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController04");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        dataController1.getModuleList();
        java.lang.Object obj5 = dataController1.getModuleBasedResponse(100);
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity6 = null;
        // The following exception was thrown during execution in DataController generation
        try {
            java.lang.Object obj7 = dataController1.submitFeedback(feedbackRequestEntity6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity.getModuleID()\" because \"feedback\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj5, "Error 100024 ModuleId doesn't exist");
    }

    @Test
    public void DataController05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController05");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getUserID("Error 100024 ModuleId doesn't exist");
        java.lang.Class<?> wildcardClass4 = dataController1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void DataController06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController06");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        dataController1.getModuleList();
        java.lang.Object obj5 = dataController1.getModuleBasedResponse(100);
        java.lang.Object obj8 = dataController1.checkResponseExists(0, "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj5, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "Incorrect Email Address format" + "'", obj8, "Incorrect Email Address format");
    }

    @Test
    public void DataController07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController07");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.sql.ResultSet resultSet1 = null;
        dataController0.mapRow(resultSet1, ' ');
    }

    @Test
    public void DataController08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController08");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.sql.ResultSet resultSet1 = null;
        dataController0.mapRow(resultSet1, '#');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList4 = dataController0.getQuestions();
        java.lang.Object obj6 = dataController0.getModuleBasedResponse(10);
        org.junit.Assert.assertNotNull(questionsList4);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj6, "Error 100024 ModuleId doesn't exist");
    }

    @Test
    public void DataController09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController09");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList1 = dataController0.getQuestions();
        dataController0.moduleBasedResponse((int) (byte) 100);
        org.junit.Assert.assertNotNull(questionsList1);
    }

    @Test
    public void DataController10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController10");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        dataController1.getModuleList();
        java.lang.Object obj5 = dataController1.getModuleBasedResponse(100);
        boolean boolean8 = dataController1.checkResponseInDB((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj5, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void DataController11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController11");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList6 = dataController1.getQuestions();
        java.lang.Object obj9 = dataController1.checkResponseExists(1, "");
        boolean boolean12 = dataController1.checkResponseInDB((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(questionsList6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "Incorrect Email Address format" + "'", obj9, "Incorrect Email Address format");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void DataController12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController12");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList2 = dataController1.getModules();
        dataController1.getUserID("");
        dataController1.getModuleList();
        org.junit.Assert.assertNotNull(modulesList2);
    }

    @Test
    public void DataController13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController13");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        java.sql.Statement statement3 = dataController1.getStatementObject();
        java.lang.Object obj5 = dataController1.getModuleBasedResponse((int) (byte) 100);
        org.junit.Assert.assertNull(statement3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj5, "Error 100024 ModuleId doesn't exist");
    }

    @Test
    public void DataController14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController14");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        dataController1.getModuleList();
        dataController1.moduleBasedResponse((int) (short) 10);
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity9 = null;
        // The following exception was thrown during execution in DataController generation
        try {
            java.lang.Object obj10 = dataController1.submitFeedback(feedbackRequestEntity9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity.getModuleID()\" because \"feedback\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void DataController15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController15");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        dataController1.getModuleList();
        java.lang.Class<?> wildcardClass4 = dataController1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void DataController16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController16");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        dataController1.getModuleList();
        dataController1.moduleBasedResponse((int) (short) 10);
        dataController1.getAllQuestions();
        java.sql.ResultSet resultSet10 = null;
        dataController1.mapRow(resultSet10, '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void DataController17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController17");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        dataController1.getModuleList();
        java.lang.Object obj5 = dataController1.getModuleBasedResponse(100);
        java.sql.ResultSet resultSet7 = dataController1.getResultSet("");
        boolean boolean10 = dataController1.checkResponseInDB(10, (int) 'a');
        java.sql.Statement statement11 = dataController1.getStatementObject();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj5, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertNull(resultSet7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(statement11);
    }

    @Test
    public void DataController18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController18");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList1 = dataController0.getQuestions();
        dataController0.getUserID("Incorrect Email Address format");
        org.junit.Assert.assertNotNull(questionsList1);
    }

    @Test
    public void DataController19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController19");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        dataController1.getModuleList();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList7 = dataController1.getModules();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(modulesList7);
    }

    @Test
    public void DataController20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController20");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        dataController1.getModuleList();
        dataController1.moduleBasedResponse((int) (short) 10);
        dataController1.getAllQuestions();
        dataController1.getUserID("Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void DataController21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController21");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        dataController1.getModuleList();
        java.lang.Object obj5 = dataController1.getModuleBasedResponse(100);
        java.sql.ResultSet resultSet7 = dataController1.getResultSet("");
        java.sql.ResultSet resultSet9 = dataController1.getResultSet("Incorrect Email Address format");
        dataController1.moduleBasedResponse((int) (short) 10);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj5, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertNull(resultSet7);
        org.junit.Assert.assertNull(resultSet9);
    }

    @Test
    public void DataController22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController22");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.sql.ResultSet resultSet1 = null;
        dataController0.mapRow(resultSet1, '#');
        boolean boolean6 = dataController0.checkResponseInDB(0, (int) (short) 1);
        java.sql.ResultSet resultSet8 = dataController0.getResultSet("hi!");
        java.lang.Object obj10 = dataController0.getModuleBasedResponse((int) '#');
        dataController0.moduleBasedResponse((int) '4');
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity13 = null;
        // The following exception was thrown during execution in DataController generation
        try {
            java.lang.Object obj14 = dataController0.submitFeedback(feedbackRequestEntity13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity.getModuleID()\" because \"feedback\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(resultSet8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj10, "Error 100024 ModuleId doesn't exist");
    }

    @Test
    public void DataController23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController23");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.sql.ResultSet resultSet1 = null;
        dataController0.mapRow(resultSet1, '#');
        boolean boolean6 = dataController0.checkResponseInDB(0, (int) (short) 1);
        java.sql.ResultSet resultSet8 = dataController0.getResultSet("hi!");
        java.lang.Object obj10 = dataController0.getModuleBasedResponse((int) '#');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList11 = dataController0.getQuestions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(resultSet8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj10, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertNotNull(questionsList11);
    }

    @Test
    public void DataController24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController24");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        dataController1.getModuleList();
        java.lang.Object obj5 = dataController1.getModuleBasedResponse(100);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList6 = dataController1.getQuestions();
        dataController1.getUserID("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj5, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertNotNull(questionsList6);
    }

    @Test
    public void DataController25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController25");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList6 = dataController1.getQuestions();
        java.lang.Object obj9 = dataController1.checkResponseExists(1, "");
        boolean boolean12 = dataController1.checkResponseInDB((int) (short) 1, 0);
        dataController1.getUserID("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(questionsList6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "Incorrect Email Address format" + "'", obj9, "Incorrect Email Address format");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void DataController26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController26");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        dataController1.getUserID("");
        java.lang.Object obj10 = dataController1.checkResponseExists(0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "Incorrect Email Address format" + "'", obj10, "Incorrect Email Address format");
    }

    @Test
    public void DataController27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController27");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        java.sql.Statement statement3 = dataController1.getStatementObject();
        dataController1.moduleBasedResponse((int) '4');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList6 = dataController1.getModules();
        org.junit.Assert.assertNull(statement3);
        org.junit.Assert.assertNotNull(modulesList6);
    }

    @Test
    public void DataController28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController28");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        dataController1.getModuleList();
        dataController1.getUserID("hi!");
        java.lang.Object obj11 = dataController1.checkResponseExists((int) (short) 100, "Incorrect Email Address format");
        dataController1.getAllQuestions();
        dataController1.moduleBasedResponse((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "Incorrect Email Address format" + "'", obj11, "Incorrect Email Address format");
    }

    @Test
    public void DataController29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController29");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList1 = dataController0.getModules();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList2 = dataController0.getQuestions();
        org.junit.Assert.assertNotNull(modulesList1);
        org.junit.Assert.assertNotNull(questionsList2);
    }

    @Test
    public void DataController30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController30");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        java.sql.ResultSet resultSet6 = null;
        dataController1.mapRow(resultSet6, '4');
        dataController1.getAllQuestions();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void DataController31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController31");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        java.lang.Object obj8 = dataController1.checkResponseExists(10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "Incorrect Email Address format" + "'", obj8, "Incorrect Email Address format");
    }

    @Test
    public void DataController32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController32");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.sql.ResultSet resultSet1 = null;
        dataController0.mapRow(resultSet1, '#');
        boolean boolean6 = dataController0.checkResponseInDB(0, (int) (short) 1);
        java.sql.ResultSet resultSet8 = dataController0.getResultSet("hi!");
        java.sql.Statement statement9 = dataController0.getStatementObject();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList10 = dataController0.getModules();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(resultSet8);
        org.junit.Assert.assertNull(statement9);
        org.junit.Assert.assertNotNull(modulesList10);
    }

    @Test
    public void DataController33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController33");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        java.lang.Object obj3 = dataController1.getModuleBasedResponse((int) '4');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList4 = dataController1.getQuestions();
        java.sql.Statement statement5 = dataController1.getStatementObject();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj3, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertNotNull(questionsList4);
        org.junit.Assert.assertNull(statement5);
    }

    @Test
    public void DataController34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController34");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        java.lang.Object obj3 = dataController1.getModuleBasedResponse((int) '4');
        java.sql.ResultSet resultSet5 = dataController1.getResultSet("Error 100024 ModuleId doesn't exist");
        java.sql.ResultSet resultSet7 = dataController1.getResultSet("Error 100024 ModuleId doesn't exist");
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList8 = dataController1.getQuestions();
        java.lang.Object obj11 = dataController1.checkResponseExists((int) (byte) 1, "hi!");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj3, "Error 100024 ModuleId doesn't exist");
        org.junit.Assert.assertNull(resultSet5);
        org.junit.Assert.assertNull(resultSet7);
        org.junit.Assert.assertNotNull(questionsList8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "Incorrect Email Address format" + "'", obj11, "Incorrect Email Address format");
    }

    @Test
    public void DataController35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController35");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        dataController1.getModuleList();
        dataController1.getUserID("hi!");
        dataController1.moduleBasedResponse((int) (byte) 100);
        java.sql.Statement statement11 = dataController1.getStatementObject();
        dataController1.getModuleList();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(statement11);
    }

    @Test
    public void DataController36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController36");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        dataController1.getModuleList();
        dataController1.getUserID("hi!");
        dataController1.moduleBasedResponse((int) (byte) 100);
        java.sql.Statement statement11 = dataController1.getStatementObject();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList12 = dataController1.getQuestions();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(statement11);
        org.junit.Assert.assertNotNull(questionsList12);
    }

    @Test
    public void DataController37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController37");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList1 = dataController0.getQuestions();
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity2 = null;
        // The following exception was thrown during execution in DataController generation
        try {
            java.lang.Object obj3 = dataController0.submitFeedback(feedbackRequestEntity2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity.getModuleID()\" because \"feedback\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(questionsList1);
    }

    @Test
    public void DataController38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController38");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.sql.ResultSet resultSet1 = null;
        dataController0.mapRow(resultSet1, '#');
        boolean boolean6 = dataController0.checkResponseInDB(0, (int) (short) 1);
        java.sql.ResultSet resultSet8 = dataController0.getResultSet("hi!");
        java.sql.ResultSet resultSet10 = dataController0.getResultSet("hi!");
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList11 = dataController0.getQuestions();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(resultSet8);
        org.junit.Assert.assertNull(resultSet10);
        org.junit.Assert.assertNotNull(questionsList11);
    }

    @Test
    public void DataController39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController39");
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController0 = new com.example.softwarequality.SoftwareQuality.Controller.DataController();
        java.sql.ResultSet resultSet1 = null;
        dataController0.mapRow(resultSet1, '#');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList4 = dataController0.getQuestions();
        boolean boolean7 = dataController0.checkResponseInDB((int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(questionsList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void DataController40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController40");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        dataController1.getModuleList();
        dataController1.getUserID("Error 100024 ModuleId doesn't exist");
        java.lang.Object obj8 = dataController1.checkResponseExists((int) (byte) -1, "Error 100024 ModuleId doesn't exist");
        dataController1.getAllQuestions();
        dataController1.moduleBasedResponse((int) ' ');
        java.lang.Object obj13 = dataController1.getModuleBasedResponse(10);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "Incorrect Email Address format" + "'", obj8, "Incorrect Email Address format");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj13, "Error 100024 ModuleId doesn't exist");
    }

    @Test
    public void DataController41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController41");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList3 = dataController1.getQuestions();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList4 = dataController1.getModules();
        dataController1.getAllQuestions();
        org.junit.Assert.assertNotNull(questionsList3);
        org.junit.Assert.assertNotNull(modulesList4);
    }

    @Test
    public void DataController42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController42");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        dataController1.getUserID("");
        dataController1.moduleBasedResponse(0);
        dataController1.getModuleList();
        java.lang.Object obj12 = dataController1.getModuleBasedResponse((int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "Error 100024 ModuleId doesn't exist" + "'", obj12, "Error 100024 ModuleId doesn't exist");
    }

    @Test
    public void DataController43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController43");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Questions> questionsList3 = dataController1.getQuestions();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList4 = dataController1.getModules();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.Modules> modulesList5 = dataController1.getModules();
        org.junit.Assert.assertNotNull(questionsList3);
        org.junit.Assert.assertNotNull(modulesList4);
        org.junit.Assert.assertNotNull(modulesList5);
    }

    @Test
    public void DataController44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController44");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        dataController1.getModuleList();
        dataController1.moduleBasedResponse((int) (short) 10);
        java.sql.Statement statement9 = dataController1.getStatementObject();
        java.sql.ResultSet resultSet10 = null;
        dataController1.mapRow(resultSet10, '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(statement9);
    }

    @Test
    public void DataController45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController45");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        dataController1.getModuleList();
        dataController1.getUserID("Error 100024 ModuleId doesn't exist");
        java.lang.Object obj8 = dataController1.checkResponseExists((int) (byte) -1, "Error 100024 ModuleId doesn't exist");
        dataController1.getAllQuestions();
        dataController1.getUserID("");
        java.sql.Statement statement12 = dataController1.getStatementObject();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "Incorrect Email Address format" + "'", obj8, "Incorrect Email Address format");
        org.junit.Assert.assertNull(statement12);
    }

    @Test
    public void DataController46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.DataController46");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = null;
        com.example.softwarequality.SoftwareQuality.Controller.DataController dataController1 = new com.example.softwarequality.SoftwareQuality.Controller.DataController(mySQLDataConnection0);
        dataController1.getModuleList();
        boolean boolean5 = dataController1.checkResponseInDB(1, 1);
        dataController1.getModuleList();
        dataController1.getAllQuestions();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void FeedbackRequestEntity01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity01");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        java.lang.Class<?> wildcardClass1 = feedbackRequestEntity0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FeedbackRequestEntity02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity02");
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
    public void FeedbackRequestEntity03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity03");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList1 = feedbackRequestEntity0.getRequestList();
        java.lang.Class<?> wildcardClass2 = feedbackRequestEntity0.getClass();
        org.junit.Assert.assertNotNull(requestEntityList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void FeedbackRequestEntity04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity04");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        feedbackRequestEntity0.setEmailAddress("hi!");
        feedbackRequestEntity0.setModuleID((int) (short) 10);
    }

    @Test
    public void FeedbackRequestEntity05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity05");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void FeedbackRequestEntity06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity06");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID((int) 'a');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList5 = feedbackRequestEntity0.getRequestList();
        feedbackRequestEntity0.setEmailAddress("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(requestEntityList5);
    }

    @Test
    public void FeedbackRequestEntity07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity07");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID((int) (short) 1);
        feedbackRequestEntity0.setModuleID((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void FeedbackRequestEntity08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity08");
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
        java.lang.String str13 = feedbackRequestEntity0.getEmailAddress();
        java.lang.String str14 = feedbackRequestEntity0.getEmailAddress();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(requestEntityList5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(requestEntityList11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void FeedbackRequestEntity09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity09");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID((int) 'a');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList5 = feedbackRequestEntity0.getRequestList();
        java.lang.Class<?> wildcardClass6 = feedbackRequestEntity0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(requestEntityList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FeedbackRequestEntity10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity10");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList2 = feedbackRequestEntity0.getRequestList();
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity3 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int4 = feedbackRequestEntity3.getModuleID();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList5 = feedbackRequestEntity3.getRequestList();
        feedbackRequestEntity0.setRequestList(requestEntityList5);
        feedbackRequestEntity0.setEmailAddress("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(requestEntityList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(requestEntityList5);
    }

    @Test
    public void FeedbackRequestEntity11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity11");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID((int) 'a');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList5 = feedbackRequestEntity0.getRequestList();
        java.lang.String str6 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setEmailAddress("");
        feedbackRequestEntity0.setModuleID((int) '4');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList11 = feedbackRequestEntity0.getRequestList();
        java.lang.Class<?> wildcardClass12 = requestEntityList11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(requestEntityList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(requestEntityList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void FeedbackRequestEntity12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity12");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        int int3 = feedbackRequestEntity0.getModuleID();
        feedbackRequestEntity0.setEmailAddress("hi!");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity6 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int7 = feedbackRequestEntity6.getModuleID();
        java.lang.String str8 = feedbackRequestEntity6.getEmailAddress();
        feedbackRequestEntity6.setModuleID((int) 'a');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList11 = feedbackRequestEntity6.getRequestList();
        feedbackRequestEntity0.setRequestList(requestEntityList11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(requestEntityList11);
    }

    @Test
    public void FeedbackRequestEntity13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity13");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList2 = feedbackRequestEntity0.getRequestList();
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity3 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int4 = feedbackRequestEntity3.getModuleID();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList5 = feedbackRequestEntity3.getRequestList();
        feedbackRequestEntity0.setRequestList(requestEntityList5);
        java.lang.Class<?> wildcardClass7 = requestEntityList5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(requestEntityList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(requestEntityList5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void FeedbackRequestEntity14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity14");
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
        java.lang.Class<?> wildcardClass13 = feedbackRequestEntity0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(requestEntityList5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(requestEntityList11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void FeedbackRequestEntity15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity15");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID((int) 'a');
        feedbackRequestEntity0.setEmailAddress("");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity7 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int8 = feedbackRequestEntity7.getModuleID();
        java.lang.String str9 = feedbackRequestEntity7.getEmailAddress();
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity[] requestEntityArray10 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity[] {};
        java.util.ArrayList<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList11 = new java.util.ArrayList<com.example.softwarequality.SoftwareQuality.Data.RequestEntity>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.example.softwarequality.SoftwareQuality.Data.RequestEntity>) requestEntityList11, requestEntityArray10);
        feedbackRequestEntity7.setRequestList((java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity>) requestEntityList11);
        feedbackRequestEntity0.setRequestList((java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity>) requestEntityList11);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList15 = feedbackRequestEntity0.getRequestList();
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity16 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int17 = feedbackRequestEntity16.getModuleID();
        java.lang.String str18 = feedbackRequestEntity16.getEmailAddress();
        feedbackRequestEntity16.setModuleID((int) 'a');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList21 = feedbackRequestEntity16.getRequestList();
        java.lang.String str22 = feedbackRequestEntity16.getEmailAddress();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList23 = feedbackRequestEntity16.getRequestList();
        feedbackRequestEntity0.setRequestList(requestEntityList23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(requestEntityArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(requestEntityList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(requestEntityList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(requestEntityList23);
    }

    @Test
    public void FeedbackRequestEntity16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity16");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID((int) 'a');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList5 = feedbackRequestEntity0.getRequestList();
        java.lang.String str6 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setEmailAddress("");
        feedbackRequestEntity0.setModuleID((int) '4');
        feedbackRequestEntity0.setModuleID((int) '#');
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity13 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int14 = feedbackRequestEntity13.getModuleID();
        java.lang.String str15 = feedbackRequestEntity13.getEmailAddress();
        feedbackRequestEntity13.setModuleID((int) 'a');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList18 = feedbackRequestEntity13.getRequestList();
        java.lang.String str19 = feedbackRequestEntity13.getEmailAddress();
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList20 = feedbackRequestEntity13.getRequestList();
        feedbackRequestEntity0.setRequestList(requestEntityList20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(requestEntityList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(requestEntityList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(requestEntityList20);
    }

    @Test
    public void FeedbackRequestEntity17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity17");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID((int) 'a');
        int int5 = feedbackRequestEntity0.getModuleID();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void FeedbackRequestEntity18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity18");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID((int) 'a');
        feedbackRequestEntity0.setEmailAddress("");
        java.lang.Class<?> wildcardClass7 = feedbackRequestEntity0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void FeedbackRequestEntity19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity19");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID((int) 'a');
        feedbackRequestEntity0.setEmailAddress("");
        int int7 = feedbackRequestEntity0.getModuleID();
        feedbackRequestEntity0.setModuleID((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void FeedbackRequestEntity20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity20");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID((int) 'a');
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList5 = feedbackRequestEntity0.getRequestList();
        java.lang.Class<?> wildcardClass6 = requestEntityList5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(requestEntityList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void FeedbackRequestEntity21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity21");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        int int3 = feedbackRequestEntity0.getModuleID();
        java.lang.String str4 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setEmailAddress("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void FeedbackRequestEntity22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity22");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        feedbackRequestEntity0.setModuleID((int) ' ');
    }

    @Test
    public void FeedbackRequestEntity23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity23");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        int int3 = feedbackRequestEntity0.getModuleID();
        java.lang.String str4 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void FeedbackRequestEntity24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.FeedbackRequestEntity24");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int1 = feedbackRequestEntity0.getModuleID();
        java.lang.String str2 = feedbackRequestEntity0.getEmailAddress();
        feedbackRequestEntity0.setModuleID((int) 'a');
        feedbackRequestEntity0.setEmailAddress("");
        com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity feedbackRequestEntity7 = new com.example.softwarequality.SoftwareQuality.Data.FeedbackRequestEntity();
        int int8 = feedbackRequestEntity7.getModuleID();
        java.lang.String str9 = feedbackRequestEntity7.getEmailAddress();
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity[] requestEntityArray10 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity[] {};
        java.util.ArrayList<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList11 = new java.util.ArrayList<com.example.softwarequality.SoftwareQuality.Data.RequestEntity>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.example.softwarequality.SoftwareQuality.Data.RequestEntity>) requestEntityList11, requestEntityArray10);
        feedbackRequestEntity7.setRequestList((java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity>) requestEntityList11);
        feedbackRequestEntity0.setRequestList((java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity>) requestEntityList11);
        java.util.List<com.example.softwarequality.SoftwareQuality.Data.RequestEntity> requestEntityList15 = feedbackRequestEntity0.getRequestList();
        feedbackRequestEntity0.setModuleID(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(requestEntityArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(requestEntityList15);
    }

    @Test
    public void ModuleResponseEntity01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity01");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setCount((int) (byte) 10);
        int int5 = moduleResponseEntity0.getCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void ModuleResponseEntity02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity02");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setQuestionID((int) 'a');
        moduleResponseEntity0.setModuleID((int) ' ');
        moduleResponseEntity0.setQuestionID((int) (byte) -1);
    }

    @Test
    public void ModuleResponseEntity03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity03");
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
    public void ModuleResponseEntity04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity04");
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
    public void ModuleResponseEntity05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity05");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setCount((int) (byte) 10);
        int int5 = moduleResponseEntity0.getQuestionID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void ModuleResponseEntity06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity06");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setQuestionID((int) 'a');
        int int5 = moduleResponseEntity0.getResponse();
        java.lang.String str6 = moduleResponseEntity0.getQuestion();
        int int7 = moduleResponseEntity0.getModuleID();
        java.lang.Class<?> wildcardClass8 = moduleResponseEntity0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ModuleResponseEntity07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity07");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setQuestionID((int) '4');
        int int3 = moduleResponseEntity0.getModuleID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void ModuleResponseEntity08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity08");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setQuestionID((int) 'a');
        moduleResponseEntity0.setModuleID((int) ' ');
        java.lang.String str7 = moduleResponseEntity0.getQuestion();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void ModuleResponseEntity09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity09");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) '4');
        int int3 = moduleResponseEntity0.getResponse();
        java.lang.String str4 = moduleResponseEntity0.getQuestion();
        moduleResponseEntity0.setResponse((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void ModuleResponseEntity10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity10");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) '4');
        int int3 = moduleResponseEntity0.getResponse();
        java.lang.String str4 = moduleResponseEntity0.getQuestion();
        moduleResponseEntity0.setQuestion("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void ModuleResponseEntity11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity11");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setQuestion("");
        int int5 = moduleResponseEntity0.getModuleID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void ModuleResponseEntity12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity12");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setQuestionID((int) 'a');
        int int5 = moduleResponseEntity0.getModuleID();
        moduleResponseEntity0.setCount((int) (short) 0);
        int int8 = moduleResponseEntity0.getCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void ModuleResponseEntity13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity13");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        int int3 = moduleResponseEntity0.getResponse();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void ModuleResponseEntity14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity14");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setQuestionID((int) '4');
        int int3 = moduleResponseEntity0.getQuestionID();
        moduleResponseEntity0.setQuestionID(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void ModuleResponseEntity15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity15");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setQuestionID((int) 'a');
        int int5 = moduleResponseEntity0.getModuleID();
        java.lang.Class<?> wildcardClass6 = moduleResponseEntity0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void ModuleResponseEntity16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity16");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setQuestionID((int) 'a');
        int int5 = moduleResponseEntity0.getResponse();
        int int6 = moduleResponseEntity0.getQuestionID();
        java.lang.String str7 = moduleResponseEntity0.getQuestion();
        moduleResponseEntity0.setQuestionID((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void ModuleResponseEntity17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity17");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setQuestionID((int) 'a');
        int int5 = moduleResponseEntity0.getResponse();
        moduleResponseEntity0.setQuestion("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void ModuleResponseEntity18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity18");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) '4');
        int int3 = moduleResponseEntity0.getResponse();
        int int4 = moduleResponseEntity0.getQuestionID();
        int int5 = moduleResponseEntity0.getQuestionID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void ModuleResponseEntity19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity19");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) '4');
        int int3 = moduleResponseEntity0.getModuleID();
        moduleResponseEntity0.setQuestionID((int) '4');
        moduleResponseEntity0.setModuleID((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = moduleResponseEntity0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void ModuleResponseEntity20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity20");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setQuestionID((int) 'a');
        int int5 = moduleResponseEntity0.getModuleID();
        int int6 = moduleResponseEntity0.getCount();
        moduleResponseEntity0.setResponse((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void ModuleResponseEntity21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity21");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setQuestionID((int) '4');
        int int3 = moduleResponseEntity0.getQuestionID();
        int int4 = moduleResponseEntity0.getResponse();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void ModuleResponseEntity22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity22");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        moduleResponseEntity0.setCount((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = moduleResponseEntity0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void ModuleResponseEntity23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity23");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setQuestionID((int) '4');
        int int3 = moduleResponseEntity0.getQuestionID();
        moduleResponseEntity0.setCount(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void ModuleResponseEntity24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.ModuleResponseEntity24");
        com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity moduleResponseEntity0 = new com.example.softwarequality.SoftwareQuality.Data.ModuleResponseEntity();
        moduleResponseEntity0.setCount((int) (byte) 1);
        int int3 = moduleResponseEntity0.getCount();
        int int4 = moduleResponseEntity0.getQuestionID();
        int int5 = moduleResponseEntity0.getResponse();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Modules01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void Modules02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules02");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
        int int3 = modules2.getModuleID();
        java.lang.Class<?> wildcardClass4 = modules2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Modules03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules03");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
        int int3 = modules2.getModuleID();
        modules2.setModule("hi!");
        modules2.setModuleID((int) (short) 0);
        java.lang.Class<?> wildcardClass8 = modules2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Modules04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules04");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) 'a', "hi!");
        modules2.setModuleID((int) ' ');
        modules2.setModuleID((int) '4');
    }

    @Test
    public void Modules05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules05");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
        int int3 = modules2.getModuleID();
        modules2.setModule("hi!");
        modules2.setModuleID((int) (short) 0);
        java.lang.String str8 = modules2.getModule();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void Modules06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules06");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
        modules2.setModule("hi!");
    }

    @Test
    public void Modules07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules07");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (byte) 1, "hi!");
    }

    @Test
    public void Modules08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules08");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
        int int3 = modules2.getModuleID();
        java.lang.String str4 = modules2.getModule();
        modules2.setModule("");
        java.lang.Class<?> wildcardClass7 = modules2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Modules09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules09");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass3 = modules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Modules10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules10");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
        modules2.setModuleID((int) (short) 0);
        java.lang.String str5 = modules2.getModule();
        modules2.setModule("hi!");
        modules2.setModuleID((int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void Modules11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules11");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
        modules2.setModuleID((int) (short) 0);
        java.lang.String str5 = modules2.getModule();
        modules2.setModule("");
        int int8 = modules2.getModuleID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void Modules12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules12");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (byte) -1, "hi!");
        modules2.setModuleID(100);
        modules2.setModuleID((int) (byte) -1);
    }

    @Test
    public void Modules13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules13");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass3 = modules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Modules14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules14");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
        int int3 = modules2.getModuleID();
        modules2.setModule("hi!");
        java.lang.Class<?> wildcardClass6 = modules2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Modules15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules15");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules(0, "");
    }

    @Test
    public void Modules16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules16");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
        int int3 = modules2.getModuleID();
        java.lang.String str4 = modules2.getModule();
        java.lang.String str5 = modules2.getModule();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void Modules17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules17");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) 'a', "hi!");
        modules2.setModuleID((int) ' ');
        modules2.setModuleID((-1));
        java.lang.String str7 = modules2.getModule();
        modules2.setModule("");
        java.lang.String str10 = modules2.getModule();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void Modules18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules18");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
        modules2.setModuleID((int) (short) 0);
        java.lang.String str5 = modules2.getModule();
        modules2.setModule("hi!");
        modules2.setModule("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void Modules19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules19");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (short) 100, "hi!");
        java.lang.String str3 = modules2.getModule();
        java.lang.String str4 = modules2.getModule();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void Modules20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules20");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (short) 100, "hi!");
        java.lang.String str3 = modules2.getModule();
        int int4 = modules2.getModuleID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void Modules21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules21");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (byte) -1, "hi!");
        int int3 = modules2.getModuleID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void Modules22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules22");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (short) 0, "");
    }

    @Test
    public void Modules23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules23");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (short) 100, "hi!");
        modules2.setModule("hi!");
        modules2.setModuleID(0);
        int int7 = modules2.getModuleID();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void Modules24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules24");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) '4', "");
    }

    @Test
    public void Modules25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules25");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((int) (byte) -1, "hi!");
        java.lang.String str3 = modules2.getModule();
        java.lang.String str4 = modules2.getModule();
        java.lang.String str5 = modules2.getModule();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void Modules26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Modules26");
        com.example.softwarequality.SoftwareQuality.Data.Modules modules2 = new com.example.softwarequality.SoftwareQuality.Data.Modules((-1), "");
        int int3 = modules2.getModuleID();
        modules2.setModule("hi!");
        modules2.setModuleID((int) ' ');
        int int8 = modules2.getModuleID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void Questions01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void Questions02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions02");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        int int3 = questions0.getQuestionID();
        questions0.setQuesText("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Questions03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions03");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        int int3 = questions0.getQuestionID();
        java.lang.Class<?> wildcardClass4 = questions0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Questions04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions04");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        questions0.setQuestionID(0);
        questions0.setQuesText("");
        java.lang.Class<?> wildcardClass7 = questions0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Questions05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions05");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        questions0.setQuestionID((-1));
    }

    @Test
    public void Questions06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions06");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        java.lang.String str1 = questions0.getQuesText();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void Questions07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions07");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        questions0.setQuestionID(0);
        questions0.setQuesText("");
        java.lang.String str7 = questions0.getQuesText();
        questions0.setQuestionID((int) '4');
        questions0.setQuesText("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void Questions08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions08");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        questions0.setQuestionID(0);
        questions0.setQuesText("");
        java.lang.String str7 = questions0.getQuesText();
        questions0.setQuesText("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void Questions09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions09");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions((int) 'a', "hi!");
        questions2.setQuestionID((int) ' ');
        java.lang.Class<?> wildcardClass5 = questions2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Questions10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions10");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions((int) (byte) -1, "hi!");
        java.lang.String str3 = questions2.getQuesText();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void Questions11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions11");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions((int) (byte) -1, "hi!");
        questions2.setQuesText("hi!");
    }

    @Test
    public void Questions12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions12");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        questions0.setQuestionID(0);
        questions0.setQuesText("");
        questions0.setQuestionID((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = questions0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Questions13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions13");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        questions0.setQuestionID(0);
        questions0.setQuesText("");
        int int7 = questions0.getQuestionID();
        questions0.setQuesText("hi!");
        questions0.setQuesText("");
        questions0.setQuestionID((int) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void Questions14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions14");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        questions0.setQuestionID(0);
        questions0.setQuesText("");
        java.lang.String str7 = questions0.getQuesText();
        int int8 = questions0.getQuestionID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void Questions15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions15");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        int int3 = questions0.getQuestionID();
        questions0.setQuestionID(100);
        questions0.setQuestionID((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Questions16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions16");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        questions0.setQuestionID(0);
        questions0.setQuesText("");
        questions0.setQuestionID((int) (short) 0);
        questions0.setQuestionID((int) ' ');
        questions0.setQuesText("");
    }

    @Test
    public void Questions17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions17");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        int int1 = questions0.getQuestionID();
        java.lang.Class<?> wildcardClass2 = questions0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Questions18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions18");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions(0, "");
    }

    @Test
    public void Questions19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions19");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        questions0.setQuestionID(0);
        questions0.setQuesText("");
        int int7 = questions0.getQuestionID();
        questions0.setQuesText("hi!");
        questions0.setQuesText("");
        java.lang.String str12 = questions0.getQuesText();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void Questions20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions20");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuesText("");
        questions0.setQuestionID(0);
        java.lang.String str5 = questions0.getQuesText();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void Questions21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions21");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        int int1 = questions0.getQuestionID();
        java.lang.String str2 = questions0.getQuesText();
        java.lang.String str3 = questions0.getQuesText();
        questions0.setQuesText("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void Questions22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions22");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        questions0.setQuestionID(0);
        java.lang.String str3 = questions0.getQuesText();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void Questions23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions23");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions((int) 'a', "hi!");
        questions2.setQuestionID((int) (short) 0);
        int int5 = questions2.getQuestionID();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Questions24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions24");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions((int) (short) 0, "");
    }

    @Test
    public void Questions25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions25");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions0 = new com.example.softwarequality.SoftwareQuality.Data.Questions();
        int int1 = questions0.getQuestionID();
        java.lang.String str2 = questions0.getQuesText();
        java.lang.String str3 = questions0.getQuesText();
        int int4 = questions0.getQuestionID();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void Questions26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions26");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions((int) '4', "");
    }

    @Test
    public void Questions27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions27");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions((int) (byte) 1, "hi!");
        java.lang.String str3 = questions2.getQuesText();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void Questions28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.Questions28");
        com.example.softwarequality.SoftwareQuality.Data.Questions questions2 = new com.example.softwarequality.SoftwareQuality.Data.Questions((int) 'a', "hi!");
        questions2.setQuestionID((int) (short) 0);
        java.lang.String str5 = questions2.getQuesText();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void RequestEntity01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void RequestEntity02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity02");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        requestEntity0.setQuestionID((int) '4');
        requestEntity0.setResponse(0);
    }

    @Test
    public void RequestEntity03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity03");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        int int7 = requestEntity0.getQuestionID();
        int int8 = requestEntity0.getQuestionID();
        requestEntity0.setQuestionID((int) (byte) 10);
        requestEntity0.setQuestionID((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void RequestEntity04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity04");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        int int7 = requestEntity0.getQuestionID();
        requestEntity0.setQuestionID((int) (short) 0);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setResponse(1);
        java.lang.Class<?> wildcardClass14 = requestEntity0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void RequestEntity05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity05");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        int int7 = requestEntity0.getQuestionID();
        requestEntity0.setQuestionID((int) (short) 0);
        requestEntity0.setResponse((int) '4');
        java.lang.Class<?> wildcardClass12 = requestEntity0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void RequestEntity06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity06");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        int int7 = requestEntity0.getResponse();
        requestEntity0.setQuestionID((-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void RequestEntity07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity07");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = requestEntity0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void RequestEntity08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity08");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '#');
        requestEntity0.setQuestionID((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = requestEntity0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void RequestEntity09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity09");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        requestEntity0.setQuestionID((int) '4');
        int int9 = requestEntity0.getResponse();
        int int10 = requestEntity0.getResponse();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void RequestEntity10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity10");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        int int7 = requestEntity0.getQuestionID();
        int int8 = requestEntity0.getQuestionID();
        int int9 = requestEntity0.getResponse();
        java.lang.Class<?> wildcardClass10 = requestEntity0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void RequestEntity11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity11");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        int int1 = requestEntity0.getQuestionID();
        requestEntity0.setQuestionID((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void RequestEntity12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity12");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        int int7 = requestEntity0.getResponse();
        requestEntity0.setQuestionID(10);
        requestEntity0.setResponse(10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void RequestEntity13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity13");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        requestEntity0.setQuestionID((int) '4');
        int int9 = requestEntity0.getQuestionID();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void RequestEntity14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity14");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setResponse((int) (byte) 0);
        int int3 = requestEntity0.getResponse();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void RequestEntity15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity15");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (short) 100);
    }

    @Test
    public void RequestEntity16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity16");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        int int7 = requestEntity0.getQuestionID();
        int int8 = requestEntity0.getQuestionID();
        requestEntity0.setQuestionID((int) (byte) 10);
        requestEntity0.setResponse((int) (byte) 0);
        requestEntity0.setResponse((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = requestEntity0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void RequestEntity17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity17");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        int int7 = requestEntity0.getQuestionID();
        requestEntity0.setQuestionID((int) (short) 0);
        requestEntity0.setResponse((int) '4');
        int int12 = requestEntity0.getQuestionID();
        int int13 = requestEntity0.getResponse();
        int int14 = requestEntity0.getResponse();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void RequestEntity18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity18");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        int int7 = requestEntity0.getQuestionID();
        requestEntity0.setQuestionID((int) (short) 0);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setResponse(1);
        requestEntity0.setResponse(0);
        requestEntity0.setResponse(10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void RequestEntity19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity19");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '#');
        requestEntity0.setQuestionID((int) (short) 10);
        requestEntity0.setResponse((int) '#');
        requestEntity0.setQuestionID(10);
    }

    @Test
    public void RequestEntity20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity20");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        int int7 = requestEntity0.getResponse();
        requestEntity0.setQuestionID((int) '4');
        requestEntity0.setQuestionID((int) '4');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void RequestEntity21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity21");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '4');
        requestEntity0.setQuestionID((int) (short) 1);
        requestEntity0.setQuestionID((int) '4');
        int int9 = requestEntity0.getResponse();
        int int10 = requestEntity0.getQuestionID();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void RequestEntity22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity22");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        int int1 = requestEntity0.getQuestionID();
        int int2 = requestEntity0.getResponse();
        java.lang.Class<?> wildcardClass3 = requestEntity0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void RequestEntity23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.RequestEntity23");
        com.example.softwarequality.SoftwareQuality.Data.RequestEntity requestEntity0 = new com.example.softwarequality.SoftwareQuality.Data.RequestEntity();
        requestEntity0.setQuestionID((int) (byte) 1);
        requestEntity0.setResponse((int) '#');
        requestEntity0.setQuestionID((int) (short) 10);
        requestEntity0.setResponse((int) '#');
        requestEntity0.setResponse(10);
    }

    @Test
    public void MySQLDataConnection01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MySQLDataConnection02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection02");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        java.lang.String str1 = mySQLDataConnection0.connectionUrl;
        java.lang.Class<?> wildcardClass2 = mySQLDataConnection0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str1, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MySQLDataConnection03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection03");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        java.sql.Connection connection3 = mySQLDataConnection0.getConnection();
        org.junit.Assert.assertNull(connection3);
    }

    @Test
    public void MySQLDataConnection04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection04");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        java.lang.Class<?> wildcardClass5 = mySQLDataConnection0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MySQLDataConnection05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection05");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        java.lang.String str3 = mySQLDataConnection0.connectionUrl;
        java.lang.Class<?> wildcardClass4 = mySQLDataConnection0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str3, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MySQLDataConnection06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection06");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "hi!";
        java.lang.String str3 = mySQLDataConnection0.connectionUrl;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void MySQLDataConnection07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection07");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        mySQLDataConnection0.connectionUrl = "hi!";
        java.lang.String str7 = mySQLDataConnection0.connectionUrl;
        java.lang.Class<?> wildcardClass8 = mySQLDataConnection0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MySQLDataConnection08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection08");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        java.lang.String str3 = mySQLDataConnection0.connectionUrl;
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str3, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
    }

    @Test
    public void MySQLDataConnection09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection09");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        java.lang.String str1 = mySQLDataConnection0.connectionUrl;
        java.sql.Connection connection2 = mySQLDataConnection0.getConnection();
        java.sql.Connection connection3 = mySQLDataConnection0.getConnection();
        java.sql.Connection connection4 = mySQLDataConnection0.getConnection();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str1, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
        org.junit.Assert.assertNull(connection2);
        org.junit.Assert.assertNull(connection3);
        org.junit.Assert.assertNull(connection4);
    }

    @Test
    public void MySQLDataConnection10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection10");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        mySQLDataConnection0.connectionUrl = "hi!";
        java.lang.Class<?> wildcardClass7 = mySQLDataConnection0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MySQLDataConnection11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection11");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        java.lang.String str3 = mySQLDataConnection0.connectionUrl;
        java.lang.String str4 = mySQLDataConnection0.connectionUrl;
        java.sql.Connection connection5 = mySQLDataConnection0.getConnection();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str3, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str4, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
        org.junit.Assert.assertNull(connection5);
    }

    @Test
    public void MySQLDataConnection12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection12");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        java.sql.Connection connection1 = mySQLDataConnection0.getConnection();
        java.sql.Connection connection2 = mySQLDataConnection0.getConnection();
        org.junit.Assert.assertNull(connection1);
        org.junit.Assert.assertNull(connection2);
    }

    @Test
    public void MySQLDataConnection13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection13");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        java.lang.String str3 = mySQLDataConnection0.connectionUrl;
        java.lang.String str4 = mySQLDataConnection0.connectionUrl;
        java.lang.String str5 = mySQLDataConnection0.connectionUrl;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str3, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str4, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str5, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
    }

    @Test
    public void MySQLDataConnection14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection14");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        java.sql.Connection connection5 = mySQLDataConnection0.getConnection();
        java.lang.String str6 = mySQLDataConnection0.connectionUrl;
        java.lang.Class<?> wildcardClass7 = mySQLDataConnection0.getClass();
        org.junit.Assert.assertNull(connection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str6, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MySQLDataConnection15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.MySQLDataConnection15");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "hi!";
        java.sql.Connection connection3 = mySQLDataConnection0.getConnection();
        java.sql.Connection connection4 = mySQLDataConnection0.getConnection();
        org.junit.Assert.assertNull(connection3);
        org.junit.Assert.assertNull(connection4);
    }
}

