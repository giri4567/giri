import java.sql.*;
public class CreateStudent
{
public static void main(String[] args)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection

con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ab","root","root");

Statement st=con.createStatement();
st.executeUpdate("insert into Student1 values('4000','sowmya','krishna','abc','14.07.98' ,female,'00','00')");
System.out.println("TABLE CREATED SUCCESSFULLY");
}
catch (ClassNotFoundException cnfe)
{
System.out.println("PLEASE CHECK JDBC DRIVER PATH");
}
catch(SQLException sqle)
{
System.out.println("PLEASE CHECK QUERY"+sqle);
}
}
}