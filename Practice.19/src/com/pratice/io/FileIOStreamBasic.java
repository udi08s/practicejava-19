package com.pratice.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamBasic {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream in=null;
		FileOutputStream out=null;
		
	try {
		
		in= new FileInputStream(System.getProperty("user.dir") +"\\resources\\input.txt");
		out= new FileOutputStream(System.getProperty("user.dir") +"\\resources\\output.txt");
		
		int c=0;
		while((c = in.read()) != -1) {
			out.write(c);
		}
		
	}
		
		finally {
			if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
		}
	}

}
