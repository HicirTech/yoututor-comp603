package comparebleInDetail;

import java.util.ArrayList;
import java.util.Collections;

public class Runable {
	public static void main(String[] args) {
		
		ArrayList<Student> stlist = new ArrayList<>();
		
		
		for(int i = 0;i != 10;i++) {
			stlist.add(new Student((int) (Math.random()*100)));
		}
		
		Collections.sort(stlist);
		System.out.println(stlist);

	}

}
