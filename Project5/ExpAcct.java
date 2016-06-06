/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Project5
 ******************************/ 
 
import java.util.Scanner;
import java.util.ArrayList;

/****************************************************************************************************************************
* Class ExpAcct is a driver class that allows the user to instantiate and update ExpressAccounts
* Includes methods to run a main menu, a user menu, create an ExpressAccount, retrieve an ExpressAmount, and run the program
****************************************************************************************************************************/

public class ExpAcct
{	
	static Scanner scnr = new Scanner(System.in);                                // used to get user input
	static ArrayList<ExpressAccount> accounts = new ArrayList<ExpressAccount>(); // used to store all of the ExpressAccounts
	static int current;                                                          // used to store current ExpressAccount number
	static int accountNumber = 0;                                                // counter for number of ExpressAccounts in arraylist accounts
	static boolean run = true;                                                   // used to loop program until user quits
	static boolean user = false;                                                 // used to enter and loop user menu until user logs out
	static boolean logIn;   												     // used to loop until user logs in to an ExpressAccount
	
	/**********************************************************************************************************
	* Method to display main menu and allows user to navigate it
	* User can create a new ExpressAccount and enter the user menu using that new ExpressAccount by entering 1
	* User can retrieve an exsisting ExpressAccount by entering 2
	* User can exit the program by entering 3
	**********************************************************************************************************/
	
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
	
	/******************************************************************************************************************************************************************************
	* Method used to create a new StudentExpressAccount or FacultyExpressAccount in arraylist accounts and set the current account number equal to the ExpressAccount just created
	******************************************************************************************************************************************************************************/
	
	public static void newAccount()
	{
		System.out.print("\nCHOOSE THE TYPE FOR THE NEW ACCOUNT\n1.) Student express account\n2.) Faculty express account\nPlease enter your selection: ");
			
			switch (scnr.nextInt())
			{
				case 1: accounts.add(new StudentExpressAccount(accountNumber));
						System.out.println("Created new " + accounts.get(current).getAccountType() + " Express account #" + accountNumber + ", balance: $0.0, number of meals: 0");
						current = accountNumber;
						accountNumber++;
				break;
				
				case 2:	accounts.add(new FacultyExpressAccount(accountNumber));
						System.out.println("Created new " + accounts.get(current).getAccountType() + " Express account #" + accountNumber + ", balance: $0.0, number of meals: 0");
						current = accountNumber;
						accountNumber++;
				break;
				
				default:System.out.println("Enter 1 or 2 to traverse this menu.");
				break;
			}
	}

	/******************************************************************************************
	* Method used to retrive an ExpressAccount that the user selects
	* If the accountNumber exsists, the user is sent to the user menu with that ExpressAccount
	******************************************************************************************/
	
	public static void retrieveAccount()
	{
		logIn = true;
		while (logIn)
		{
			System.out.print("\nEnter account number: ");
			current = scnr.nextInt();
			if (current < 0 || current > accounts.size() - 1)
			{
				System.out.println("Invalid account number (must be between 0 and " + (accounts.size() - 1) + ")");
			}
			else
			{
				logIn = false;
				user = true;
				System.out.println("Welcome back " + accounts.get(current).getAccountType() + " Express account #" + accounts.get(current).getAccountNumber() + ", balance: $" + accounts.get(current).getAccountBalance() + ", number of meals: " + accounts.get(current).getNumOfMeals());
			}
		}
	}
	
	/************************************************************
	* Method to display user menu and allows user to navigate it
	* User can enter a deposit amount to store by entering 1
	* User can purchase meals by entering 2
	* User can eat a meal by entering 3
	* User can log out and go back to the main menu by entering 4
	*************************************************************/
	
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
	
	/***************************************
	* Runs the program until the user quits
	***************************************/
	
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