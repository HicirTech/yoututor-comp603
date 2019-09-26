package factoryPattern;

public class ModelFactory {
	
	public Model getModel(int age) {
		return new Model(age,"TestObject");
	}
	
}
