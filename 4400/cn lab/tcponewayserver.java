package cn;
import java.io.*;
import java.net.*;
public class tcponewayserver {
    public static void main(String args[]) throws IOException{
        System.out.println("Server is started");
        ServerSocket ss=new ServerSocket(8222);
        System.out.println("Server is waiting for the client request");
        Socket s=ss.accept();
        System.out.println("Client connected");
        DataInputStream di=new DataInputStream(System.in);
        PrintStream ps=new PrintStream(s.getOutputStream());
        while(true){
            System.out.println("Enter message to send");
            String str=di.readLine();
            ps.println(str);
            if(str.equals("end")){
                ss.close();
                break;
            }
        }
        
    }
}
