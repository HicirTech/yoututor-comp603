/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforeMidTerm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luoze
 */
public class HashMapsWithInputOutput {
    //read the result.txt to load student result, 
    //let user input new results, if name is repeated, overwrite the result
    //store the result and name back to the file

    public static void main(String[] args) {
        try {
            /*
             TODO:
             1. load file
             2. HashMap to store the result with K/V pair
             3. output to the result.txt
             3.1 printWriter
             3.2 get all data in the map
             3.3 output to file
             */
            Scanner fileReader = new Scanner(new File("Result.txt"));
            HashMap<String, Integer> map = new HashMap<>();
            while (fileReader.hasNextLine()) {
                String currentInput = fileReader.nextLine();
                map.put(currentInput.split(":")[0], Integer.parseInt(currentInput.split(":")[1]));
            }
            System.out.println(map);

            Scanner sc = new Scanner(System.in);
//            Scanner sc = null;
            do {
                System.out.println("Please input name");
                String name = sc.nextLine();
                System.out.println("Please input result");
                int result;
                try {
                    result = getUserResultInput();
                } catch (NumberFormatException e) {
                    System.out.println("Input error, this is not a number, try again");
                    continue;
                }
                map.put(name, result);

                System.out.println("Do you want to add another one? [y/n]");
                if (sc.nextLine().toUpperCase().charAt(0) == 'N') {
                    break;
                }
            } while (true);

            //   System.out.println(map);
            PrintWriter pw = new PrintWriter(new File("Result.txt"));

            for (String key : map.keySet()) {
                pw.println(key + ":" + map.get(key));
            }
            pw.flush();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(HashMapsWithInputOutput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getUserResultInput() throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
