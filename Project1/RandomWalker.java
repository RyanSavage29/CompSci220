/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Project 1 Part 1
 ******************************/ 

import java.util.Random;
 
/********************************************************************************************************************************************************************************
* Class RandomWalker will take N steps inputed in the command-line argument and simulate the motion of a random walking for N steps
* The walker will have a 25% chance to take a step either north, south, east, or west after each step
* It will print out the location of the walker after every step, treating the starting location as the origin and at the end will print out the squared distance from the origin
*********************************************************************************************************************************************************************************/

public class RandomWalker
{
	public static void main (String [] args)
	{
		int x, y, N;
		Random rand = new Random();    // new random object for direction
		
		x = 0; 						   // x position of walker compared to origin
		y = 0; 						   // y position of walker compared to origin
		N = Integer.parseInt(args[0]); // command-line argument for number of steps walker will take
		
		/****************************************************************************************************************
		* For loop to print location before taking a step and a switch to determine the direction of every step randomly
		* Direction is indicated by adding or subtracting 1 from the x or y value of the walker
		****************************************************************************************************************/
		
		for (int i = 0; i <= N; i++)
		{
			System.out.println("(" + x + ", " + y + ")");
			
			switch (rand.nextInt(4) + 1) // creates random value from 1-4 for switch to decide direction
			{
				case 1: x += 1; // east
						break;
				case 2: x -= 1; // west
						break;
				case 3: y += 1; // north
						break;
				case 4: y -= 1; // south
						break;
			}
		}
		System.out.println("(" + x + ", " + y + ")");
		System.out.println("squared distance = (" + (x*x) + ", " + (y*y) + ")");
	}
}
