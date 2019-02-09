package demonThread;

public class DemonThreadDemo {
	public static void main(String[] args) {
		ChildThread t = new ChildThread();
		t.setDaemon(true);
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}
