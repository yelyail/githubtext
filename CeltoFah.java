package CeltoFah;

import java.util.Scanner;

public class CeltoFah {
	public static void main(String [] args ) {
		Scanner user_input=new Scanner(System.in);
		double fah,cel;
		System.out.println("Enter a temperature of °C:");
		cel=user_input.nextDouble ();
		fah = (1.8*cel)+32;
		System.out.println(fah + "°F");
	
	}

}
