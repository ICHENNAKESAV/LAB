import java.sql.*;
import java.util.*;
import java.io.*;
public class One {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","tiger");
        Scanner sc = new Scanner(System.in);
        
        String rollno =  sc.nextLine();
        String  phoneno = sc.nextLine();

        PreparedStatement ps = con.prepareStatement("Update students set phoneno = ? where rollno = ?");
        ps.setString(1, phoneno);
        ps.setString(2, rollno);
        int i=ps.executeUpdate();
        if(i>0)
            System.out.println("Record Updated Successfully");
        else
            System.out.println("Record Not Updated");
    }
}