package factoryPattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModelFactory mf = new ModelFactory();
		
		Model m = mf.getModel(1);

		Model m2 = mf.getModel(2);

		Model m3 = mf.getModel(3);
		
		System.out.println(m);
		System.out.println(m2);
		System.out.println(m3);
		
	}

}
