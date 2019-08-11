package week4;

public class Runable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SuperClass superClass = new SuperClass();
//		SubClass subClass = new SubClass();
//		superClass.act();
//		subClass.act();
//		subClass.printOutSuperOnly();

		AbstractClass ac  = new AnotherSubClass();
		//ac.methods();
		System.out.print(ac.stringReverse("String"));
	}

}
