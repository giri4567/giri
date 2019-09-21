package cn;
import java.io.*;
import java.net.*;
public class tcptwowayclient {
    public static void main(String args[]) throws IOException
    {
        Socket s=new Socket("localhost",8222);
        DataInputStream di=new DataInputStream(s.getInputStream());
        DataInputStream di1=new DataInputStream(System.in);
        PrintStream ps=new PrintStream(s.getOutputStream());
        while(true){
              String str=di.readLine();
            System.out.println("message received"+str);
            System.out.println("Enter the message to send");
            String str1=di1.readLine();
            ps.println(str1);
            if(str1.equals("end")){
                s.close();
                break;
            }
                    
        }
        
    }
    
}
