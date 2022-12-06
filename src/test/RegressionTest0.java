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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        java.lang.String str1 = mySQLDataConnection0.connectionUrl;
        java.lang.Class<?> wildcardClass2 = mySQLDataConnection0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str1, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        java.sql.Connection connection3 = mySQLDataConnection0.getConnection();
        org.junit.Assert.assertNull(connection3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        java.lang.Class<?> wildcardClass5 = mySQLDataConnection0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        java.lang.String str3 = mySQLDataConnection0.connectionUrl;
        java.lang.Class<?> wildcardClass4 = mySQLDataConnection0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str3, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "hi!";
        java.lang.String str3 = mySQLDataConnection0.connectionUrl;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        java.lang.String str3 = mySQLDataConnection0.connectionUrl;
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false" + "'", str3, "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        mySQLDataConnection0.connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";
        mySQLDataConnection0.connectionUrl = "hi!";
        java.lang.Class<?> wildcardClass7 = mySQLDataConnection0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        java.sql.Connection connection1 = mySQLDataConnection0.getConnection();
        java.sql.Connection connection2 = mySQLDataConnection0.getConnection();
        org.junit.Assert.assertNull(connection1);
        org.junit.Assert.assertNull(connection2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection mySQLDataConnection0 = new com.example.softwarequality.SoftwareQuality.Repository.MySQLDataConnection();
        mySQLDataConnection0.connectionUrl = "hi!";
        java.sql.Connection connection3 = mySQLDataConnection0.getConnection();
        java.sql.Connection connection4 = mySQLDataConnection0.getConnection();
        org.junit.Assert.assertNull(connection3);
        org.junit.Assert.assertNull(connection4);
    }
}

