package a07Threads;


class AA implements Runnable{
	public void run() {
		for(int i =0 ;i<100; i++) {
			System.out.println("Hi, from AA===========");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class BB implements Runnable{
	public void run() {
		for(int i =0 ;i<100; i++) {       
			System.out.println("===========Hi, from BB");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class CC implements Runnable{
	public void run() {
		for(int i =0 ;i<100; i++) {
			System.out.println("======Hi, from CC=====");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Z02Runnable {
	public static void main(String[] args) {
		Runnable a = new AA();
		Runnable b = new BB();
		Runnable c = new CC();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
