package Ordering;

import java.util.Scanner;

public class Food {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str;
		System.out.println("  ************ Welcome To our BBQ  ************ ");
		System.out.println("=====================================================");
	    //budget
		int pay ;
		
		//Prices list 
		int JavaRice = 10;
		int plainrice = 5;
		int friedrice = 20;
		
		int ChickenAfritada = 50;
		int ChickenAdobo = 50;
		int FishVegetable = 50;
		
		int coke = 20;
		int Royal = 20;
		int Sprite = 20;
		
		int taho = 10;
		int icecandy = 5;
		int icecraem = 15;
		
		
		//variable
		
		int bill;
		int quantity;
	    int total = 0;

		int option;	
		do { 
		System.out.println("                 Main Menu:                ");
		System.out.println("-                1.Rice                   -");
		System.out.println("-                2.Viand                  -");
		System.out.println("-                3.Drinks                 -");
		System.out.println("-                4.Dessert                -");
		System.out.println("-                5.EXIT                   -");
		System.out.println("=====================================================");
		System.out.println("          What Do you Want to Order Today??");
		option = s.nextInt();
		switch (option) {
		  //Rice Options
		  case 1:
        do{     
				System.out.println("Rice Options: ");
				System.out.println("1.) Java Rice  [P10]");
				System.out.println("2.) Plain Rice [P5]");
				System.out.println("3.) Fried Rice [P20]");
				System.out.print("What rice?: ");
				option = s.nextInt();
				switch(option) {
				
				case 1: 
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
        		    total = quantity * JavaRice;
            		System.out.println("price: "+total);

            		break;
				case 2:
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
        		    total = quantity * plainrice;
            		System.out.println("price: "+total);
            		break;
				case 3:
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
        		    total = quantity * friedrice;
        		    
            		System.out.println("price: "+total);
            		break;
				}
			//Transaction
				System.out.println("ENTER YOUR PAYMENT: ");
				pay = s.nextInt();
				if(pay>total) {
					bill = pay-total;
					System.out.println("exchange: "+bill);
					System.out.print("Order more? [y/n]: ");	
				}
				else {
					System.out.println("Not Enough Money");
				}
				str = s.next();}while(!str.equalsIgnoreCase("n"));



           //Viand Options
		  case 2:
        do{		
             	System.out.println("");
				System.out.println("Viand Options: ");
				System.out.println("1.) Chicken Afritada [P50]");
				System.out.println("2.) Chicken Adobo    [P50]");
				System.out.println("3.) Fish Vegetable   [P50]");
				System.out.print("What viand?: ");
				option = s.nextInt();
				switch(option) {
				case 1: 
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
        		    total = quantity * ChickenAfritada;
            		System.out.println("price: "+total);
            		break;
				case 2:
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
        		    total = quantity * ChickenAdobo;
            		System.out.println("price: "+total);
            		break;
				case 3:
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
        		    total = quantity * FishVegetable;
            		System.out.println("price: "+total);
            		break;
				}  
		  //transaction
				   System.out.println("ENTER YOUR PAYMENT: ");
				   pay = s.nextInt();
				   bill = pay-total;
					if(pay>total) {
						bill = pay-total;
						System.out.println("exchange: "+bill);
						System.out.print("Order more? [y/n]: ");	
					}
					else {
						System.out.println("Not Enough Money");
					}
				   str = s.next();}while(!str.equalsIgnoreCase("n"));


        //Drinks Option
		  case 3:
         do{
               System.out.println("");
			   System.out.println("Drinks Option ");
			   System.out.println("1.) coke   [P20]");
			   System.out.println("2.) Royal  [P20]");
			   System.out.println("3.) Sprite [P20]");
				System.out.print("What drinks? ");
				option = s.nextInt();
				switch(option) {
				case 1: 
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
       		    total = quantity * coke;
           		System.out.println("price: "+total);

           		break;
				case 2:
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
       		    total = quantity * Royal;
           		System.out.println("price: "+total);
           		break;
				case 3:
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
       		    total = quantity * Sprite;
           		System.out.println("price: "+total);
           		break;
				}
		//transaction
				System.out.println("ENTER YOUR PAYMENT: ");
			    pay = s.nextInt();
				if(pay>total) {
					bill = pay-total;
					System.out.println("exchange: "+bill);
					System.out.print("Order more? [y/n]: ");	
				}
				else {
					System.out.println("Not Enough Money");
				}
				bill = pay-total;
				System.out.println("exchange: "+bill);
			    System.out.print("Order more? [y/n]: ");
				str = s.next();}while(!str.equalsIgnoreCase("n"));
		  
		  //DESSERT
		  case 4:
        do{
         	  System.out.println("");
        	  System.out.println("Dessert Option");
			  System.out.println("1.) taho    [P10]");
			  System.out.println("2.) ice candy [P5]");
			  System.out.println("3.) ice water [P2]");
				System.out.print("What Dessert? ");
				option = s.nextInt();
				switch(option) {
				case 1: 
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
     		    total = quantity * taho;
         		System.out.println("price: "+total);

         		break;
				case 2:
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
     		    total = quantity * icecandy ;
         		System.out.println("price: "+total);
         		break;
				case 3:
					System.out.print("Enter the desiered Quantity : ");
					quantity = s.nextInt();
     		    total = quantity * icecraem;
         		System.out.println("price: "+total);
         		break;
				}
				//transaction
				System.out.println("ENTER YOUR PAYMENT: ");
			    pay = s.nextInt();
				if(pay>total) {
					bill = pay-total;
					System.out.println("exchange: "+bill);
					System.out.print("Order more? [y/n]: ");	
				}
				else {
					System.out.println("Not Enough Money");
				}
				bill = pay-total;
				System.out.println("exchange: "+bill);
			    System.out.print("Order more? [y/n]: ");
				str = s.next();}while(!str.equalsIgnoreCase("n"));

		  case 5:
			  System.out.println("");
			  System.out.println("WELCOME AGAIN!");
			  System.out.println("");
			  
	}}while(option==5);System.out.println("THANK YOU FOR ODERING WELCOME AGAIN!");  		
}
}