package threading;

public class TestTask implements Runnable {

	private int number;
	
	public TestTask(int n) {
		this.number = n;
	}
	
	@Override
	public void run() {
		System.out.println("Start executing of task number :"+ number);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("eception "+e);
		}
		  System.out.println("End executing of task number :"+ number);
	}
}
