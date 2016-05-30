/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Project2
 ******************************/ 
 
 import java.util.Scanner;
 import java.util.Random;
 import java.io.FileInputStream;
 import java.io.IOException;
 
 /*****************************************************************************************************************************************************************************************************
 * Class WordUnscrambler reads words.txt and takes a random word from that file to scramble. The user is able to unscramble the word by swapping a pair of letters, see the unscrambled words, or quit
 * If the user unscrambles the word, the number of turns taken and a congratulations is printed
 *****************************************************************************************************************************************************************************************************/
 
 public class WordUnscrambler
 {
	 public static void main(String args[]) throws IOException
	 {
		 FileInputStream textFile = new FileInputStream("words.txt"); // connection to file words.txt
		 Scanner scnr = new Scanner(System.in);                       // user input
		 Scanner textScnr = new Scanner(textFile);                    // input from words.txt
		 Random rand = new Random();                                  // random object used for selecting a word and scrambling
		 boolean run = true;                                          // conditional used to loop the game
		 boolean win = true;                                          // conditional used to see if the user unscrambled the word
		 boolean check1, check2;                                      // conditionals used to loop switches
		 final int TOTAL_WORDS = 20;                                  // total number of words in words.txt
		 int indexStart, indexEnd, index1, index2, counter, i;        
		 String unscrambled, scrambled, firstLetter, secondLetter;    
		 String oldWord = "";                                         // stores the previous word used so that it is not repeated
		 String[] words = new String[TOTAL_WORDS];                    // array that holds all of the words in words.txt
		 
		 /****************************************************************************************************************************************
		 * For loop that takes the words from words.txt and enters them into an array. Words.txt is no longer needed and the connection is closed
		 ****************************************************************************************************************************************/
		 
		 for (i = 0; i < TOTAL_WORDS; i++)
		 {
			 words[i] = textScnr.next();
		 }
		 textFile.close();
		 
		  /************************************************************************
		  * While loop that allows the program to be run again based on user input
		  ************************************************************************/ 
		  
		 while (run)
		 {
			 
			 /**********************************************************************************************************************
			 * Selects a random unscrambled word. While loop ensures that the unscrambled word is not the same as the previous word
			 **********************************************************************************************************************/
			 
			 unscrambled = words[rand.nextInt(TOTAL_WORDS - 1)];
			 while (oldWord == unscrambled)
			 {
				 unscrambled = words[rand.nextInt(TOTAL_WORDS - 1)];
			 }
			 
			 oldWord = unscrambled;
			 scrambled = unscrambled;
			 
			 /***********************************************************************************************************************
			 * First while loop makes sure that the scrambled word is not unscrambled immediately
			 * For loop that scrambles the word based on the length of the word. For loop will take two random indexes and swap them
			 * Second while loop ensures that they are different indexes. If block swaps the indexes creating a scrambled word
			 ***********************************************************************************************************************/
			 
			 while (!scrambled.equals(unscrambled))
			 {				 
				for (i = 0; i < scrambled.length(); i++)
				{
					 indexStart = rand.nextInt(unscrambled.length() - 1);           // index number
					 indexEnd = rand.nextInt(unscrambled.length() - 1);             // index number
					 
					 while (indexStart == indexEnd)
					 {
					 	indexEnd = rand.nextInt(unscrambled.length() - 1);
					 }
					 
				 	 firstLetter = scrambled.substring(indexStart, indexStart + 1); // letter for index number
				  	 secondLetter = scrambled.substring(indexEnd, indexEnd + 1);    // letter for index number
				 
					 if (indexStart < indexEnd)
					 {
						 scrambled = scrambled.substring(0, indexStart) + secondLetter + scrambled.substring(indexStart + 1, indexEnd) + firstLetter + scrambled.substring(indexEnd + 1);
					 }
					 else
					 {
						 scrambled = scrambled.substring(0, indexEnd) + firstLetter + scrambled.substring(indexEnd + 1, indexStart) + secondLetter + scrambled.substring(indexStart + 1);
					 }
				 }
			 }
			 counter = 0;  // used to count the number of turns it takes the user to unscrambler the word
			 
			 /****************************************************************************
			 * While loop that runs the game and presents the user with a menu of options
			 ****************************************************************************/
			 
			 while (!scrambled.equals(unscrambled))
			 {
				 
				 /**************************************************************************************************************
				 * For loops that prints out the scrambled word and the index numbers for each letter. The menu is then printed
				 **************************************************************************************************************/
				 
				 for (i = 0; i < scrambled.length() + 2; i++)
				 {
					 System.out.print("-");
				 }
				 System.out.print("\n ");
				 for (i = 0; i < scrambled.length(); i++)
				 {
					 System.out.print(i);
				 }
				 System.out.println("\n " + scrambled);
				 for (i = 0; i < scrambled.length() + 2; i++)
				 {
					 System.out.print("-");
				 }
				 System.out.println("\nEnter 1 to swap the letters.\nEnter 2 to solve.\nEnter 3 to quit.");
				 check1 = true;
				 
				 /*********************************************************************************
				 * While loop used to keep the user in the switch until they enter a correct value
				 *********************************************************************************/
				 
				 while (check1)
				 {
					 switch (scnr.nextInt()) // menu for user 
					 {
						 
						 /***************************************************************************************************************************************
						 * Case 1 asks the user for 2 index values seperated by a whitespace, and repeats it in a while loop if the user enters incorrect values
						 * If block then switches the index values in the scrambled word
						 ***************************************************************************************************************************************/ 
						 
						 case 1: counter++;
								 System.out.println("Enter the indexes seperated by spaces");
								 index1 = scnr.nextInt();
								 index2 = scnr.nextInt();
					 
								 while ((index1 < 0) || (index2 < 0) || (index1 >= scrambled.length()) || (index2 >= scrambled.length()) || (index1 == index2))
								 {
									 System.out.println("Please enter correct index values, index values that don't match, and to seperate them by spaces");
									 index1 = scnr.nextInt();
									 index2 = scnr.nextInt();
								 }
					 
								 firstLetter = scrambled.substring(index1, index1 + 1);
								 secondLetter = scrambled.substring(index2, index2 + 1);
				 
								 if (index1 < index2)
								 {
									 scrambled = scrambled.substring(0, index1) + secondLetter + scrambled.substring(index1 + 1, index2) + firstLetter + scrambled.substring(index2 + 1);
								 }
								 else
								 {
									 scrambled = scrambled.substring(0, index2) + firstLetter + scrambled.substring(index2 + 1, index1) + secondLetter + scrambled.substring(index1 + 1);
								 }
								 check1 = false;
								 break;
					 
						 case 2: System.out.println("The correct answer was: " + unscrambled + ".\nQuiting"); // prints unscrambled word, exits loop
								 scrambled = unscrambled;
								 win = false;
								 check1 = false;
								 break;
							 
						 case 3: System.out.println("Quiting"); // exits loop
								 scrambled = unscrambled;
								 win = false;
								 check1 = false;
								 break;
							 
						 default:System.out.println("Please type 1 to swap letters, 2 to solve, or 3 to quit"); // error
								 break;
					 }
				 }
			 }
			 
			 /***************************************************************************************************
			 * If block used to determine if the user unscrambled the word or choose to solve/quit
			 * If the user unscrambled the word, they are congratulated and decide whether to play again or quit
			 * The game is ends if the user decided to solve or quit
			 ***************************************************************************************************/
			 
			 if (win)
			 {
				 System.out.println("Congratulations! You unscrambled the word " + unscrambled + " in " + counter + " steps. Press 1 to play again or press 2 to quit");
				 check2 = true; 
				 
				 /*********************************************************************************
				 * While loop used to keep the user in the switch until they enter a correct value
				 *********************************************************************************/
				 
				 while (check2)
				 {
					 switch (scnr.nextInt()) // menu for user
					 {
						 case 1: check2 = false; // run game again
								 break;
							
						 case 2: System.out.println("Quting"); // quit
								 check2 = false;
								 run = false;
								 break;
							
						 default:System.out.println("Please type 1 to play again or 2 to quit"); // error
								 break;
					 }
				 }
			 }
			 else
			 {
			 run = false; // quit
			 }
		 }
	 }
 }