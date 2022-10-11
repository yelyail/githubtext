package Act;

import java.util.Scanner; 

public class Act1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "computer";
		int price = 10000;
		int quantity = 2;
		int total = price * quantity;
		
		System.out.println("Enter item 1: " + name);
		System.out.println("Enter price of computer: " + price);
		System.out.println("Enter quantity of computer: " + quantity);
		System.out.println("The total amount for computer is: " + total);
		
		System.out.println();
		
		String item2 = "Keyboard";
		double price2 = 450.25;
		int quantity2 = 2;
		double total2 = (int) price2 * quantity2;
		
		System.out.println("Enter item 2: " + item2);
		System.out.println("Enter price of computer: " + price2);
		System.out.println("Enter quantity of computer: " + quantity2);
		System.out.println("The total amount for keyboard is: " + total2);
		
		System.out.println();
		
		String item3 = "Mouse";
		double price3 = 375.50;
		int quantity3 = 4;
		double total3 = (int) price3 * quantity3;
		
		System.out.println("Enter item 2: " + item3);
		System.out.println("Enter price of computer: " + price3);
		System.out.println("Enter quantity of computer: " + quantity3);
		System.out.println("The total amount for keyboard is: " + total3);
		
		System.out.println();
		
		System.out.println("The total amount of purchase is: " + total + total2 + total3);
		double totalfinal = total + total2 + total3;
		double disc = totalfinal * 0.30;
		double discou = totalfinal - disc; 
		System.out.println("Enter discount in %: 30");
		System.out.println("Total discount is " + disc);
		System.out.println("Total discounted amount of purchase is: " + discou);
		
		System.out.println();
		double cash = 30000 - discou;
		System.out.println("Enter your cash: 30000 " );
		System.out.println("Your change is: " + discou);
		
		System.out.println();
		
		System.out.println("Thank you for purchasing!!!!!!! ");
		
		
	}

}
