import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DEMOJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/suchi","root","");
        Statement s=con.createStatement();
        //s.executeUpdate("insert into shivani values('xyz',4)");
        //PreparedStatement ps=con.prepareStatement("insert into shivani values(?,?)");
     //   ResultSet rs=s.executeQuery("select * from shivani");
        Pattern p= Pattern.compile("[a-z]");
        Matcher m= p.matcher("9A4b1y1");
        while(m.find())
        {
            System.out.println("find");
        }
//
//        Scanner sc=new Scanner(System.in);
//        String name;
//        int marks;
//        name=sc.next();
//        marks=sc.nextInt();
//        ps.setString(1,name);
//        ps.setInt(2,marks);
//        ps.execute();
        con.close();
    }
}
