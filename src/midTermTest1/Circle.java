package midTermTest1;

import java.util.Scanner;

public class Circle extends Shape{

    public Circle() {
        super("Circle");
    }

    @Override
    int getArea() {
        System.out.println("Input R for circle");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        return (int) (Math.PI*r*r);
        
    }
	
}
