import java.sql.*;
public class DBConnection {
  static Connection con = null;
  public static Class loadDriver() throws Exception {
    return Class.forName("com.mysql.jdbc.Driver");
  }

  public static Connection getConnection() throws Exception{
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","tiger");
    return con;
  }
}