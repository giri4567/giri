package cn;
import java.io.*;
import java.net.*;
public class tcptwowayserver {
    public static void main(String args[]) throws IOException{
        System.out.println("Server is started");
        ServerSocket ss=new ServerSocket(8222);
        System.out.println("Server is waiting for the client requests");
        Socket s=ss.accept();
        DataInputStream di=new DataInputStream(System.in);
        PrintStream ps=new PrintStream(s.getOutputStream());
        DataInputStream di1=new DataInputStream(s.getInputStream());
        while(true){
            System.out.println("Enter the message to send");
            String str=di.readLine();
            ps.println(str);
            String str1=di1.readLine();
            System.out.println("Message Received"+str1);
            if(str.equals("end")){
                ss.close();
                break;
            }
        }
        
    }
    
}
