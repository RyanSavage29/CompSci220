/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Project4
 ******************************/ 
 
import java.util.Scanner;
import java.util.ArrayList;

public class ExpAcct
{	
	static Scanner scnr = new Scanner(System.in);
	static ArrayList<ExpressAccount> accounts = new ArrayList<ExpressAccount>();
	static int current;
	static int accountNumber = 0;
	static boolean run = true;
	static boolean user = false;
	
	public static void mainMenu()
	{
		System.out.print("\nMAIN MENU\n1.) Create a new account\n2.) Log into an existing account\n3.) Exit the banking system\nPlease enter your selection: ");
			
			switch (scnr.nextInt())
			{
				case 1: newAccount();
						user = true;
				break;
				
				case 2:	retrieveAccount();
				break;
				
				case 3: run = false;
						System.out.println("Exiting the system");
				break;

				default:System.out.println("Enter 1, 2, or 3 to traverse this menu.");
				break;

			}
	}
	
	public static void newAccount()
	{
		accounts.add(new ExpressAccount(accountNumber));
		current = accountNumber;
		accountNumber++;
	}

	public static void retrieveAccount()
	{
		System.out.print("\nEnter account number: ");
		current = scnr.nextInt();
		if (current < 0 || current > accounts.size()-1)
		{
			System.out.println("Enter an account that exsists.");
		}
		else
		{
			user = true;
			System.out.println("Welcome back Student Express account #" + accounts.get(current).getAccountNumber() + ", balance: $" + accounts.get(current).getAccountBalance() + ", number of meals: " + accounts.get(current).getNumOfMeals());
		}
	}
	
	public static void userMenu()
	{
		System.out.println(accounts.get(current));
		System.out.print("1.) Make a deposit\n2.) Purchase meals\n3.) Have meal\n4.) Log out\nPlease enter your selection: ");
			
			switch (scnr.nextInt())
			{
				case 1: System.out.print("Enter deposit amount: ");
						accounts.get(current).depositAmount(scnr.nextInt());
				break;
				
				case 2: System.out.print("Enter the number of meals you want to purchase: ");
						accounts.get(current).purchaseMeals(scnr.nextInt());
				break;
				
				case 3: accounts.get(current).eatMeal();
				break;

				case 4: System.out.println("Goodbye!");
						user = false;
				break;
				
				default:System.out.println("Enter 1, 2, 3, or 4 to traverse this menu.");
				break;

			}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Express Account Company");
		while (run)
		{
			mainMenu();
			while (user)
			{
				userMenu();
			}
		}
	}
}