package shapecalculator;

public class Circle extends Shape{

	private int r;
	
	public Circle() {
		super("Circle");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateArea() {
		this.area = 2*r*Math.PI;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

}
