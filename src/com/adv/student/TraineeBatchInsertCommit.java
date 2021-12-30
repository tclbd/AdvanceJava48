package com.adv.student;

import com.adv.util.DBConnection;
import java.sql.Connection;
import java.sql.Statement;

public class TraineeBatchInsertCommit {
    public static void main(String[] args) {
        Connection con = DBConnection.getConnection();
        try {
            
            System.out.println(con.getAutoCommit());
            con.setAutoCommit(false);//
            
            Statement st = con.createStatement();
            st.addBatch("insert into trainee (name) values ('Mr. AA')");
            st.addBatch("insert into trainee (name) values ('Mr. BB')");
            st.addBatch("insert into trainee (name) values ('Mr. CC')");
            st.addBatch("insert into trainee (name) values ('Mr. DD')");
            st.addBatch("insert into trainee (name) values ('Mr. EE')");
            int[] status = st.executeBatch();
            System.out.println(status.length);
            con.commit();//
            
        } catch (Exception e) {
        }
    }
}
