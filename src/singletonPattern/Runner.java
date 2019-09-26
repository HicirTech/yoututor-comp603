package singletonPattern;

public class Runner {

	public static void main(String[] args) {
		Model m = Model.getModel(1,"2");
		
		Model m2 = Model.getModel(3,"4");
		
		System.out.println(m+System.lineSeparator()+m2);
	}
}
