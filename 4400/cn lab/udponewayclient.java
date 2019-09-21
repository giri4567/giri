package cn;
import java.io.*;
import java.net.*;
public class udponewayclient {
    public static void main(String args[]) throws SocketException, IOException{
        DatagramSocket ds=new DatagramSocket(8222);
        DatagramPacket dp;
        String msg;
        byte buff[]=new byte[1024];
        while(true){
            dp=new DatagramPacket(buff,buff.length);
            ds.receive(dp);
            msg=new String(dp.getData(),0,dp.getLength());
            System.out.println("received message"+msg);
            
        }
    }    
}
