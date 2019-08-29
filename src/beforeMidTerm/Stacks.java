/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforeMidTerm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author luoze
 */
public class Stacks {
    /*
        let user input a list, reverse that list and put it out again, but do not use Collections methods
    */
    public static void main(String[] args){
              
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
        Collections.reverse(list);
        Collections.sort(list);
        
        Stack<String> stack = new Stack<>();
        for(String s : list){
            stack.push(s);
        }
        ArrayList<String> target = new ArrayList<>();
        while(!stack.empty()){
            target.add(stack.pop());
        }
        list=target;
        System.out.println(list);
        
    }
    
}
