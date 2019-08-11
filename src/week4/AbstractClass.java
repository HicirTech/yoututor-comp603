package week4;

public abstract class AbstractClass implements SomeThingable{

	private String name;
	
	int age = 1;
	
	AbstractClass(){
		name = "abstract";
	}
	
	abstract public void methods();
	
	public void solidMethod() {
		System.out.println("abstractClassHere");
	}
	
}
