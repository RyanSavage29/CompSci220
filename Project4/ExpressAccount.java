import java.text.DecimalFormat;

/******************************************************************************************************************************************************
* Class ExpressAccount stores account number, account balance, number of meals, base amount for bonus, price per meal, reward amount, and reward level
* Includes getters for accountNumber, accountBalance, baseAmtForBonus, pricePerMeal, and numOfMeals
* Includes methods to deposit an amount, purchase meals, eat a meal, and a toString to print all of the information about the account
******************************************************************************************************************************************************/

public class ExpressAccount
{
	DecimalFormat decimal = new DecimalFormat("0.00"); // format used for currency
	private int accountNumber;                         // account number
	private int numOfMeals;                            // number of meals owned by account
	private double accountBalance;                     // balance on account
	final double baseAmtForBonus = 500.00;             // base amount needed for bonus
	final double pricePerMeal = 10.00;                 // price per meal
	final double rewardAmt = 2.00;                     // reward amounted for each level
	final double rewardLevel = 200.00;                 // amount needed to get another rewardAmt
	
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
	
	// adds deposit amount to account balance plus a bonus if base amount is met
	public void depositAmount(double deposit)
	{
		if (deposit > 0.00)
		{
			if (deposit >= baseAmtForBonus)
			{
				accountBalance += (int)(deposit / rewardLevel) * rewardAmt;
			}
			accountBalance += deposit;
			System.out.println("Deposit $" + decimal.format(deposit) + " New Balance $" + decimal.format(accountBalance));
		}
		else
		{
			System.out.println("The deposit must be a positive amount.");
		}
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
	
	// string representation of a user account
	public String toString()
	{
		return "\nEXPRESS ACCOUNT #" + accountNumber + ", BALANCE: $" + decimal.format(accountBalance) + ", NUMBER OF MEALS: " + numOfMeals;
	}
}