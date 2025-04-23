package a07Threads;

class Counter{
	int count;
	public synchronized void increment() {
		count++;
	}
}

public class Z04RaceCondition {
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		Runnable obj1 = ()->{
			for(int i = 0; i<1000; i++) {
				counter.increment();
			}
		};
		
		Runnable obj2 = ()->{
			for(int i = 0; i<1000; i++) {
				counter.increment();
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		
		try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//		
		System.out.println(counter.count);
	}
}
