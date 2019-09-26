package adapterPattern;

public class AnotherModel implements Iadapter{

	private int length;
	private int weight;
	
	AnotherModel(int length, int weight){
		this.length=length;
		this.weight=weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "AnotherModel [length=" + length + ", weight=" + weight + "]";
	}

	@Override
	public void printOutInfo() {
		System.out.println("Another Model");
		
	}
	
	
}
