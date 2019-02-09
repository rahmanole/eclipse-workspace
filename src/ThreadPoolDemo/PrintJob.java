package ThreadPoolDemo;

public class PrintJob implements Runnable{
	String name;
	public PrintJob(String name) {
		this.name  = name;
	}
	
	@Override
	public void run() {
		System.out.println(this.name+" Job started by "+Thread.currentThread().getName()+" ");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.name+" Job completed by "+Thread.currentThread().getName()+" ");

	}
	
	
}
