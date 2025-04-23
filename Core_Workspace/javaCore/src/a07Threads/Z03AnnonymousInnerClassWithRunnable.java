package a07Threads;

public class Z03AnnonymousInnerClassWithRunnable {
	public static void main(String[] args) {
		
		Runnable obj1 = ()-> 
		{
			for(int i =0 ;i<5; i++) {
				System.out.println("Hi, from D===========");
				try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
			}
		};
		
		Runnable obj2 = ()-> 
		{
			for(int i =0 ;i<5; i++) {
				System.out.println("Hi, from ===========E");
				try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
			}
		};


		

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}
}
