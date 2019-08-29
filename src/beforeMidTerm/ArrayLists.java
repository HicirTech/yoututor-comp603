/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforeMidTerm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luoze
 */
public class ArrayLists {
    // let user keep input and store input to a list
    // once user finished output the list to the console
    public static void main(String[] args){
        /*
        TODO:
        1.make a ArrayList -done
        2.make a scanner use keyboard input -done
        3.let user keep input -done
            3.1 let user input
            3.2 store into list
        4.output to console-done
        */
        
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("input something to the list: ");
            String userInput = sc.nextLine();
            list.add(userInput);
            
            System.out.println("Do you want to add another one? [y/n]");
            if(sc.nextLine().toUpperCase().charAt(0)=='N'){
                break;
            }
        }while(true);
        
        System.out.println(list);
        
    }
    
}
