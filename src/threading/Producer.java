package threading;

import java.util.List;

public class Producer implements Runnable {
	private int MAX_BUFFER;
	private List<Integer> queue;

	public Producer(int buffer, List<Integer> queue) {
		MAX_BUFFER = buffer;
		this.queue = queue;
	}

	private void produce(int msg) throws InterruptedException {
		synchronized (queue) {
			if (MAX_BUFFER == queue.size()) {
				System.out.println("waiting for consumer to consumer messages");
				try {
					System.out.println(Thread.currentThread().getName());
					queue.wait();
				} catch (InterruptedException e) {
					System.out.println("eXCEPTION" + e);
				}
			}
			Thread.sleep(1000);
			queue.add(msg);
			System.out.println("Produced message " + msg);
			queue.notify();
			System.out.println(Thread.currentThread().getName());
		}
	}

	public void run() {
		int counter = 0;
		while (true) {
			try {
				produce(counter++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
