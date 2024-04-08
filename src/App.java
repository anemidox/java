import java.sql.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Connection Testing");
        Connection conn = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String userName = "root";
            String password = "dhanujatoor";
            String url = "jdbc:mysql://localhost:3306/test";

            // Establish connection
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection Established");
        } catch (ClassNotFoundException ex) {
            System.out.println("MySQL JDBC Driver not found.");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("Connection Failed");
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Connection Closed");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
