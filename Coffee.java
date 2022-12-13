
package Ordering;
import javax.swing.*;
import java.util.Scanner;
public class Coffee {
	
	static double subTotal;
	public static double runningTotal;
	private static double itemPrice;
	static boolean ordering = true;
	static Scanner sc =  new Scanner(System.in);
	public static String name;
	static int menuOption;
	static boolean ab = true;

	public static void main(String[] args) {
		while(ab) {
		menuOption = Integer.parseInt(JOptionPane.showInputDialog("Welcome to \n            "
				+ "Zipp De Caffe"+"\n========MENU========\n"
				+"[1]Americano - 149\n"
				+"[2]Espresso - 175\n"
				+"[3]Black coffee - 145\n"
				+"[4]Cappucinno - 165\n"
				+"[5]Vanilla - 135\n"
				+"[6]Calculate total\n"
				+"[7]Exit\n"
				+"\nEnter Order: "));
		
		itemPrice(menuOption);
		}
	}
	public static double itemPrice(int flavorCoffee) {
		
		if(flavorCoffee == 1) {
			JOptionPane.showMessageDialog(null,"Zipp De Caffe\n========MENU========\n"+"You selected Americano\n");
			itemPrice = 149;
		}

		if(flavorCoffee == 2) {
			JOptionPane.showMessageDialog(null,"Zipp De Caffe\n========MENU========\n"+"You selected Espresso\n");
			itemPrice = 175;
		}
		if(flavorCoffee == 3) {
			JOptionPane.showMessageDialog(null,"Zipp De Caffe\n========MENU========\n"+"You selected Black coffee\n");
			itemPrice = 145;
		}
		if(flavorCoffee == 4) {
			JOptionPane.showMessageDialog(null,"Zipp De Caffe\n========MENU========\n"+"You selected Cappucinno\n");
			itemPrice = 165;
		}
		if(flavorCoffee == 5) {
			JOptionPane.showMessageDialog(null,"Zipp De Caffe\n========MENU========\n"+"You selected Vanilla\n");
			itemPrice = 135;	
		}
	    if(flavorCoffee == 6) {
	    	return calculate();
	    }
	    if(flavorCoffee == 7) {
	    	System.exit(0);
	    }
		
		quantity();
		return itemPrice;
	}
	public static double quantity() {
		Double quantity = Double.parseDouble(JOptionPane.showInputDialog("Enter Quantity"));
		
		subTotal(quantity, itemPrice);
		return itemPrice;
	}
	public static double subTotal(double quantity, double itemPrice) {
		double subTotal = quantity*itemPrice;
		runningTotal += subTotal;
		return subTotal;	
	}
	public static double calculate() {
	boolean ac = true;	
		while(ac) {
			
		
		ordering = true;
		double cash = Double.parseDouble(JOptionPane.showInputDialog("Total amout Due: "+ runningTotal+ "\nEnter Cash: PHP"));
		double change = cash - runningTotal;
		if (cash<runningTotal) {
			JOptionPane.showMessageDialog(null, "NOT ENOUGH CASH", null, JOptionPane.WARNING_MESSAGE);
	}
		else {
			JOptionPane.showMessageDialog(null,"CHANGE: PHP"+ change +"\nTHANK YOU!");
		    ac = false;
		}
		}	
			
	
		itemPrice = 0;
		subTotal = 0;
		runningTotal = 0;
		return itemPrice;
	}	
}