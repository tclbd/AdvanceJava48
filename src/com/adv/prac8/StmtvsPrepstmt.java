package content;

import java.sql.*;
import java.util.Scanner;

public class StmtvsPrepstmt {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter email id:");
        String id = scanner.nextLine();
        System.out.println("Please enter password:");
        String pwd = scanner.nextLine();

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sph_login", "root", "root");
            stmt = con.createStatement();
            String query = "select uname, pass from users where email = '" + id + "' and pass='" + pwd + "'";
            System.out.println(query);
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("Name=" + rs.getString("uname") + ", Password=" + rs.getString("pass"));
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            stmt.close();
            con.close();
        }

    }
}
