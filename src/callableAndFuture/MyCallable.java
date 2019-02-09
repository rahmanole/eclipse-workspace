package callableAndFuture;

import java.util.concurrent.Callable;

public class MyCallable implements Callable{
	int n;
	public MyCallable(int n) {
		this.n = n;
	}

	@Override
	public Object call() throws Exception {
		int total = 0;
		for(int i = 1;i<=this.n;i++) {
			total += i;
		}
		return total;
	}
	
}
