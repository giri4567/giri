package cn;
import java.io.*;
import java.net.*;
public class udptwowayserver {
    public static void main(String args[]) throws SocketException, IOException{
        DatagramSocket ds=new DatagramSocket();
        DatagramPacket dp,dp1;
        DataInputStream in=new DataInputStream(System.in);
        String msg,msg1;
        byte sendbuff[]=new byte[1024];
        while(true){
            System.out.println("Enter the message:");
            msg=in.readLine();
            sendbuff=msg.getBytes();
            InetAddress ip=InetAddress.getLocalHost();
            dp=new DatagramPacket(sendbuff,sendbuff.length,ip,8222);
            ds.send(dp);
            byte rbuff[]=new byte[1024];
            dp1=new DatagramPacket(rbuff,rbuff.length);
            ds.receive(dp1);
            msg1=new String(dp1.getData(),0,dp1.getLength());
            System.out.println("received msg:"+msg1);
            if(msg.equals("end")){
                ds.close();
                break;
            }
        }
    }
    
    
}
