import java.sql.*; 
public class DisplayStude
{ 
public static void main(String[] args) 
{ 
try 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection

("jdbc:mysql://localhost:3306/ab","root","root"); 
Statement st=con.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM Student1"); 
ResultSetMetaData rsmd=rs.getMetaData(); 
for(int i=1;i<=rsmd.getColumnCount();i++) 
{ 
System.out.print(rsmd.getColumnName(i)+" ");
 } 
System.out.println(" "); 
while(rs.next())
 { 
 for(int i=1;i<=rsmd.getColumnCount();i++) 
 { 
 System.out.print(rs.getString(i)+" "); 
 }
  System.out.println(" "); 
 } 
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