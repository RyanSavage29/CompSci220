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
 
 /*
 * Class WordUnscrambler reads words.txt and takes a random word from that file to scramble. The user is able to unscramble the word by swapping a pair of letters, see the unscrambled words, or quit.
 * If the user unscrambles the word, the number of turn taken and a congratulations is printed.
 * 
 */
 
 public class WordUnscrambler
 {
	 public static void main(String args[]) throws IOException
	 {
		 FileInputStream textFile = new FileInputStream("words.txt"); // 
		 Scanner scnr = new Scanner(System.in);                       //
		 Scanner textScnr = new Scanner(textFile);                    //
		 Random rand = new Random();                                  //
		 boolean run = true;                                          //
		 boolean win = true;                                          //
		 boolean check1, check2;                                      // used to loop switches
		 final int TOTAL_WORDS = 20;                                  //
		 int indexStart, indexEnd, index1, index2, counter, i;        //
		 String unscrambled, scrambled, firstLetter, secondLetter;    //
		 String oldWord = "";                                         //
		 String[] words = new String[TOTAL_WORDS];                    //
		 
		 /*
		 * 
		 */
		 
		 for (i = 0; i < TOTAL_WORDS; i++)
		 {
			 words[i] = textScnr.next();
		 }
		 textFile.close();
		 
		  /*
		  * 
		  */ 
		  
		 while (run)
		 {
			 unscrambled = words[rand.nextInt(TOTAL_WORDS - 1)];
			 while (oldWord == unscrambled)
			 {
				 unscrambled = words[rand.nextInt(TOTAL_WORDS - 1)];
			 }
			 
			 scrambled = oldWord = unscrambled;
			 
			 while (scrambled.equals(unscrambled))
			 {
			   	 for (i = 0; i < scrambled.length(); i++)
				 {
					 indexStart = rand.nextInt(unscrambled.length() - 1);
					 indexEnd = rand.nextInt(unscrambled.length() - 1);
					 
					 while (indexStart == indexEnd)
					 {
						 indexEnd = rand.nextInt(unscrambled.length() - 1);
					 }
					 
					 firstLetter = scrambled.substring(indexStart, indexStart + 1);
					 secondLetter = scrambled.substring(indexEnd, indexEnd + 1);
				 
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
			 counter = 0;
			 
			 while (!scrambled.equals(unscrambled))
			 {
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
				 
				 while (check1)
				 {
					 switch (scnr.nextInt())
					 {
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
					 
								 while (index1 == index2)
								 {
									 index2 = rand.nextInt(unscrambled.length() - 1);
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
					 
						 case 2: System.out.println("The correct answer was: " + unscrambled + ".\nQuiting");
								 scrambled = unscrambled;
								 win = false;
								 check1 = false;
								 break;
							 
						 case 3: System.out.println("Quiting");
								 scrambled = unscrambled;
								 win = false;
								 check1 = false;
								 break;
							 
						 default:System.out.println("Please type 1 to swap letters, 2 to solve, or 3 to quit.");
								 break;
					 }
				 }
			 }
			 if (win)
			 {
				 System.out.println("Congratulations! You unscrambled the word " + unscrambled + " in " + counter + " steps. Press 1 to play again or press 2 to quit.");
				 check2 = true; 
				 
				 while (check2)
				 {
					 switch (scnr.nextInt())
					 {
						 case 1: check2 = false;
								 break;
							
						 case 2: System.out.println("Quting");
								 check2 = false;
								 run = false;
								 break;
							
						 default:System.out.println("Please type 1 to play again or 2 to quit.");
								 break;
					 }
				 }
			 }
			 else
			 {
			 run = false;
			 }
		 }
	 }
 }