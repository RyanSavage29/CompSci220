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
		 FileInputStream textFile = new FileInputStream("words.txt");
		 Scanner scnr = new Scanner(System.in);
		 Scanner textScnr = new Scanner(textFile);
		 Random rand = new Random();
		 boolean run = true;
		 boolean end = false;
		 final int TOTAL_WORDS = 20;
		 int indexStart, indexEnd, index1, index2;
		 String unscrambled, scrambled, firstLetter, secondLetter;
		 String[] words = new String[TOTAL_WORDS];
		 
		 for (int i = 0; i < TOTAL_WORDS; i++)
		 {
			 words[i] = textScnr.next();
		 }
		 textFile.close();
		 
		 while (run)
		 {
			 unscrambled = words[rand.nextInt(TOTAL_WORDS - 1)];
			 scrambled = unscrambled;
			 for (int i = 0; i < scrambled.length(); i++)
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
			 System.out.println(unscrambled + "\n" + scrambled);
			 run = false;
		 }
	 }
 }