package W5_6;

public class ImplementRunable implements Runnable {

	private String name;
	
	ImplementRunable(String name){
		this.name=name;
	}
	
	public void welcome() {
		System.out.println(this.name+"Hello!");
	}
	
	
	@Override
	public void run() {
		this.welcome();
		
	}

}
