import java.sql.*;
public class DeleteStudent
{
public static void main(String[] args)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con =

DriverManager.getConnection("jdbc:mysql://localhost:3306/ab","root","root");

Statement st = con.createStatement();

int ret = st.executeUpdate("DELETE FROM Student1 WHERE regno='4313'");
if(ret>0)
System.out.println("DATA DELETED SUCCESSFULLY");
else
System.out.println("DATA NOT DELETED");

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