import java.sql.*;
import java.util.*;

class Four {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","tiger");
    Scanner sc = new Scanner(System.in);

    String uname = sc.next();
    String passwd = sc.next();
    String phno = sc.next();
    String email = sc.next();

    PreparedStatement ps = con.prepareStatement("INSERT INTO lab_students VALUES(?,?,?,?);");
    ps.setString(1, uname);
    ps.setString(2, passwd);
    ps.setString(3, phno);
    ps.setString(4, email);

    int n = ps.executeUpdate();

    if (n >= 0) {
      System.out.println("successfully inserted");
    }
  }
}