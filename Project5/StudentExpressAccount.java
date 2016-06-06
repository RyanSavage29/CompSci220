/*******************************************************************************************************************************
* Class StudentExpressAccount is a subclass to ExpressAccount that stores accountType, rewardAmt, and rewardLevel
* Includes getter for account type, method to deposit an amount, and a toString to print all the information about this account
*******************************************************************************************************************************/

public class StudentExpressAccount extends ExpressAccount
{
	private String accountType = "Student"; // used to store type of ExpressAccount
	private double accountBalance;          // temporarily used to add a deposit
	final double rewardAmt = 2.00;          // reward amounted for each level
	final double rewardLevel = 200.00;      // amount needed to get another rewardAmt
	
	// constructor
	public StudentExpressAccount(int accNumber)
	{
		super(accNumber);
		setBaseAmtForBonus(500.00);
		setPricePerMeal(10.00);
	}
	
	// adds deposit amount to account balance plus a bonus if base amount is met
	public void depositAmount(double deposit)
	{
		if (deposit > 0.00)
		{
			accountBalance = getAccountBalance();
			if (deposit >= getBaseAmtForBonus())
			{
				System.out.println("Received bonus of $" + decimal.format((int)(deposit / rewardLevel) * rewardAmt));
				accountBalance += (int)(deposit / rewardLevel) * rewardAmt;
			}
			accountBalance += deposit;
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
	
	// string representation of a StudentExpressAccount
	public String toString()
	{
		return "\nSTUDENT " + super.toString();
	}
}