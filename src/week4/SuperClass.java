package week4;

public class SuperClass {
	
	private String superName;
	protected String openName;
	
	//
	private String superOnly;
	
	SuperClass(){
		this.superName="superName";
	}

	SuperClass(String superOnly){
		this.superOnly = superOnly;
	}

	public String getSuperName() {
		return superName;
	}
	


	public String getSuperOnly() {
		return superOnly;
	}

	public void setSuperName(String superName) {
		this.superName = superName;
	}


	public String getOpenName() {
		return openName;
	}


	public void setOpenName(String openName) {
		this.openName = openName;
	}
	
	public void act() {
		System.out.println("Super act here");
	}
	
}

