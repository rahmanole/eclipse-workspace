package syncMethodDemo;

public class Test {
	public static void main(String[] args) {
		ForDemoObj obj = new ForDemoObj();
		ForDemoObj obj2 = new ForDemoObj();
		ForDemoObj obj3 = new ForDemoObj();
		
		Thread t1 = new Thread(obj,"Thread_1");
		Thread t2 = new Thread(obj2,"Thread_2");
		Thread t3 = new Thread(obj3,"Thread_3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
