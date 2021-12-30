package com.adv.student;

import com.adv.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TraineeBatchInsert {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Mr. A");
        list.add("Mr. B");
        list.add("Mr. C");
        list.add("Mr. D");
        list.add("Mr. E");
        
        Connection con = DBConnection.getConnection();
        try {
            for (Object traineeName : list) {
                System.out.println(traineeName.toString());
                String sql = "insert into trainee (name) values (?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, traineeName.toString());
                int status = stmt.executeUpdate();
                System.out.println("data number" + status);
            }
        } catch (Exception e) {
        }
    }
}
