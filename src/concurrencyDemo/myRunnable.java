package concurrencyDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class myRunnable implements Runnable {
	ReentrantLock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	int total = 0;

	@Override
	public void run() {
		
		synchronized (this) {
			notify();
		}
		xMethod();
	}

	public void xMethod() {
		// lock.lock();
		for (int i = 1; i <= 10; i++) {
			// System.out.println(Thread.currentThread().getName());
			total += i;

		}

		// lock.unlock();
	}
}
