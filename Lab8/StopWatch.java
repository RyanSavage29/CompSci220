/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab8
 ******************************/ 
 
import java.util.Scanner;
 
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
		if (scnr.next().equals("abc"))
		{
		s.stop();
		}
		System.out.println("elapsed time in milliseconds: " + s);
	}
}