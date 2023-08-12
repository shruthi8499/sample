package com.byteapp;
import java.io.*;
public class OutputDemo {
	public static void main(String[] args) {
		try
		{
			FileOutputStream fs= new FileOutputStream("C:\\Users\\e019851\\OneDrive - Telstra\\Documents\\myiofiles//file.txt");
			String str="hello world";
			byte[] bt=str.getBytes();
			fs.write(bt);
			fs.flush();
			fs.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
