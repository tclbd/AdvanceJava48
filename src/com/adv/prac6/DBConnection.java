
package com.adv.prac6;

import java.sql.*;

/**
 *
 * @author User
 */
public class DBConnection {

    public static Connection getDBConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test11", "root", "1234");
        } catch (Exception e) {
        }
        return con;
    }
}
