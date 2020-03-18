package threading;


public class TaskExecutor implements Runnable {
	BlockingQueue<Runnable> queue;
	
	public TaskExecutor(BlockingQueue<Runnable> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		try {
			while (true) {
				String name = Thread.currentThread().getName();
				Runnable task = queue.dequeue();
				System.out.println("Task Started by Thread :" + name + task);
				task.run();
				System.out.println("Task Finished by Thread :" + name);
			}
		} catch (Exception e) {
			System.out.println("ex-- "+e);
		}
	}

}
