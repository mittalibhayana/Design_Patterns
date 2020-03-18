package threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadExecutor {

	
	public static void main(String[] args) {
			RejectedExecutionHandler handler = new RejectionHandler();
		ExecutorService executor = new ThreadPoolExecutor(2,4, 10,TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), handler);
		
		for(int i=0;i<10;i++) {
			Runnable wokrerthread = new wokrerthread(" task "+i);
			executor.execute(wokrerthread);
		}
		
		executor.shutdown();
while(!executor.isTerminated()){
		
		}

System.out.println("Finished catering all tasks");
	}
}
