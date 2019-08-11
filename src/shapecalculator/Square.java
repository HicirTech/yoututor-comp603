package shapecalculator;

public class Square extends Rectangle {
        private int testing;

    public int getTesting() {
        return testing;
    }

    public void setTesting(int testing) {
        this.testing = testing;
    }
    
	Square(){
		this.setName("Square");
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		this.area = this.getHight()*this.getHight();
	}
	
	
}
