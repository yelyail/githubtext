package Ordering;
import java.util.Scanner;

public class CoffeeShop {
	public static void main(String [] args)
	{
		Scanner coffee = new Scanner (System.in);
		
		// menu list
		int Americano = 149;
		int Espresso = 175;
		int BlackCoffee = 145;
		int Cappucino = 165;
		int Vanilla = 135;
		
		int quantity;
		int total;
		int pay;
		
		System.out.println("Do you want to order?");
		char a = coffee.next().charAt(0);
		while (a!= -1)
		{
			switch (a) {
			case 'n':
				System.out.println("======J's Coffee Shop======\n=========Thank You=========");
				System.exit(0);
			case 'y':
				System.out.println("Welcome to J's Coffee Shop\n=====J's Coffee Shop=====\n==========Menu===========" + "\n"
						+ "[1]Americano - 149\n"
						+ "[2]Espresso - 175\n"
						+ "[3]Black coffee - 145\n"
						+ "[4]Cappucinno - 165\n"
						+ "[5]Vanilla Latte - 135\n"
						+ "[6]Exit\n"
						+ "Enter your order: ");
					int order = coffee.nextInt();
					
						switch (order)
						{
						case 1:
						do {
							System.out.println("How much do you want for Americano?");
							quantity = coffee.nextInt();
							total = quantity * Americano;
							System.out.println("Your total is: " + total);
							System.out.println("Payment " );
							pay = coffee.nextInt();
							
								if (pay > total)
								{
									int payment = pay - total;
									System.out.println("Your change is " + payment);
								}
								else 
								{
									System.out.println("Not enough money! ");
								}
								
								
								System.out.println();
								System.out.println("Thank you for purchasing at J's Coffee Shop\nHope to see you soon");
								System.out.println("Customer's Receipt");
								System.out.println();
								System.out.println("You order " + quantity + " Americano"
										+ "\nTotal: " + total + " Php" 
										+ "\nCash: "+ pay + " Php"
										+ "\nChange: " + (pay - total) + " Php");
								System.out.println();
						break; 
						}
						while (true);
						break;
						
						
						case 2:
							do {
								System.out.println("How much do you want for Espresso?");
								quantity = coffee.nextInt();
								total = quantity * Espresso;
								System.out.println("Your total is: " + total);
								System.out.println("Payment ");
								pay = coffee.nextInt();
									if (pay > total)
									{
										int payment = pay - total;
										System.out.println("Your change is " + payment);
									}
									else 
									{
										System.out.println("Not enough money! ");
									}
									
									System.out.println();
									System.out.println("Thank you for purchasing at J's Coffee Shop\nHope to see you soon");
									System.out.println("Customer's Receipt");
									System.out.println();
									System.out.println("You order " + quantity + " Espresso"
											+ "\nTotal: " + total + " Php" 
											+ "\nCash: "+ pay + " Php"
											+ "\nChange: " + (pay - total) + " Php");
									System.out.println();
							break; }
							while (true);
							break;
							
						case 3:
							do {
								System.out.println("How much do you want for Black Coffee?");
								quantity = coffee.nextInt();
								total = quantity * BlackCoffee;
								System.out.println("Your total is: " + total);
								System.out.println("Payment ");
								pay = coffee.nextInt();
									if (pay > total)
									{
										int payment = pay - total;
										System.out.println("Your change is " + payment);
									}
									else 
									{
										System.out.println("Not enough money! ");
									}
									
									System.out.println();
									System.out.println("Thank you for purchasing at J's Coffee Shop\nHope to see you soon");
									System.out.println("Customer's Receipt");
									System.out.println();
									System.out.println("You order " + quantity + " Black Coffee"
											+ "\nTotal: " + total + " Php" 
											+ "\nCash: "+ pay + " Php"
											+ "\nChange: " + (pay - total) + " Php");
									System.out.println();
							break; }
							while (true);
							break;
							
						case 4: 
							do {
								System.out.println("How much do you want for Cappucino?");
								quantity = coffee.nextInt();
								total = quantity * Cappucino;
								System.out.println("Your total is: " + total);
								System.out.println("Payment ");
								pay = coffee.nextInt();
									if (pay > total)
									{
										int payment = pay - total;
										System.out.println("Your change is " + payment);
									}
									else 
									{
										System.out.println("Not enough money! ");
									}
									
									System.out.println();
									System.out.println("Thank you for purchasing at J's Coffee Shop\nHope to see you soon");
									System.out.println("Customer's Receipt");
									System.out.println();
									System.out.println("You order " + quantity + " Cappucino"
											+ "\nTotal: " + total + " Php" 
											+ "\nCash: "+ pay + " Php"
											+ "\nChange: " + (pay - total) + " Php");
									System.out.println();
							break; }
							while (true);
							break;
							
						case 5: 
							do {
								System.out.println("How much do you want for Vanilla Latte?");
								quantity = coffee.nextInt();
								total = quantity * Vanilla;
								System.out.println("Your total is: " + total);
								System.out.println("Payment ");
								pay = coffee.nextInt();
									if (pay > total)
									{
										int payment = pay - total;
										System.out.println("Your change is " + payment);
									}
									else 
									{
										System.out.println("Not enough money! ");
									}
									
									System.out.println();
									System.out.println("Thank you for purchasing at J's Coffee Shop\nHope to see you soon");
									System.out.println("Customer's Receipt");
									System.out.println();
									System.out.println("You order " + quantity + " Vanilla Latte"
											+ "\nTotal: " + total + " Php" 
											+ "\nCash: "+ pay + " Php"
											+ "\nChange: " + (pay - total) + " Php");
									System.out.println();
							break; }
							while (true);
							break;
							
						case 6: 
							System.exit(0);
							System.out.println("Thank you come again!");
							default :
								System.out.println("Not valid!");
						}
			}
			
		}
	}

}
