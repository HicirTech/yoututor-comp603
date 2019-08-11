package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("./path/someOutput.txt");

		try {
			if(!file.exists()) 
			{
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
		}catch(IOException e) {
			System.out.print(e);
		}
		
		//write
		try {
		
			PrintWriter pw = new PrintWriter(file);
			String ori = "test message";
			
			pw.println(ori); //write to RAM
			pw.println("line");
			pw.flush(); //output to text
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
