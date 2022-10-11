package LabQuiz1_TrajeCastones;
import java.util.Scanner;

public class TrajeQuiz1{
	
	public static void main(String[] args ) {
		@SuppressWarnings("resources")
	Scanner user_input= new Scanner(System.in);

		
		System.out.println("Enter Length: ");
		int length = user_input.nextInt();
		
		System.out.println("Enter Width: ");
		int width = user_input.nextInt();
		
		//formula
		int Area = length * width;
		int Perimeter = 2 * length + 2 * width;
		
		System.out.println("Area: " + Area );
		
		System.out.println("Perimeter: " + Perimeter);
		
		
		
		
		
}
}