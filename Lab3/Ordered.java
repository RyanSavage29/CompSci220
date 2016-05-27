/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab3 Part1
 ******************************/ 

 /********************************************************************************************************************
 * Class Ordered takes values inputed in command-line arguments and checks to see if the values are ordered correctly
 ********************************************************************************************************************/
 
public class Ordered
{
	public static void main (String [] args)
	{
		int x, y, z;
		boolean isSatisfied;
		
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		z = Integer.parseInt(args[2]);
		
		/*******************************************************************
		*If the values are in either of the correct orders, boolean is true
		*******************************************************************/
		
		if ((x >= y && y >= z) || (x <= y && y <= z))
		{
			isSatisfied = true;
		}
		else
		{
			isSatisfied = false;
		}
		System.out.println(isSatisfied);
	}
}