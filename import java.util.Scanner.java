import java.util.Scanner;

public class Main {
  public static void main(String [] args ) {
    Scanner scanner=new Scanner(System.in);

    int x = 10;
    System.out.println(x);
    int y = 20;
    System.out.println(y);

    //formula
    int addition = x+y;
    int subtraction = x-y;
    int division = x/y;
    int multiplication = x*y;
    int modulo = x%y;

    System.out.println(addition);
    System.out.println(subtraction);
    System.out.println(division);
    System.out.println(multiplication);
    System.out.println(modulo);
  }
  
}
