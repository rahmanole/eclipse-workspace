package concurrencyDemo;

public class Test {
	public static void main(String[] args) {
		myRunnable r1 = new myRunnable();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		//t2.start();
		synchronized (t1) {
			try {
				t1.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(r1.total);
	}
}
