/*******************************************************************************************************************************
* Class FacultyExpressAccount is a subclass to ExpressAccount that stores accountType and rewardPct
* Includes getter for account type, method to deposit an amount, and a toString to print all the information about this account
*******************************************************************************************************************************/

public class FacultyExpressAccount extends ExpressAccount
{
	private String accountType = "Faculty"; // used to store type of ExpressAccount
	private double accountBalance;          // temporarily used to add a deposit
	final double rewardPct = 0.01;			// percentage for reward
	
	// constructor
	public FacultyExpressAccount(int accNumber)
	{
		super(accNumber);
		setBaseAmtForBonus(0.00);
		setPricePerMeal(8.00);
	}
	
	// adds deposit amount to account balance plus a bonus
	public void depositAmount(double deposit)
	{
		if (deposit > 0.00)
		{
			accountBalance = getAccountBalance();
			System.out.println("Received bonus of $" + decimal.format(deposit * rewardPct));
			accountBalance += (deposit + (deposit * rewardPct));
			System.out.println("Deposit $" + decimal.format(deposit) + " New Balance $" + decimal.format(accountBalance));
			setAccountBalance(accountBalance);
		}
		else
		{
			System.out.println("The deposit must be a positive amount.");
		}
	}
	
	// getter for account type
	public String getAccountType()
	{
		return accountType;
	}
	
	// string representation of a FacultyExpressAccount
	public String toString()
	{
		return "\nFACULTY " + super.toString();
	}
}