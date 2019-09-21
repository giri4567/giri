import java.sql.*;
public class DisplayStudent
{
public static void main(String[] args)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ab","root","root");

Statement st = con.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM Student1");
ResultSetMetaData rsmd=rs.getMetaData();
//out.println("<table border='1'><tr>");
for(int i=1;i<=rsmd.getColumnCount();i++)
{
System.out.println(". "+rsmd.getColumnName(i));
}
//out.println("</tr>");
while(rs.next())
{
//out.println("<tr>");
for(int i=1;i<=rsmd.getColumnCount();i++)
{
System.out.println(". "+rs.getString(i));
}
}
//out.println("</tr></table>");
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