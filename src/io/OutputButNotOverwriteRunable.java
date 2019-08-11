package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputButNotOverwriteRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("test.txt");
		
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
		}catch(IOException e) {
			System.out.print(e);
		}
		
		//write
		try {
		
			
			Scanner scann = new Scanner(file);
			String ori = "";
			while(scann.hasNext()) {
				ori += scann.nextLine();
			}
			scann.close();
			
			PrintWriter pw = new PrintWriter(file);
			ori += "test message";
			
			pw.write(ori); //write to RAM
			
			pw.flush(); //output to text
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
