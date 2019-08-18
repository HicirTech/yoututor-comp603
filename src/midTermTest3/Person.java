package midTermTest3;

public class Person extends Thread{
	private String name;
	
	Person(String name){
		this.name = name;
	}
	
	public void wellcome() {
		System.out.println(this.name+"Wellcome!");
	}	
        @Override
        public void run(){
            wellcome();
        }
}
