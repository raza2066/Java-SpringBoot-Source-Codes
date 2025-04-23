package a05Interface;

import a05Interface.Status;

@SuppressWarnings("unused")
public class Z04EnumsWithSwitch {
	public static void main(String[] args) {
		
		Status status = Status.Running;
		
		switch (status) {
		case Status.Running:
			System.out.println("All Good");
			break;
		case Status.Failed:
			System.out.println("Try Again");
			break;
		case Pending:
			System.out.println("Please Wait");
			break;
		case Success:
			System.out.println("Done");
			break;

		default:
			System.out.println("Invalid");
			break;
		}
	}
}
