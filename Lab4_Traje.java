package FinalLabActivity;
import java.util.Scanner;

public class Lab4_Traje {
	
	
	public static void main(String [] args ) {
		int num1, num2, sum;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input the first number: ");
		num1 = input.nextInt();
		
		System.out.println("Input the second number: ");
		num2 = input.nextInt();
		
		sum= num1 + num2;
		System.out.println();
		System.out.println("Sum " + sum);
		
	}

}
