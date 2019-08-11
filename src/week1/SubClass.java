package week1;

public class SubClass extends SuperClass implements Comparable<SubClass> {
	//not declear any new but just use the super variable
	
	SubClass(String message){
		super(message);//call super at first, and set up the string
		this.sharedWithSubClass="Sub message";	
	}
	
	
	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("this is from the SubClass, message is "+this.sharedWithSubClass);
		
	}


	//compare massage String
	@Override
	public int compareTo(SubClass arg0) {
		return this.sharedWithSubClass.compareTo(arg0.sharedWithSubClass);
	}

	public String toString() {
		return "this is the subObject";
	}
}
