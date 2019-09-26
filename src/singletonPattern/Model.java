package singletonPattern;

public class Model {
	
	private int age;
	private String name;
	private static boolean notSingleObject = false;
	private Model(int age, String name) {
		this.setAge(age);
		this.setName(name);
		this.notSingleObject=true;
	}
	
	public static Model getModel(int age, String name) {
		if(notSingleObject) {
			return null;
		}
		else {
			return new Model(age, name);
		}
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Model [age=" + age + ", name=" + name + "]";
	}

}
