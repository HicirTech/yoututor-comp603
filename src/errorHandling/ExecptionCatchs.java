package errorHandling;

public class ExecptionCatchs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester t = new Tester();
		
		try {
			System.out.println(t.toString());
		}catch(NullPointerException e) {
			System.out.println("Catched!");
		}finally {
			System.out.println("Finally");
		}
		
	//	System.out.println(t.toString());
		System.out.println("____");
	}

}
