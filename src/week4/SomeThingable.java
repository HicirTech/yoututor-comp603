package week4;

import java.util.ArrayList;
import java.util.Collections;

public interface SomeThingable {

	public void method();

	default String stringReverse(String input) {

		ArrayList<Character> charArray = new ArrayList<>();

		for (Character e : input.toCharArray()) {
			charArray.add(e);
		}
		Collections.reverse(charArray);
		
		String returning = "";
		
		for (Character e : charArray) {
			returning += e;
		}
		return returning;
	}

}
