package interThreadCommunication;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		WaitNotifyDemo t1 = new WaitNotifyDemo();
		
		
		System.out.println(Thread.currentThread().getName());
		
		t1.join();
		//Thread.sleep(200);
		System.out.println(t1.total);
		t1.start();
		
//		synchronized (t1) {
//			System.out.println("Main thread calling wait method!!");
//			System.out.println("Main thread got notification!!");
//			t1.wait();
//			t1.join();
//			System.out.println(t1.total);
//		}
		
	}
}
