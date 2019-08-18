package W5_6;

public class ExtendsThreads extends Thread{

	private String name;
	
	ExtendsThreads(String name){
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
