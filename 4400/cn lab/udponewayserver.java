package cn;
import java.io.*;
import java.net.*;
public class udponewayserver {
    public static void main(String args[]) throws SocketException, IOException{
        DatagramSocket ds=new DatagramSocket();
        DatagramPacket dp;
        DataInputStream in=new DataInputStream(System.in);
        String msg;
        byte buff[]=new byte[1024];
        while(true){
            System.out.println("Enter the message:");
            msg=in.readLine();
            buff=msg.getBytes();
            InetAddress ip=InetAddress.getLocalHost();
            dp=new DatagramPacket(buff,buff.length,ip,8222);
            ds.send(dp);
            if(msg.equals("end")){
                ds.close();
                break;
            }
        }
    }
    
    
}
