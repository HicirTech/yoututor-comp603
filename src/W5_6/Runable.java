package W5_6;

public class Runable {
	
	public static void main(String[] args) {
            
            
                //通过接口实现
		ImplementRunable i1 = new ImplementRunable("Runnable 1");
		ImplementRunable i2 = new ImplementRunable("Runnable 2");
		ImplementRunable i3 = new ImplementRunable("Runnable 3");
		ImplementRunable i4 = new ImplementRunable("Runnable 4");
		Thread t = new Thread(i1);
		Thread t2 = new Thread(i2);
		Thread t3 = new Thread(i3);
		Thread t4 = new Thread(i4);
		t.start();
		t2.start();
		t3.start();
		t4.start();
		//通过extends thread实现
                ExtendsThreads et = new ExtendsThreads("Thread 0");
                ExtendsThreads et1 = new ExtendsThreads("Thread 1");
                
                et.start();
                et1.start();
	}

}
