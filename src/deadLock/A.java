package deadLock;

public class A {
	public synchronized void a(B b){
		System.out.println("Entered in a");
		b.lastB();
	}
	
	public synchronized void lastA() {
		System.out.println("From A");
	}
}
