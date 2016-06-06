import java.text.DecimalFormat;

/****************************************************************************************************************************************************************************************
* Class ExpressAccount is a superclass to FacultyExpressAccount and StudentExpressAccount stores account number, account balance, number of meals, base amount for bonus, price per meal
* Includes getters for accountNumber, accountBalance, baseAmtForBonus, pricePerMeal, numOfMeals, and accountType
* Includes setters for accountBalance, baseAmtForBonus, and pricePerMeal
* Includes methods to deposit an amount, purchase meals, eat a meal, and a toString to print all of the information about the account
****************************************************************************************************************************************************************************************/

public class ExpressAccount
{
	DecimalFormat decimal = new DecimalFormat("0.00"); // format used for currency
	private int accountNumber;                         // account number
	private int numOfMeals;                            // number of meals owned by account
	private double accountBalance;                     // balance on account
	private double baseAmtForBonus;           		   // base amount needed for bonus
	private double pricePerMeal;               		   // price per meal
	
	// constructor
	public ExpressAccount(int accNumber)
	{
		this.accountNumber = accNumber;
		this.accountBalance = 0.00;
	}
	
	// getter for account number
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	// getter for account balance
	public double getAccountBalance()
	{
		return accountBalance;
	}
	
	// getter for base amount required for bonus
	public double getBaseAmtForBonus()
	{
		return baseAmtForBonus;
	}
	
	// getter for price per meal
	public double getPricePerMeal()
	{
		return pricePerMeal;
	}
	
	// getter for number of meals
	public int getNumOfMeals()
	{
		return numOfMeals;
	}
	
	// getter for account type
	public String getAccountType()
	{
		return "";
	}
	
	// setter for base amount required for bonus
	public void setBaseAmtForBonus(double baseAmtForBonus)
	{
		this.baseAmtForBonus = baseAmtForBonus;
	}
	
	// setter for pricer per meal
	public void setPricePerMeal(double pricePerMeal)
	{
		this.pricePerMeal = pricePerMeal;
	}
	
	// setter for account balance
	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}
	
	// adds deposit amount to account balance plus a bonus if base amount is met
	public void depositAmount(double deposit)
	{
	}
	
	/********************************************************************************************
	* Purchase meals by deducting accountBalance
	* $10.00 per one meal
	* Can purchase any amount that isn't negative
	* If the account can't afford number of meals entered, buy the most meals account can afford
	********************************************************************************************/
	
	public void purchaseMeals(int numPurchased)
	{
		if (numPurchased < 1)
		{
			System.out.println("Must purchase a positive number of meals.");
		}
		else if ((pricePerMeal * numPurchased) < accountBalance)
		{
			numOfMeals += numPurchased;
			accountBalance -= pricePerMeal * numPurchased;
			System.out.println("Purchased " + numPurchased + " with $" + decimal.format(pricePerMeal) + " per meal New balance $" + decimal.format(accountBalance));
		}
		else if (accountBalance > pricePerMeal)
		{
			System.out.println("Not enough balance for " + numPurchased + " meals");
			numOfMeals += (int)(accountBalance / pricePerMeal);
			System.out.print("Purchased " + (int)(accountBalance / pricePerMeal) + " meals, ");
			accountBalance -= pricePerMeal * (int)(accountBalance / pricePerMeal);
			System.out.println("New balance $" + decimal.format(accountBalance));
		}
		else
		{
			System.out.println("Not enough balance for " + numPurchased + " meals");
		}
	}
	
	// subtracts 1 from number of meals
	public void eatMeal()
	{
		if (numOfMeals > 0)
		{
			numOfMeals -= 1;
		}
		else
		{
			System.out.println("No meals left on your account. Please purchase meals first");
		}
	}
	
	// string representation of an ExpressAccount
	public String toString()
	{
		return "EXPRESS ACCOUNT #" + accountNumber + ", BALANCE: $" + decimal.format(accountBalance) + ", NUMBER OF MEALS: " + numOfMeals;
	}
}