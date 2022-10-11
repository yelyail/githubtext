package PyramidPattern;

import java.util.Scanner;

public class PyramidPattern {

	int i,j,k,number;
	Scanner user_input;
	
	public PyramidPattern()
	{

		user_input=new Scanner(System.in);
		System.out.print("Enter no of Layers for Pyramid :");
		number=user_input.nextInt();

		for (i=1;i<=number;i++)
			
		{
			for (j=i;j<=number;j++)
				System.out.print(" ");
			for (k=1;k<(i*2);k++)
				System.out.print("*");
			System.out.print("\n");

		}

	}
	public static void main(String[] args )   {
	
			@SuppressWarnings("unused")
			PyramidPattern obj=new PyramidPattern();

		}
		}