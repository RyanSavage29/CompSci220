/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab12
 ******************************/
 
 import java.util.Scanner;
 
 /*****************************************************
 * Class Sum uses recursion to get the sum of 1 to num
 *****************************************************/
 
public class Sum
{
	public static void main(String[] args) throws Exception
	 {
		Scanner scnr = new Scanner(System.in);
		Sum s = new Sum();
		int input;
		System.out.print("\nPlease enter N: ");
		
		/**********************************************************************
		* Exception handling if input < 2 or input is not a matching data type
		**********************************************************************/
		
		try
		{
			input = scnr.nextInt();
		
			if (input < 2)
			{
				throw new Exception("Invalid N value. Must be greater than 2.");
			}
		
			System.out.println("\nSum of 1 to " + input + ": " + s.sum(input));
		}
		catch (Exception excpt)
		{
			System.out.println(excpt.getMessage());
			System.out.println("Cannot compute sum from 1 to N");
		}
	 }

	// This method returns the sum of 1 to num
	public int sum(int num)
	{
		int half, full, result;
		half = sumHalf(num/2);
		full = sumFull(num/2 + 1, num);
		result = half + full;
		return result;
	}

	// returns sum of 1 to num/2 using recursion
	public int sumHalf(int num)
	{
		int result;
		if (num == 1)
		{
			result = 1;
			System.out.println("\nResults for 1 to num/2\nResult " + num + ": " + result);
		}
		else 
		{
			result = num + sumHalf(num - 1);
			System.out.println("Result " + num + ": " + result);
		}
		return result;
	}

	// sum of (num/2 + 1) to num using recursion
	public int sumFull(int num, int total)
	{
		int result;
		if (num == total)
		{
			result = total;
			System.out.println("\nResults for (num/2 + 1) to num\nResult " + num + ": " + result);
		}
		else
		{
			result = num + sumFull(num + 1, total);
			System.out.println("Result " + num + ": " + result);
		}
		return result;
	}
}