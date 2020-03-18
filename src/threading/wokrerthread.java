package threading;

public class wokrerthread  implements Runnable {
	
private String taskName;

public wokrerthread(String name) {
	this.taskName = name;
}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " starting " + taskName);
		processTask();
		System.out.println(Thread.currentThread().getName()+ " ending " + taskName);
		
	}

	private void processTask() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public String toString() {
		return "wokrerthread [taskName=" + taskName + "]";
	}


}
