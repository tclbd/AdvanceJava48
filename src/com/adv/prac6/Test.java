package com.adv.prac6;
//Load the JDBC Driver
import java.sql.*;

public class Test {

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement stmt = null;
        try {
            //Register the driver class
//            Class.forName("com.mysql.jdbc.Driver");
            //Create the connection object
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            //Create the Statement object
            stmt = con.createStatement();
            int count = 0;
            //Execute the query
            count = stmt.executeUpdate("insert into emp(name, city, salary) values('Ali','Dhaka',5000)");
            if (count > 0) {
                System.out.println("inserted successfully");
            } else {
                System.out.println("insertion failed");
            }
//            ResultSet rs = stmt.executeQuery("select name, city, salary from emp");
//            while(rs.next()){
//                System.out.println(rs.getString("name")+"- "+rs.getString(3));
//            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Close the connection and statement object
            con.close();
            stmt.close();
        }
    }
}
