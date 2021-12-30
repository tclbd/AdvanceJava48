package com.adv.student;

import com.adv.util.DBConnection;
import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        Connection con = DBConnection.getConnection();
        try {
            System.out.println(con.getSchema());
        } catch (Exception e) {
        }
        
        
        
    }
}
