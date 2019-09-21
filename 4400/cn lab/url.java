import java.io.*;
import java.net.URL;
class url
{
public static void main(String args[])
{
try
{
URL u= new URL("http://www.vignan.ac.in/cseinfra.php");
System.out.println(u.getProtocol());
System.out.println(u.getPort());
System.out.println(u.getHost());
System.out.println(u.getFile());
}
catch(Exception e)
{

}
}
}
