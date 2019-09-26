package adapterPattern;

public class Model implements Iadapter{
	
	private int age;
	private String name;
	Model(int age, String name) {
		this.setAge(age);
		this.setName(name);
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
	@Override
	public void printOutInfo() {
		System.out.println("Model");
		
	}

}
