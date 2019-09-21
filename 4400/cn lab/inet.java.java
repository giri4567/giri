import java.io.*;
import java.net.*;
class inet
{
public static void main(String args[])
{
try
{
 InetAddress i=InetAddress.getLocalHost();
 System.out.println(i.getHostName());
 System.out.println(i.getHostAddress());
}
catch(Exception e)
{
System.out.println(e);
}
}
}
