package midTermTest1;

import java.util.Scanner;

public class Square extends Shape{
	
    public Square() {
        super("Square");
    }

    @Override
    int getArea() {
        System.out.println("Input c for square");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        return c*c;
        
    }  
}
