package midTermTest3;

public class Runable{

	public static void main(String args[]) {
	
		/*
		 *Make change to the program, let person use thread 
		 */
		
		Person p1 = new Person("p1");
		Person p2 = new Person("p2");
		Person p3 = new Person("p3");
		
		p1.wellcome();
		p2.wellcome();
		p3.wellcome();
	}
}
