package midTermTest1;

public abstract class Shape {

	private int area;
	private String name;
	
	Shape(String name){
		this.name = name;
	}
	
	abstract int getArea();
	
	public void outputShapeInfo() {
		System.out.println("Shape:" +this.name+" with area:" +this.getArea());
	}

	public void setArea(int area) {
		this.area = area;
	}
}
