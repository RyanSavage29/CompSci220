/*******************************************************************************************************************************************************************
* Class PairOfDice creates PairOfDice objects that defines 2 face values to represent a pair of dice
* Includes methods to roll each die individually or together, set the values of each die, get the values of each die, calculate the sum of the dice, and a toString
*******************************************************************************************************************************************************************/

public class PairOfDice
{
	private final int MAX = 6; // maximum face value
	private int faceValue1; // current value showing on the first die
	private int faceValue2; // current value showing on the second die
	
	// Constructor: Sets the initial face values.
	public PairOfDice()
	{
		faceValue1 = 1;
		faceValue2 = 1;
	}
	
	// Rolls the first die and returns the result.
	public int rollDie1()
	{
		faceValue1 = (int)(Math.random() * MAX) + 1;
		return faceValue1;
	}

	// Rolls the second die and returns the result.
	public int rollDie2()
	{
		faceValue2 = (int)(Math.random() * MAX) + 1;
		return faceValue2;
	}
	
	// Rolls both dies.
	public void rollDice()
	{
		faceValue1 = (int)(Math.random() * MAX) + 1;
		faceValue2 = (int)(Math.random() * MAX) + 1;
	}
	
	// 1st Face value mutator.
	public void setFaceValue1(int value) 
	{
		faceValue1 = value;
	}
	
	// 2nd Face value mutator.
	public void setFaceValue2(int value)
	{
		faceValue2 = value;
	}
	
	// 1st Face value accessor.
	public int getFaceValue1() 
	{
		return faceValue1;
	}
	
	// 2nd Face value accessor.
	public int getFaceValue2()
	{
		return faceValue2;
	}
	
	// Calculates and returns the sum of the dice face values.
	public int calculateSum()
	{
		return faceValue1 + faceValue2;
	}
	
	// Returns a string representation of the dice.
	public String toString()
	{
		String result1 = Integer.toString(faceValue1);
		String result2 = Integer.toString(faceValue2);
		return "Die 1 is a " + result1 + ", Die 2 is a " + result2 + ", Sum is " + calculateSum();
	}
}