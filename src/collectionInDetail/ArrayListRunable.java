package collectionInDetail;

import java.util.ArrayList;

public class ArrayListRunable {

	public static void main(String ages[]) {
		Student s1 = new Student (1,"nameA");
		Student s2 = new Student (2,"nameB");
		Student s3 = new Student (3,"nameC");
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		//demo non-repeat
//		System.out.println("NRP"+list);
//		System.out.println(list.get(1));
		
		
		//demo repeat
		list.add(s1);
//		System.out.println("RP"+list);
		
		
		
		//not repeat logic
		ArrayList<Student> list2 = new ArrayList<>();
		System.out.println(addToList(list2,s1));
		System.out.println(addToList(list2,s1));
		System.out.println(list2);
		
	
	}
	
	 public static boolean addToList(ArrayList<Student> target, Student object) {
		 boolean isRepeat = false;
		 for(Student e : target) {
			 if(e.equals(object)) {
				 isRepeat = true;
			 }
		 }
		 
		 //checked
		 if(!isRepeat) {
			 target.add(object);
			 return !isRepeat;
		 }else {
			 return false;
		 }
	 }
	
}
