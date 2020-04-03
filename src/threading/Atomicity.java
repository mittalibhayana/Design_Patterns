package threading;

public class Atomicity implements Runnable {

	private volatile int counter;

	public int increment() {
		return counter++;
	}

	
	public int getCount() {
		return this.counter;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Atomicity a = new Atomicity();
		 Thread t1 = new Thread(a, "t1");
	        t1.start();
	        Thread t2 = new Thread(a, "t2");
	        t2.start();
	        t1.join();
	        t2.join();


		System.out.println(a.getCount());

	}

	@Override
	public void run() {
			
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Thread : "+ Thread.currentThread().getName()+" found value before increment: " + counter);
			try {
				Thread.sleep(i * 100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			increment();
			System.out.println("Thread : "+ Thread.currentThread().getName()+" incremented value : " + counter);
		}

	}
}
