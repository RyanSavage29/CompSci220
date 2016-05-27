/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab4 Part2
 ******************************/ 

 /***********************************************************************************************************************************************************************
 * Class Area will take 3 sides of a triangle inputed in the command-line argument, solve for half the perimeter of the triangle, and solve for the area of the triangle
 ***********************************************************************************************************************************************************************/
 
public class Area
{
	public static void main (String [] args)
	{
		double area, a, b, c, s;
		
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		
		s = ((a + b + c) / 2); // solves for half the perimeter of a triangle to use in Heron's Formaula
		
		area = Math.sqrt((s * ((s - a) * (s - b) * (s - c)))); // Heron's Formula solves for area of the triangle
		
		System.out.println(Math.floor(area*1000)/1000); // prints area to 3 decimal places
	}
}