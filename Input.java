import java.util.Scanner;

public class Input {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your fakening name :");
		String name = scan.nextLine();
		
		System.out.println("Where are you located ?");
		String located = scan.nextLine();
		
		System.out.println("What is the name of your university ?");
		String university = scan.nextLine();
		
		System.out.println("Enter your fakening age :");
		int age = scan.nextInt();
		
		System.out.println("What is your year :");
		int year = scan.nextInt();
		
		System.out.println("What is your height ? ");
		int height = scan.nextInt();
		
	}

}
