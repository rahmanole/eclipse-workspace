package interThreadCommunication;

public class WaitNotifyDemo extends Thread{
	public int total = 0;
	
	@Override
	public void run() {
		findToatal();
//		synchronized (this) {
//			findToatal();
//			this.notify();
//		}
		
//		for(long i = 0l;i<10000000000l;i++) {
//			
//		}
		System.out.println("Done");
	}
	
	public int findToatal() {
		for(int i=1;i<=100;i++) {
			total += i;
		}
		return total; 
	}
}
