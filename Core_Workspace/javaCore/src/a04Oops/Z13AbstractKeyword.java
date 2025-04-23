package a04Oops;

abstract class Car{
	public abstract void drive();
	public abstract void drift();
	public void playMusic() {
		System.out.println("Playing Music");
	}
}

class Suzuki extends Car{
	public void drive() {
		System.out.println("Driving Suzuki");
	}
	public void drift() {
		System.out.println("Drifting LIke Tokyo");
	}
}

public class Z13AbstractKeyword {
	public static void main(String[] args) {
		Suzuki car = new Suzuki();
		car.drive();
		car.playMusic(); 
		car.drift();  
	}
}
