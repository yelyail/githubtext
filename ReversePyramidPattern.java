package ReversePyramidPattern;

import java.util.Scanner;

public class ReversePyramidPattern {
	
	int i,j,k,number;
	Scanner user_input;
	
	public ReversePyramidPattern()
	{
		user_input=new Scanner(System.in);
		System.out.print("Enter number of layers :");
		number=user_input.nextInt();
		
	}
		public void printReversePyramid()
	{
			
		for(i=number;i>=1;i--)
			
		{
			for (j=number;j>i;j--)
				System.out.print(" ");
			for (k=1;k<(i*2);k++)
				System.out.print("*");
			System.out.print("\n");
				
	}
	}
	public static void main(String [] args) {
		
		ReversePyramidPattern obj=new ReversePyramidPattern();
		obj.printReversePyramid();
	}

}
