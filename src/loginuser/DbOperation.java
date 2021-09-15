package loginuser;


import java.sql.*;


public class DbOperation {
    Connection con;
    Statement st;
    int val;
    ResultSet rows;
    int values;


    public DbOperation() {
        // register the driver class
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating connection object
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_registration?characterEncoding=utf8", "root", "Leanstartup@1");


            //creating the statement object
            st = con.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public int insert(String query) {
        try {
            val = st.executeUpdate(query);
            con.commit();
            con.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();

        }

        return val;
    }

    public ResultSet select(String query) {
        try {
            rows = st.executeQuery(query);
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return rows;

    }

    public int Update(String query) {
        try {
            values = st.executeUpdate(query);
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return values;

    }

    public int executeDelete(String sql) {
        try {
            values = st.executeUpdate(sql);
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        // TODO Auto-generated method stub
        return values;
    }

    public static void main(String[] args) {
        new DbOperation();
    }




}
