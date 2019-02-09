package syncBlockDemo;

public class ForLockTestObj {
	
	public synchronized void printThreadsName() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
