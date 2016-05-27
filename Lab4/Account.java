/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab4 Part1
 ******************************/ 

import java.util.Scanner;
import java.util.Random;

/**********************************************************************************************************************************************************************
* Class Account will take user inputed first and last name to create an account name
* The account name is comprised of the first letter of the first name, followed by the first 5 letters of the last name, and followed by a random number between 10-99
* If the last name is less than 5, then the whole last name will be used
**********************************************************************************************************************************************************************/

public class Account
{
	public static void main (String [] args)
	{
		Random rand = new Random();
		int num;
		Scanner scnr = new Scanner(System.in);
		String firstName = "";
		String secondName = "";
		String limit = "";
		
		System.out.print("Please enter your first name: ");
		firstName = scnr.next();
		
		System.out.print("Please enter your last name: ");
		secondName = scnr.next();
		
		if (secondName.length() < 5)
		{
			limit = secondName.substring(0, secondName.length());
		}
		else 
		{
			limit = secondName.substring(0, 5);
		}
		num = rand.nextInt(89)+11;
		
		System.out.println(firstName.substring(0, 1) + limit + num);
	}
}