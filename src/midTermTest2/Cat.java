package midTermTest2;

public class Cat extends Pets{
	
	private String name;
	private String petType;
	Cat(String name, String petType){
		this.name=name;
                this.petType=petType;
        }
	public void action() {
		System.out.println("caw!");
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
		return "Cat [name=" + name + ", petType=" + petType + "]";
	}
	
}
