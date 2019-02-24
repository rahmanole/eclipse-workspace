package concurrencyDemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class myRunnable implements Runnable {
	ReentrantLock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	int total = 0;

	@Override
	public void run() {
		
//		synchronized (this) {
//			notify();
//		}
		if(lock.tryLock()) {
			xMethod();
		}
		System.out.println(Thread.currentThread().getName()+" after xMethod");
	}

	public void xMethod() {
		 //lock.lock();
		for (int i = 1; i <= 5; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name);

		}

		 //lock.unlock();
	}
}
