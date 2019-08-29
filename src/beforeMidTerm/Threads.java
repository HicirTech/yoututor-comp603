/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforeMidTerm;

/**
 *
 * @author luoze
 */
public class Threads extends Thread{
    Threads(int number){
        this.threadNumber=number;
    }
    private int threadNumber;
    
    public static void main(String[] args){
        
        Threads threads1 = new Threads(1);
        Threads threads2 = new Threads(2);
        
//        
//        threads1.printMessage();
//        threads2.printMessage();
        threads1.start();
        threads2.start();
    }
    
    public void printMessage(){
        System.out.println("Message "+ this.threadNumber+" is here");
    }
    
    public void run(){
        printMessage();
    }
}
