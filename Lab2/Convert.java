/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab2 Part1
 ******************************/

 /*****************************************************************************************************
 * Class Convert will take the miles inputed in the command-line argument and convert it to kilometers
 *****************************************************************************************************/
 
public class Convert
{
	public static void main (String [] args)
	{
		final float CONVERT_MILES = 1.60935f;
		float miles = 0.0f; 				  
		float kilometers = 0.0f; 			  

		miles = Float.parseFloat(args[0]);
		kilometers = miles * CONVERT_MILES; 

		System.out.println("You entered " + miles + " miles, which equals " + kilometers + " kilometers");

		return;
	}
}