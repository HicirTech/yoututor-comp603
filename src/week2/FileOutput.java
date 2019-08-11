package week2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOutput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File file = new File("./path/some.txt");
			if(!file.exists()) 
			{
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
			PrintWriter writer = new PrintWriter(file);
			writer.write("Testing");                                                   
			writer.flush();  
			writer.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		

	}
}
