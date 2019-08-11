package week1;

public class RunAble {
	
	public static void main(String[] args) {
		SuperClass objectA = new SubClass("hey super, here is object A");
		SubClass objectB = new SubClass("hey super, I am class B");
		objectA.solidMethod();
		objectA.abstractMethod();
		System.out.println(objectA.toString());
	}

}
