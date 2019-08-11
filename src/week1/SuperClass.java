package week1;

public abstract class SuperClass {
	public String sharedWithSubClass;
	private String notShareWithSubClass;
	
	SuperClass(String setUp){
		this.notShareWithSubClass = setUp;
	}
	
	
	abstract void abstractMethod();
	
	public void solidMethod() {
		System.out.println("this is from the supurClass, private message "+this.notShareWithSubClass);
	}

	public String toString() {
		return "this is the SuperObject";
	}
}
