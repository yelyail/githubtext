package FahtoCel;
import java.util.Scanner;

public class FahCel {
	public static void main(String[] args) {
		
		Scanner user_input=new Scanner(System.in);
		double cel,fah;
		System.out.println("Enter your temperature °F: ");
		fah=user_input.nextDouble();
		cel=(fah-32)/1.8;
		System.out.println(cel + "°C");
		
	}
}
