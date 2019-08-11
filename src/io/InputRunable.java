package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InputRunable {
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
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
