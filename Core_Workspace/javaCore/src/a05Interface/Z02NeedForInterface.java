package a05Interface;

interface Computr{
	void code();
}

class Lapt implements Computr{
	public void code() {
		System.out.println("Code, compile, run......");
	}
}

class Deskt implements Computr{
	public void code() {
		System.out.println("Code, compile, run...... faster");
	}
}

class developr{
	public void devapp(Computr comp) {
		comp.code();
	}
}

public class Z02NeedForInterface {
	public static void main(String[] args) {
		Computr lap = new Lapt();
		Computr deskt = new Deskt();
		
		lap.code();
		deskt.code();
	}
}