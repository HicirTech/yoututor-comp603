package midTermTest2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Runable {

	public static void main(String[] args) {
	
                HashMap<String,Pets> map = new HashMap<>();
		/*
		 * use a collection to store all pets, no name should be repeated, 
		 * print out the collection on the console, and store the console out to a file
		 * called pet.txt in the project root folder 
		 */
		
		Cat c1 = new Cat("Tom","Cat");
		Cat c2 = new Cat("Jerry","Cat");
		Dog d1 = new Dog("Ajax","Dog");
		Dog d2 = new Dog("Peter","Dog");
		Dog d3 = new Dog("Tom","Dog");
                
                
               /*
                TODO:
                1.store in to collection
                2.print it on the console
                3.store in a file call pet.txt
                    3.1 create file
                    3.2 print
                */
                map.put(c1.getName(), c1);
                map.put(c2.getName(), c2);
                map.put(d1.getName(), d1);
                map.put(d2.getName(), d2);
                map.put(d3.getName(), d3);

                System.out.println(map);
                
                
                File file = new File("./pet.txt");
                
                //如果没有的情况下
                //创建文件
                if(!file.exists()){
                    try {
                        file.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(Runable.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            try {
                //把数据存到文件里
                PrintWriter pw = new PrintWriter(file);
                pw.println(map);
                pw.flush();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Runable.class.getName()).log(Level.SEVERE, null, ex);
            }
                
	}

}
