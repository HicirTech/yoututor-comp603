package adapterPattern;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iadapter model= new Model(1,"2");
		Iadapter anotherModel= new AnotherModel(2,3);
		
		model.printOutInfo();
		anotherModel.printOutInfo();
		System.out.println(model);
		System.out.println(anotherModel);
	}

}
