package com.byteapp;
import java.io.*;
public class Developerapp {

	public static void main(String[] args) {
		InputStream in=System.in;
		try
		{
			FileOutputStream fs= new FileOutputStream("C:\\Users\\e019851\\OneDrive - Telstra\\Documents\\buginfo\\bugdata.txt");
			byte[] bt1=new byte[20];
			byte[] bt2=new byte[20];
			byte[] bt3=new byte[20];
			in.read(bt1);
			in.read(bt2);
			in.read(bt3);
		    String devname=new String(bt1) ;
		    System.out.println("developer name " +devname);
		    String bugno=new String(bt2) ;
		    System.out.println("bud no. " +bugno);
		    String bugdes=new String(bt3) ;
		    System.out.println("bug description " +bugdes);
		    fs.write(bt1);
		    fs.write(bt2);	
		    fs.write(bt3);
			fs.flush();
			fs.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}	
		
}
}
