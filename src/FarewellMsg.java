
// super class for the scanner because we are useing scanner to scanner the name of the candidate
import java.util.Scanner;

public class FarewellMsg {

	// Scanner scan = new Scanner(System.in);
	// public void FareWell() {
	/*
	 * String name ; System.out.println("Can I know ur name please? "); name =
	 * scan.nextline();
	 * 
	 * }
	 */
	public static void main(String[] args) {
		sayHelloToUser();
	}

	private static void sayHelloToUser() {
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Can I know ur name please? ");
		name = scan.nextLine();
		System.out.println("Hey we Enjoyed ur company" + name);
	}

}
