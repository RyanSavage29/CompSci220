/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab5
 ******************************/ 

import java.util.Scanner;

/*********************************************************************************************************************************************
* Class Swap takes a user inputed word and swaps 2 letters in the word based on 2 index values inputed by the user
* There is a verification loop to make sure the user inputed index values are in range and a loop that asks the user to run the program again
*********************************************************************************************************************************************/

public class Swap
{
	public static void main (String [] args)
	{
		Scanner scnr = new Scanner(System.in);
		String userWord, firstLetter, secondLetter, newWord, quit;
		int indexStart, indexEnd;
		boolean run, restart, end, indexOne, indexTwo;
		
		indexStart = 0;
		indexEnd = 0;
		
		run = true;
		
		/********************************************************************************************************************
		* While loop that runs the program and only ends when the user decides to exit the program by hitting 'q' at the end
		********************************************************************************************************************/
		
		while (run)
		{
			end = true; 
			
			System.out.print("Please enter a word: ");
			userWord = scnr.next();
		
			indexOne = true;
			indexTwo = true;
			
			/*******************************************************************************************
			* While loop that takes the first user inputed index value and verifies that it is in range
			*******************************************************************************************/
			
			while (indexOne)
			{
				System.out.print("Please enter the first index number: ");
				indexStart = Integer.parseInt(scnr.next());
					
				if (indexStart < 0 || indexStart >= userWord.length())
				{
					System.out.println("Please enter a number in the correct range");
				}
				else
				{
					indexOne = false;
				}
			
			}
		
			/********************************************************************************************
			* While loop that takes the second user inputed index value and verifies that it is in range
			********************************************************************************************/
			
			while (indexTwo)
			{
				System.out.print("Please enter the second index number: ");
				indexEnd = Integer.parseInt(scnr.next());
				
				if (indexEnd < 0 || indexEnd >= userWord.length())
				{
					System.out.println("Please enter a number in the correct range");
				}
				else
				{
					indexTwo = false;
				}
			}
		
			firstLetter = userWord.substring(indexStart, indexStart + 1);
			secondLetter = userWord.substring(indexEnd, indexEnd + 1);
			
			/**************************************************************************************************************************
			* If block to create the new word by determining if the first index value is smaller or larger than the second index value
			**************************************************************************************************************************/
			
			if (indexStart < indexEnd)
			{
				newWord = userWord.substring(0, indexStart) + secondLetter + userWord.substring(indexStart + 1, indexEnd) + firstLetter + userWord.substring(indexEnd + 1);
			}
			else
			{
				newWord = userWord.substring(0, indexEnd) + firstLetter + userWord.substring(indexEnd + 1, indexStart) + secondLetter + userWord.substring(indexStart + 1);
			}
			
			System.out.println(newWord);
		
			/******************************************************************************************************************
			* While loop that determines if the program should end or continue if the user hits 'q' to quit or 'c' to continue
			******************************************************************************************************************/
		
			while (end)
			{
				System.out.print("Would you like to run this program again? Please enter q to quit or c to continue: ");
				quit = scnr.next();
				
				if (quit.equals("q"))
				{
					System.out.println("Goodbye!");
					run = false;
					break;
				}
				else if (quit.equals("c"))
				{
					end = false;
				}
				else
				{
					System.out.print("Please enter q to quit or c to continue");
				}
			}
		}
	}
}