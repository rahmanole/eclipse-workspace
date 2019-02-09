package syncMethodDemo;

public class ForDemoObj implements Runnable{
	
	
	@Override
	public void run() {
		//xMethod();
		printNum();
		staticSyncMethod();
	}
	public void xMethod() {
		System.out.println("Inside non-synchronized method "+Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void printNum() {
		System.out.println("Inside synchronized method "+Thread.currentThread().getName());
		for(int i = 0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	//example for static sync method
	public static synchronized void staticSyncMethod() {
		System.out.println("Inside synchronized method "+Thread.currentThread().getName());
		for(int i = 0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
