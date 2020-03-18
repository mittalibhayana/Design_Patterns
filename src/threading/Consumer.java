package threading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Consumer implements Runnable {
	private List<Integer> sharedList;

	public Consumer(List<Integer> list) {
		sharedList = list;
	}

	private void consume() throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.isEmpty()) {
				System.out.println("Waiting for new messages");
				sharedList.wait();
				System.out.println(Thread.currentThread().getName());
			}
			Thread.sleep(1000);
			int i = sharedList.remove(0);
			System.out.println("Message consumed" + i);
			sharedList.notify();
			System.out.println(Thread.currentThread().getName());
		}
	}

	public void run() {
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//ConcurrentHashMap<K, V>
		List<Integer> list = new ArrayList<>();
		Producer producer = new Producer(5, list);
		Consumer consumer = new Consumer(list);
		String s ="dum";
		s.concat("y");
		System.out.println(s);
		
		HashMap<String,String> map= new HashMap<>();
		map.put(null, "1");
		
		for(String i: map.keySet()) {
			System.out.println(map.get(i));
		}new Thread(producer).start();
		new Thread(consumer).start();
	}
}
