package concurrencyDemoAccount;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class Account {
	private static ReentrantLock lock = new ReentrantLock();
	private static Condition condition = lock.newCondition();
	private int balance=0;
	
	
	public void withdraw(int withdrwanAmmount ) {
		lock.lock();
		if(withdrwanAmmount>balance) {
			System.out.println("Insufficient balance wait for deposite");
			try {
				condition.await();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			balance -= withdrwanAmmount;
			System.out.println(withdrwanAmmount+"taka withdrwan n/ new balance is "+balance);
		}
		lock.unlock();
	}
	
	public void deposite(int depAmmount) {
		lock.lock();
		balance += depAmmount;
		System.out.println(depAmmount+"taka is deposited n/ current balace is "+balance);
		condition.signal();
		lock.unlock();
	}
}
