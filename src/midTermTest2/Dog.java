package midTermTest2;

public class Dog extends Pets{
	
	private String name;
	private String petType;
	Dog(String name, String petType){
		this.setName(name);
		this.setPetType(petType);
	}
	public void action() {
		System.out.println("bak!");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", petType=" + petType + "]";
	}
}
