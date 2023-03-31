package lets_grow_more;

import java.util.*;
public class Task1
{

	public static void main(String[] args) 
	{
		
        System.out.println("1. Rupee(INR)");
        System.out.println("2.  Dollar(USD)");
        System.out.println("3. Euro(YUAN)");
       
     
        Scanner sc = new Scanner(System.in);
        System. out.println("Select the currency :");
        int choice = sc.nextInt();
        System.out.println("Enter amount :");
        double amount = sc.nextDouble();
	        switch (choice)
	        {
	        	
	        	
		            case 1:
		                Rupee(INR)_to_other(amount);
		                break;
		            case 2:
		                 Dollar(USD)_to_other(amount);
		                break;
		            case 3:
		                Euro(YUAN)_to_other(amount);
		                break;
		           
		            default:
		                System.out.println("Invalid choice");
	        	
	        }
      

    }

	public static void Rupee_to_other(double amount)
	{
	    System.out.println("1 Rupee(INR) = " + 0.013 + "  Dollar(USD)");
	    System.out.println();
	
	    System.out.println(amount+" Rupee(INR) = " + (amount*0.013) + "  Dollar(USD)");
	    System.out.println();
	
	    System.out.println("1 Rupee(INR) = " + 0.012 + " Euro(YUAN)");
	    System.out.println();
	    System.out.println(amount+" Ruppe = " + (amount*0.012) + " Euro(YUAN)");
	    System.out.println();
	
	}
    

	public static void  Dollar_to_other(double amount)
	{
	    System.out.println("1  Dollar(USD) = " + 79.37 + " Rupee(INR)");
	    System.out.println();
	    System.out.println(amount+"  Dollar(USD) = " + (amount*79.37) + " Rupee(INR)");
	    System.out.println();
	
	    System.out.println("1  Dollar(USD)= " + 0.98 + " Euro(YUAN)");
	    System.out.println();
	
	    System.out.println(amount+"  Dollar(USD) = " + (amount*0.98) + " Rupee(INR)");
	}

    

	public static void Euro_to_other(double amount)
	{
	    System.out.println("1 Euro(YUAN) = " + 80.85 + " Rupee(INR)");
	    System.out.println();
	    System.out.println(amount+" Euro(YUAN) = " + (amount*80.85) + " Rupee(INR)");
	    System.out.println();
	
	    System.out.println("1 Euro(YUAN) = " + 1.02 + "  Dollar(USD)");
	    System.out.println();
	
	    System.out.println(amount+" Euro(YUAN) = " + (amount*1.02) + "  Dollar(USD)");
	}

}


