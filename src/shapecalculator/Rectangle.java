package shapecalculator;

public class Rectangle extends Shape{
	private int hight;
	private int lengh;
	
	public Rectangle() {
		super("Rectangle");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateArea() {
		this.area = this.hight*this.lengh;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getLengh() {
		return lengh;
	}

	public void setLengh(int lengh) {
		this.lengh = lengh;
	}

	
}
