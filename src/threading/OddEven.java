package threading;

public class OddEven implements Runnable {

	private boolean isEven;
	private Printer print;

	public OddEven(Printer p, boolean isEven) {
		super();
		print = p;
		this.isEven = isEven;
	}

	@Override
	public void run() {

		int number = isEven ? 2 : 1;
		while (number <= 10) {
			if (isEven) {
				print.printEven(number);
			} else {
				print.printOdd(number);
			}
			number = number + 2;
		}

	}

	public static void main(String[] args) {
		Printer p = new Printer();
		new Thread(new OddEven(p, false),"odd").start();
		new Thread(new OddEven(p, true),"even").start();

	}
}

class Printer {

	private volatile boolean isOdd;

	synchronized void printEven(int nu) {
		while (!isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName() + "-" + nu);
		isOdd = false;
		notify();
	}

	synchronized void printOdd(int nu) {

		while (isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println(Thread.currentThread().getName() + "-" + nu);
		isOdd = true;
		notify();
	}

}