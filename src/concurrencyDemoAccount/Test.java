package concurrencyDemoAccount;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	
	static Account ac = new Account();
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(new withDrawTask());
		executor.submit(new depositeTask());
		executor.shutdown();
	}
	
	static class withDrawTask implements Runnable{
		@Override
		public void run() {
			ac.withdraw((int)(Math.random()*10000));
		}
	}
	
	static class depositeTask implements Runnable{
		@Override
		public void run() {
			ac.deposite((int)(Math.random()*10000));
		}
	}
}
