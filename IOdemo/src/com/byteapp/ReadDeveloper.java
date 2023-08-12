package com.byteapp;
import java.io.*;
public class ReadDeveloper {

	public static void main(String[] args) {
		InputStream in=System.in;
		try
		{
			FileInputStream fin= new FileInputStream("C:\\Users\\e019851\\OneDrive - Telstra\\Documents\\buginfo\\bugdata.txt");
			byte[] bt=new byte[300];
		    fin.read(bt);
		    for(byte b:bt)
		    {
		    	System.out.println((char)(b));
		    }			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}

