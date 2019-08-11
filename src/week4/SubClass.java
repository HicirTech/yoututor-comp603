package week4;

public class SubClass extends SuperClass{
	
	SubClass(){
		super("SUBONLY");
		this.setOpenName("SubClass");
		
		
	}

	@Override
	public void act() {
		System.out.println("Subclass act here");
	}
	
	public void printOutSuperOnly() {
		System.out.println(this.getSuperOnly());
	}

}
