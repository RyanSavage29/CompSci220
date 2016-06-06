/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab11
 ******************************/ 
 
 /****************************************************************************************
 * Class Demo is a driver class that instantiates and updates Rectangle RectPrism objects
 ****************************************************************************************/
 
 public class Demo
 {
	 public static void main(String[] args)
	 {
		 
		 /*********************************************
		 * Created 1 Rectangle and 2 RectPrism objects
		 *********************************************/
		 
		 Rectangle r1 = new Rectangle(20, 25);
		 Rectangle r2 = new RectPrism(24, 56, 85);
		 RectPrism r3 = new RectPrism(2, 4, 8);
		 
		 /******************************************************
		 * Printed out width and height using getters
		 * Computed and printed surface area
		 * Set width and height and printed r1 Rectangle object
		 ******************************************************/
		 
		 System.out.println("Width of rectangle: " + r1.getWidth() + " meters, Height of rectangle: " + r1.getHeight() + " meters");
		 System.out.println("Surface Area: " + r1.computeSurfaceArea() + " meters squared");
		 r1.setWidth(5);
		 r1.setHeight(10);
		 System.out.println(r1 + "\n");
		 
		 /***********************************
		 * Printed r2 RectPrism object
		 * Computed and printed surface area
		 ***********************************/
		 
		 System.out.println("1st rectangular prism");
		 System.out.println(r2);
		 System.out.println("Surface Area: " + r2.computeSurfaceArea() + " meters squared\n");
		 
		 /**************************************************************
		 * Printed width, height, and depth using getters
		 * Computed and printed surface area
		 * Set width, height, and depth and printed r3 RectPrism object
		 * Computed and printed volume
		 **************************************************************/
		 
		 System.out.println("Width of 2nd rectanglar prism: " + r3.getWidth() + " meters, Height of 2nd rectanglar prism: " + r3.getHeight() + " meters, Depth of 2nd rectanglar prism: " + r3.getDepth() + " meters");
		 System.out.println("Surface Area: " + r3.computeSurfaceArea() + " meters squared");
		 r3.setWidth(25);
		 r3.setHeight(30);
		 r3.setDepth(35);
		 System.out.println(r3);
		 System.out.println("Volume: " + r3.computeVolume() + " cubic meters");
	 }
 }