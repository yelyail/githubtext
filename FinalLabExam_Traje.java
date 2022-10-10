package FinalLabExam_Traje;

import java.util.Scanner;

public class FinalLabExam_Traje {
	@SuppressWarnings("resources")

	public static void main(String[] args) {
		int num1, num2;
		Scanner user_input = new Scanner(System.in);

		double savings = 0.20;
		double FoodAndUtilities = 0.50;
		double discretionaryitems = 0.30;

		// formula
		System.out.println("Enter your pay rate per day: ");
		num1 = user_input.nextInt();

		System.out.println("Enter number of days worked in a month: ");
		num2 = user_input.nextInt();

		double TotalIncome = num1 * num2;
		double ratesavings = TotalIncome * savings;
		double RateFoodAndUtilities = TotalIncome * FoodAndUtilities;
		double RateSdiscretionaryitems = TotalIncome * discretionaryitems;

		double rateSavings = TotalIncome * savings;
		double rateFoodAndUtilities = TotalIncome * FoodAndUtilities;
		double Ratesdiscretionaryitems = TotalIncome * discretionaryitems;

		System.out.println("Total Income: " + TotalIncome);
		System.out.println("Money to spend for food and utilities: " + RateFoodAndUtilities);
		System.out.println("Money to spend for discretionary items: " + RateSdiscretionaryitems);
		System.out.println("Money tha goes to savings " + ratesavings);

		System.out.println();

		System.out.println("Enter your pay rate per day: ");
		num1 = user_input.nextInt();
		System.out.println("Enter number of days worked in a month: ");
		num2 = user_input.nextInt();

		double totalincome = num1 * num2;
		double RateSavings = totalincome * savings;
		double RatefoodAndUtilities = totalincome * FoodAndUtilities;
		double RatesDiscretionaryitems = totalincome * discretionaryitems;

		System.out.println("Total Income: " + totalincome);
		System.out.println("Money to spend for food and utilities: " + RatefoodAndUtilities);
		System.out.println("Money to spend for discretionary items: " + RatefoodAndUtilities);
		System.out.println("Money tha goes to savings " + RateSavings);
	}

}
