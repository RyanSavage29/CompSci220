/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab2 Part2
 ******************************/ 

import java.util.Scanner;

/*****************************************************************************************************
* Class Calculate will take seconds inputed by the user and output the hours, minutes, and/or seconds
*****************************************************************************************************/

public class Calculate
{
	public static void main (String [] args)
	{
		int time = 0;
		int hours = 0;
		int minutes = 0;
		int seconds = 0;

		System.out.print("Please enter a number of seconds: ");
		Scanner scnr = new Scanner(System.in);
		time = scnr.nextInt();                 

		hours = time / 3600;
		minutes = (time - (hours * 3600) ) / 60;
		seconds = (time - ((hours * 3600) + (minutes * 60)));


		System.out.println(time + " seconds is equivalent to " + hours + " hours, " + minutes + " mintues, and " + seconds + " seconds");

		return;
	}
}