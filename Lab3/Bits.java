/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab3 Part2
 ******************************/ 

 /**********************************************************************************************************************************************
 * Class Bits takes a command-line argument value and divides it by 2 until the answer is less than 1. Value entered can't be a negative number
 **********************************************************************************************************************************************/
 
public class Bits
{
	public static void main (String [] args)
	{
		double n;
		int counter;
		boolean isSatisfied;
		
		n = Double.parseDouble(args[0]);
		counter = 0;
		
		while (n >= 1)
		{
			n /= 2;
			counter++;
		}
		
		if (n < 0)
		{
			System.out.println("Illegal input");
		}
		else
		{
			System.out.println(counter);
		}
	}
}