/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_package;
import java.io.*;
import java.net.*;

/**
 *
 * @author Personal
 */
public class UDP_client {
    public static void main(String[] args) throws IOException {
        try{
            String str;
            byte[] b = new byte[1024];
            DatagramSocket ds = new DatagramSocket(1000);
            System.out.println("UDP File Receiver");
            System.out.println("The Content of the File is: ");
            while(true){
                DatagramPacket dp = new DatagramPacket(b,b.length);
                ds.receive(dp);
                str = new String(dp.getData(),0,dp.getLength());
                System.out.println(str);
                System.out.println("The File Received Successfully");
                ds.close();
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
