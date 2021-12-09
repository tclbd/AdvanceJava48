package content;

import java.sql.*;
import java.util.Scanner;

public class StmtvsPrepstmt1 {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter email id:");
        String id = scanner.nextLine();
        System.out.println("Please enter password:");
        String pwd = scanner.nextLine();

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "select uname, pass from users where email = ? and pass = ?";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sph_login", "root", "root");
            ps = con.prepareStatement(query);
             
            //set the parameter
            ps.setString(1, id);
            ps.setString(2, pwd);
            rs = ps.executeQuery();
            System.out.println(ps);
            while (rs.next()) {
                System.out.println("Name=" + rs.getString("uname") + ",password="
                        + rs.getString("pass"));
            }
        } finally {
            if (rs != null)
                rs.close();
            ps.close();
            con.close();
        }

    }
}
