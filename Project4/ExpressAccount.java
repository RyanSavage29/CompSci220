import java.text.DecimalFormat;

public class ExpressAccount
{
	DecimalFormat decimal = new DecimalFormat("0.00");
	private int accountNumber;
	private int numOfMeals;
	private double accountBalance;
	final double baseAmtForBonus = 500.00;
	final double pricePerMeal = 10.00;
	final double rewardAmt = 2.00;
	final double rewardLevel = 200.00;
	
	public ExpressAccount(int accNumber)
	{
		this.accountNumber = accNumber;
		this.accountBalance = 0.00;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getAccountBalance()
	{
		return accountBalance;
	}
	
	public double getBaseAmtForBonus()
	{
		return baseAmtForBonus;
	}
	
	public double getPricePerMeal()
	{
		return pricePerMeal;
	}
	
	public int getNumOfMeals()
	{
		return numOfMeals;
	}
	
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
	
	public String toString()
	{
		return "\nEXPRESS ACCOUNT #" + accountNumber + ", BALANCE: $" + decimal.format(accountBalance) + ", NUMBER OF MEALS: " + numOfMeals;
	}
}