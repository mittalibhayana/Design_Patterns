package threading;


public class CustomThreadPool {

	BlockingQueue<Runnable> queue;
	
	public CustomThreadPool(int qSize, int n) {
		queue = new BlockingQueue<>(qSize);
		String tName=null;
		TaskExecutor task=null;
		for(int i=0;i< n;i++) {
			tName = "Thread- "+i;
			task = new TaskExecutor(queue);
			Thread t = new Thread(task, tName);
			t.start();
		}
	}
	
	public void submit(Runnable task) throws InterruptedException {
		queue.enqueue(task);
	}
	
}
