package threading;

public class MainExeutor {

	
	public static void main(String[] args) throws InterruptedException {
		CustomThreadPool pool = new CustomThreadPool(3, 4);
		for(int i=1;i<7;i++) {
			TestTask task = new TestTask(i);
			pool.submit(task);
		}
	}
}
