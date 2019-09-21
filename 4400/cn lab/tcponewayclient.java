package cn;
import java.io.*;
import java.net.*;
public class tcponewayclient {
 public static void main(String args[]) throws IOException{
     Socket s=new Socket("localhost",8222);
     DataInputStream di=new DataInputStream(s.getInputStream());
     while(true){
         String str=di.readLine();
         System.out.println("message received"+str);
         if(str.equals("end")){
             s.close();
             break;
         }
     }
 }   
}
