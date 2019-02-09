package deadLock;

public class DeadLockDemo{

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				a.a(b);
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				b.b(a);
			}
		});
		
		t1.start();
		t2.start();
	}
}
