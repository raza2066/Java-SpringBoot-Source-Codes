package a07Threads;

class A extends Thread{
	public void run() {
		for(int i =0 ;i<100; i++) {
			System.out.println("Hi, from A===========");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i =0 ;i<100; i++) {       
			System.out.println("===========Hi, from B");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class C extends Thread{
	public void run() {
		for(int i =0 ;i<100; i++) {
			System.out.println("======Hi, from C=====");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Z01ThreadsDemo {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		c.setPriority(Thread.MAX_PRIORITY);
		//SETTING PRIORITY DOES NOT MEAN IT WILL EXECUTE FIRST
		//IT ONLY GIVES THE PRIORITY TO BE EXECUTED FIRST 
		 
		a.start();
		b.start();
		c.start();
	}
}
