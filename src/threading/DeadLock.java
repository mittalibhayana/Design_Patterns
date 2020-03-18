package threading;

public class DeadLock {

	public static void main(String[] args) {
		DeadLock deadLock = new DeadLock();

		final A a = deadLock.new A();

		final B b = deadLock.new B();

		Runnable block1 = new Runnable() {
		    public void run() {
		        synchronized (b) {
		        	System.out.println("b block 1");
		            try {
		                // Adding delay so that both threads can start trying to
		                // lock resources
		                Thread.sleep(100);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		            // Thread-1 have A but need B also
		            synchronized (a) {
		                System.out.println("In block 2");
		            }
		        }
		    }
		};
		 
		// Thread-2
		Runnable block2 = new Runnable() {
		    public void run() {
		        synchronized (b) {
		        		System.out.println("b block 2");
		        	synchronized (a) {
		                System.out.println("In block 1");
		            }
		        }
		    }
		};
		new Thread(block2).start();
		
	}
	class A {
		private int i = 10;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
	}

	class B {
		private int i = 20;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
	}

}
