/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Project 1 Part 2
 ******************************/ 

import java.util.Random;

/**********************************************************************************************************************************************************************************
* Class RandomWalkers is built upon Class RandomWalker
* Class RandomWalkers will take N steps inputed in the command-line argument and T experiments inputed in the command-line argument
* In each of T independent experiments, simulate a random walker based on N number of steps, compute the squared distance, and add the squared distance with the previous distance
* The walker will have a 25% chance to take a step either north, south, east, or west after each step
* After T number of experiments, the mean squared distance will be printed out
**********************************************************************************************************************************************************************************/

public class RandomWalkers
{
	public static void main (String [] args)
	{
		int x, y, N, T;
		double distance, mean;
		Random rand = new Random();          // new random object for direction
		
		x = 0;                               // x position of walker compared to origin
		y = 0;                               // y position of walker compared to origin
		N = Integer.parseInt(args[0]);       // command-line argument for number of steps walker will take
		T = Integer.parseInt(args[1]);       // command-line argument for number of experiments
		distance = 0;                        // total squared distance
		mean = 0;                            // mean squared distance

		/***********************************************************************************************************************************************
		* Nested for loop that runs random walker on the inner loop, adds the mean distance, and then reseting x & y for the next experiment
		* Switch determines the direction of the walker randomly. Direction is indicated by adding or subtracting 1 from the x or y value of the walker
		***********************************************************************************************************************************************/
		
		for (int i = 0; i <= T; i++)
		{
			for (int j = 0; j <= N; j++)
			{
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
			distance += (x*x) + (y*y);
			x = 0;
			y = 0;
		}
		mean = distance / T;
		System.out.println("mean squared distance = " + mean);
	}
}
