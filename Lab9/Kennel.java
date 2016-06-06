/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab9
 ******************************/ 
 
 /**************************************************************************************************
 * Class Kennel is a driver class that instantiates and updates several Dog objects using Class Dog
 **************************************************************************************************/
 
 public class Kennel
 {
	 public static void main(String[] args)
	 {
		 
		 /***************************
		 * Created 3 new Dog objects
		 ***************************/
		 
		 Dog bull = new Dog("Sam", 5); 
		 Dog beagle = new Dog("Spike", 1);
		 Dog terrier = new Dog("Toto", 4);
		 
		 /*********************************************************************************
		 * Used the toString method to print a one line description of the bull Dog object
		 * Set the age of the bull Dog object
		 * Printed out the name, age, and person years of the bull Dog object
		 *********************************************************************************/
		 
		 System.out.println("\n" + bull);
		 bull.setAge(bull.getAge() + 1);
		 System.out.println(bull.getName() + " is now " + bull.getAge() + ", which is " + bull.personYears() + " in person years.");
		 
		 /***********************************************************************************
		 * Used the toString method to print a one line description of the beagle Dog object
		 * Set the name of the beagle Dog object
		 * Printed out the name of the beagle Dog object
		 ***********************************************************************************/
		 
		 System.out.println("\n" + beagle);
		 System.out.print(beagle.getName() + " is now named ");
		 beagle.setName("Ralph");
		 System.out.println(beagle.getName() + ".");
		 
		 /************************************************************************************
		 * Used the toString method to print a one line description of the terrier Dog object
		 * Set the name and age of the terrier Dog object
		 * Printed out the name, age, and person years of the terrier Dog object
		 ************************************************************************************/
		 
		 System.out.println("\n" + terrier);
		 System.out.print(terrier.getName() + " is now named ");
		 terrier.setAge(5);
		 terrier.setName("Buttercup");
		 System.out.println(terrier.getName() + " and is now " + terrier.getAge() + ", which is " + terrier.personYears() + " in person years.");
	 }
 }