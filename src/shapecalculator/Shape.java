package shapecalculator;

public abstract class Shape {
	public String shapeName = "";
	public double area = 0;

	public Shape(String name) {
		this.shapeName = name;
	}

	public void printInfo() {
		System.out.println(this.shapeName);
		this.calculateArea();
		System.out.println(this.area);
	}

	public void setName(String newName) {
		this.shapeName = newName;
	}

	public abstract void calculateArea();

}