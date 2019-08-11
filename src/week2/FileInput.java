package week2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File file = new File("./path/input.txt");
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
