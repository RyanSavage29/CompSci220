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
		 final int TOTAL_WORDS;
		 int index1, index2;
		 String unscrambled, scrambled;
		 String[] words = new String[TOTAL_WORDS];
		 
		 for (int i = 0; i < TOTAL_WORDS; i++)
		 {
			 words[i] = textScan.next();
		 }
		 textFile.close();
		 
		 while (run)
		 {
			 //unscrambled = words[rand.nextInt(TOTAL_WORDS - 1)];
			 
		 }
	 }
 }