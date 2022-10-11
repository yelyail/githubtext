package Act;
import java.util.Scanner; 

public class Main {
	public static void main(String [] args) {
		
		Scanner input = new Scanner (System.in);
		int num1, num2, num3;
		double year = 0.10;
		double twotofiveyears = 0.20;
		double fiveyears = 0.30;
		
		System.out.println("Enter salary: ");
		num1 = input.nextInt();
		
		System.out.println("Enter salary: ");
		num2 = input.nextInt();
		
		System.out.println("Enter salary: ");
		num3 = input.nextInt();
		
		double service1 = num1 * year;
		double service2 = num2 * twotofiveyears;
		double service3 = num3 * fiveyears;
		
		System.out.println("If you have 1 year of service: " + service1);
		System.out.println("If you have 2-5 years of service: " + service2);
		System.out.println("If you have 5 years and above of service:: " + service3);
	}
}
