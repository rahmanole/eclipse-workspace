package syncBlockDemo;

public class ForDemoObj implements Runnable {
	
	ForLockTestObj testLock = new ForLockTestObj();
	@Override
	public void run() {
		xMethod();
	}

	public void xMethod() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}

		synchronized (this) {
			 System.out.println("Inside synchronized blcok"+Thread.currentThread().getName());
			for (int i = 0; i < 3; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		}
		
		synchronized (testLock) {
			 System.out.println("Holding other obj lock"+Thread.currentThread().getName());
			testLock.printThreadsName();
		}
	}

}
