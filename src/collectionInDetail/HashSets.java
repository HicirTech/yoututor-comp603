package collectionInDetail;

import java.util.HashSet;

public class HashSets {

	public static void main(String ages[]) {
		Student s1 = new Student (1,"nameA");
		Student sT = new Student (1,"nameA");
		Student s2 = new Student (2,"nameB");
		Student s3 = new Student (3,"nameC");
		
		HashSet<Student> hs = new HashSet<>();
		
		System.out.println(hs.add(s1));// no repeat test
		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));
		System.out.println(hs.add(s2));
		System.out.println(hs.add(s3));
		System.out.println(hs);
		
	}
}
