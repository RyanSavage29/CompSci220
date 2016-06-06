/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab9
 ******************************/ 

/*****************************************************************************************************************
* Class RollingDice2 is a driver class that instantiates and updates one PairOfDice object using Class PairOfDice
*****************************************************************************************************************/

public class RollingDice2 
{
	// Creates two Die objects and rolls them several times.
	public static void main(String[] args)
	{
		PairOfDice dice = new PairOfDice(); // creates dice, a PairOfDice object

		/***************************************************************
		* Rolls each die individually
		* Prints the new values on each die and the sum of the two dies
		***************************************************************/
		
		dice.rollDie1();
		dice.rollDie2();
		System.out.println(dice + "\n");
		
		/********************************************************************
		* Sets the values of each die individually
		* Gets the new values on each die and calculates sum of the two dies
		********************************************************************/
		
		dice.setFaceValue1(3);
		dice.setFaceValue2(1);
		System.out.println("Die One: " + dice.getFaceValue1() + ", Die Two: " + dice.getFaceValue2() + ", Sum: " + dice.calculateSum() + "\n");
		
		/***************************************************************
		* Rolls both dice together
		* Prints the new values on each die and the sum of the two dies
		***************************************************************/
		
		dice.rollDice();
		System.out.println(dice);
	}
}
