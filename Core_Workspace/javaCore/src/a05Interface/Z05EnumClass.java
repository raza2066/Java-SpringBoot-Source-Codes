package a05Interface;

enum Laptop{
	Macbook(2000), XPS(2200), Surface(1500), Thinkpad(1800);
	
	private int price;

	Laptop(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class Z05EnumClass {
	public static void main(String[] args) {
		for(Laptop lt:Laptop.values()) {
			System.out.println(lt+ ": "+lt.getPrice());
		}
	}
}
