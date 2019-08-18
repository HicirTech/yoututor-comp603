package midTermTest4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Runable {

	public static void main(String args[]) {
		
            try {
                /*
                * Load the Result.txt in the root folder,
                * output the data in the console
                * let user input new data, save the file but not overwrite it.
                */

                /*TODO:
                1.找到文件
                2.读取文件 并打印到console
                3.提示用户输入
                4.储存到文件
                */
                
                File file = new File("Result.txt");//找到文件
                Scanner sc = new Scanner(file);//读取文件
                while(sc.hasNextLine())//打印到console
                {
                    System.out.println(sc.nextLine());
                }
                
                
                //为保存文件做准备
                PrintWriter pw = new PrintWriter(new FileWriter(file,true));
                
                //用户输入
                Scanner scanner = new Scanner (System.in); 
                System.out.println("please input name and result (e.g. name:result)");
                String input = scanner.nextLine();//让用户输入一行
                
                pw.println(input);//println是打印一行
                pw.flush();//保存到文件
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Runable.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Runable.class.getName()).log(Level.SEVERE, null, ex);
            }
            
	}
}
