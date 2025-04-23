package a05Interface;

enum Status{
	Running, Failed, Pending, Success;
}
public class Z03Enums {
	public static void main(String[] args) {
		Status status = Status.Success;
		System.out.println(status);
		System.out.println(status.ordinal());
		
		System.out.println("***********");
		
		Status[] statusArray = Status.values();
		for(Status z :statusArray) {
			System.out.println(z+" "+ z.ordinal());
		}
		
	}
}
