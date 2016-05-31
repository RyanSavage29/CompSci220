/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Project3
 ******************************/ 

import java.util.Scanner;
import java.io.*;


public class FindWords
{
    
    // search word in the array list
    // return true if found, otherwise false
    // please finish this method
    public static boolean checkword(String[] list, String word)
	{
        return false;
    }
    
    
    public static void main(String[] args)
	{
        // read words from file "words"
        // the words are saved to array wordlist
        // Please do not change this part
        String[] wordlist= new String[99171];
        int index = 0;
        try
		{
            Scanner in = new Scanner(new FileReader("words"));
        
            while(in.hasNextLine()){
                wordlist[index]=in.nextLine();
                index++;
                
            }
	
        }
		catch(IOException e)
		{
            e.printStackTrace();
        }
        
		Scanner matrix = new Scanner();
		int rows = matrix.nextInt();
		int cols = matrix.nextInt();
		String[] lines = new String[rows];
		
		
        // fill the following part
        // read the matrix
        // save the letters of the matrix to a 2D array
        
        
        
        
        // fill the following part
        // checks the sequences of letters
        // to see whether they are words or not
        
    
    }
    
}