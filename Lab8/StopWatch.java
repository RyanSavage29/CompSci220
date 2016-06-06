/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab8
 ******************************/ 
 
import java.util.Scanner;
 
 /*****************************************************************************************************************************************************
 * Class Stopwatch will start a timer from when the program begins until when the user enters 'abc' and then print out the elapsed time in miliseconds
 *****************************************************************************************************************************************************/
 
public class StopWatch 
{
	
	private long startTime = 0;
	private long stopTime = 0;
	private boolean running = false;
	private long elapsed = 0;
	
	public void start() 
	{
		this.startTime = System.currentTimeMillis();
		this.running = true;
	}
	
	public void stop() 
	{
		this.stopTime = System.currentTimeMillis();
		this.running = false;
	}
	
	//elaspsed time in milliseconds
	public long getElapsedTime() 
	{
		if (running) 
		{
			elapsed = (System.currentTimeMillis() - startTime);
		}
		else 
		{
			elapsed = (stopTime - startTime);
		}
		return elapsed;
	}
	
	//elaspsed time in seconds
	public long getElapsedTimeSecs() 
	{
		if (running) 
		{
			elapsed = ((System.currentTimeMillis() - startTime) / 1000);
		}
		else 
		{
			elapsed = ((stopTime - startTime) / 1000);
		}
		return elapsed;
	}
	
	//created toString method with getElapsedTime method in it so that the elapsed time is returned in milliseconds
	public String toString()
	{
		getElapsedTime();
		return Long.toString(elapsed);
	}
	
	//sample usage
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		StopWatch s = new StopWatch();
		s.start();
		double z = 0.0;
		//use scanner to get an string from keyboard
		//while loop used to stop the stopwatch when the user enters abc
		while (s.running == true)
		{
			String user = scnr.next();
			if (user.equals("abc"))
			{
				s.stop();
			}
		}
		//prints out elapsed time using toString method
		System.out.println("elapsed time in milliseconds: " + s);
	}
}