package collectionInDetail;

import java.util.HashMap;

public class HashMaps {

	public static void main(String ages[]) {
		Student s1 = new Student (1,"nameA");
		Student sT = new Student (1,"nameA");
		Student s2 = new Student (2,"nameB");
		Student s3 = new Student (3,"nameC");
	
		HashMap<Integer,Student> map = new HashMap<>();

		System.out.println(map.put(s1.getId(), s1));
		System.out.println(map.put(s1.getId(), s1));

		System.out.println();
		
	}
}
