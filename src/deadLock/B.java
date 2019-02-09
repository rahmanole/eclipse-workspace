package deadLock;

public class B {
	public synchronized void b(A a) {
		System.out.println("Enter in b");
		a.lastA();
	}
	
	public synchronized void lastB() {
		System.out.println("From B");
	}
}
