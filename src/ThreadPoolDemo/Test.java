package ThreadPoolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {
		PrintJob[] job = {new PrintJob("Minhaz"),
						new PrintJob("Arif"),
						new PrintJob("Shetu"),
						new PrintJob("Shawkat"),
						new PrintJob("Yasin"),
						new PrintJob("Shagar")}; 
		
		ExecutorService threadPool= Executors.newFixedThreadPool(3);
		//if threads are more than job then extra threads will die
		
		for(PrintJob pj:job) {
			threadPool.submit(pj);
		}
		
		threadPool.shutdown();
	}
}
