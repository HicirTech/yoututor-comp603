package collectionInDetail;

import java.util.ArrayList;
import java.util.Stack;

public class Stacks {

	public static void main(String ages[]) {
		String someString = "abcde";
		
		char[] array = someString.toCharArray();
		
		Stack<Character> stack = new Stack();
		
		for(char c: array) {
			stack.push(c);
		}
		System.out.println(stack);
		
		ArrayList<Character> re =new ArrayList<>();
		while(!stack.empty()) {
			re.add(stack.pop());
		}
		
		System.out.println(re);
		
		for(int i = 0;i!=array.length;i++) {
			array[i]=re.get(i);
		}
		System.out.println(array);
		
		someString = String.valueOf(array);
		
		System.out.println(someString);
		
	}
}
