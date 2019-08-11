package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputButNotOverwriteRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("./path/test.txt");
		
		try {
			if(!file.exists()) {
				file.getParentFile().mkdir();
				file.createNewFile();
			}
		}catch(IOException e) {
			System.out.print(e);
		}
		
		//write
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(file,true));
			String ori = "test message";
			
			pw.write(ori); //write to RAM
			
			pw.flush(); //output to text
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
