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
public class UPD_server {
    public static void main(String [] args)throws IOException{
        try{
            int i=0;
            byte[] b=new byte[1024];
            DatagramSocket ds = new DatagramSocket(2000);
            System.out.println("UDP File Sender");
            File fname = new File("D:\\cnlab.txt");
            FileInputStream fi = new FileInputStream(fname);
            InetAddress ip = InetAddress.getLocalHost();
            while(fi.available()!=0){
                b[i]=(byte)fi.read();
                i++;
            }
            fi.close();   
            DatagramPacket dp = new DatagramPacket(b,i,ip,1000);
            ds.send(dp);
            System.out.println("The File is Sent Successfully");
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
