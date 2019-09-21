package cn;
import java.io.*;
import java.net.*;
public class udptwowayclient {
    public static void main(String args[]) throws SocketException, IOException{
        DatagramSocket ds=new DatagramSocket(8222);
        DatagramPacket dp,dp1;
        DataInputStream di=new DataInputStream(System.in);
        String msg,msg1;
        byte rbuff[]=new byte[1024];
        while(true){
            dp=new DatagramPacket(rbuff,rbuff.length);
            ds.receive(dp);
            msg=new String(dp.getData(),0,dp.getLength());
            System.out.println("received message"+msg);
            System.out.println("Enter the message to send");
            msg1=di.readLine();
            byte sendbuff[]=msg1.getBytes();
            dp1=new DatagramPacket(sendbuff,sendbuff.length,dp.getAddress(),dp.getPort());
            ds.send(dp1);
            if(msg1.equals("end")){
                ds.close();
                break;
            }
            
        }
    }    
}
