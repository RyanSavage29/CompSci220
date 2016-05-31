/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Project3
 ******************************/ 

import java.util.Scanner;
import java.io.*;

 /*********************************************************************************************************************************************
 * Class FindWords reads in a matrix of letters and a wordlist in order to compare the two to find words that appear in each row of the matrix
 * The values in the matrix are stored in a two dimensional array and are then later stored as individual rows in a string array
 * The method checkword is used to print out and words that match
 *********************************************************************************************************************************************/
 
public class FindWords
{
	
	/**************************************************************************************************************************************************************************
	* Method checkword will compare all of the lines from the matrix file with the file words and print out any string combination that matches using a triple nested for loop
	**************************************************************************************************************************************************************************/
	
    public static void checkword(String[] list, String word)
	{
		
		/**************************************************************************************************************************************************************
		* The first for loop represents the first index value in the substring, i, starting with 0 and increasing to 5
		* The second for loop represents the second index value in the substring, j, starting with i + 1 and increasing to 5. It will reset back everytime i increases
		* The third enhanced for loop iterates check through the wordlist in order to compare words in wordlist with each line from the matrix
		* The if block will print out the words in order as long as the string combination is equal to a word in the wordlist and it is larger than one letter 
		**************************************************************************************************************************************************************/
		
		for (int i = 0; i < word.length(); i++)
		{
			for (int j = i + 1; j < word.length(); j++)
			{
				for (String check : list)
				{
					if (check.equals(word.substring(i, j)) && (word.substring(i, j).length() > 1))
					{
						System.out.println(check);
					}
				}
			}
		}
       return;
    }
    
    
    public static void main(String[] args)
	{
        String[] wordlist = new String[99171];
        int index = 0;
		
		Scanner matrix = new Scanner(System.in);     // used to redirect input to matrix in the same folder
		int rows = matrix.nextInt();                 // number of rows in matrix
		int cols = matrix.nextInt();                 // number of columns in matrix
		String[] lines = new String[rows];           // array that holds the strings of all the rows from the matrix
		String letters = " ";                        // temporarily stores each value to be stored in matrixData[][]
		String nextLine = " ";                       // temporarily stores each line to be stored in lines[]
		char[][] matrixData = new char [rows][cols]; // two dimensional array used to hold all of the values from the matrix
		
        try
		{
            Scanner in = new Scanner(new FileReader("words"));
        
            while (in.hasNextLine())
			{
                wordlist[index]=in.nextLine();
                index++;
                
            }
	
        }
		catch(IOException e)
		{
            e.printStackTrace();
        }
        
		/*************************************************************************************************************************************************************
		* Nested for loop that reads in all the values of matrix and stores it into a two dimensional array
		* Each row is temporarily stored in the array line in the second for loop, to be converted to a string array that holds all of the rows in the first for loop
		*************************************************************************************************************************************************************/
		
		for (int i = 0; i < rows; i++)
		{
			char[] line = new char[cols]; // stores each rows's characters temporarily to be copied into a string array
			
			for (int j = 0; j < cols; j++)
			{
				letters = matrix.next();
				matrixData[i][j] = letters.charAt(0);
				line[j] = matrixData[i][j];
			}
			nextLine = nextLine.copyValueOf(line);
			lines[i] = nextLine;
		}
		
		/****************************************************************************
		* For loop that runs every line from the matrix through the method checkword
		****************************************************************************/
		
		for (int i = 0; i < lines.length; i++)
		{
			checkword(wordlist, lines[i]);
		}
    }
}