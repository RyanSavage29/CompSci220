/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab6
 ******************************/ 

import java.util.Scanner;

/*********************************************************************************************************************************
* Class Mean will create two different arrays of integers based on user inputed values and then print out the mean for each array
* If block to create the two arrays based on whether n is even or odd
* While loop used to fill the two arrays with integers inputted by the user
* For loops used to print out the two arrays and compute the mean of each list
*********************************************************************************************************************************/

public class Mean
{
  public static void main(String [] args)
  {
	Scanner scnr;
	int n, counter, evenCounter, oddCounter, sum1, sum2;
	int[] L1, L2;
	
    scnr = new Scanner(System.in);
    n = 0;
    counter = 0;
    evenCounter = 0;
    oddCounter = 0;
    sum1 = 0;
    sum2 = 0;
	 
    System.out.print("Please enter the number of integers you want to enter: ");
    n = scnr.nextInt();
	
	/**************************************************************************************************************
	* If block that creates array L1 and L2, where the size is determined by n and whether or not n is even or odd
	**************************************************************************************************************/
	
    if (n % 2 == 0)
    {
      L1 = new int[n / 2 + 1];
      L2 = new int[n / 2];
    }
    else
    {
      L1 = new int[n / 2 + 1];
      L2 = new int[n / 2 + 1];
    }
	
	/***************************************************************************************************************************
	* While loop that takes user inputed values and seperates them into array L1 or array L2 based on if counter is even or odd
	***************************************************************************************************************************/
	
    while (counter <= n)
    {
      System.out.print("Please enter a number: ");
      if (counter % 2 == 0 || counter == 0)
      {
        L1[evenCounter] = scnr.nextInt();
        evenCounter++;
        counter++;
      }
      else
      {
        L2[oddCounter] = scnr.nextInt();
        oddCounter++;
        counter++;
      }
    }
	
	/******************************************************************************
	* For loop that prints out all of the integers in List 1 and adds them to sum1
	* Mean of List 1 is then printed out as a float
	******************************************************************************/
	
    System.out.println("List 1: ");
    for (int i = 0; i < L1.length; i++)
    {
      System.out.print("" + L1[i] + " ");
      sum1 += L1[i];
    }
    System.out.println("\nMean of List 1: " + (float) sum1 / L1.length);
	
	/******************************************************************************
	* For loop that prints out all of the integers in List 2 and adds them to sum2
	* Mean of List 2 is then printed out as a float
	******************************************************************************/
	
    System.out.println("List 2: ");
    for (int i = 0; i < L2.length; i++)
    {
      System.out.print("" + L2[i] + " ");
      sum2 += L2[i];
    }
    System.out.println("\nMean of List 2: " + (float) sum2 / L2.length);
  }
}
