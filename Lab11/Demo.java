/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab11
 ******************************/ 
 
 /***********************************************************************************************************************
 * 
 ***********************************************************************************************************************/
 
 public class Demo
 {
	 public static void main(String[] args)
	 {
		 Rectangle r1 = new Rectangle(20, 25);
		 Rectangle r2 = new RectPrism(24, 56, 85);
		 RectPrism r3 = new RectPrism(2, 4, 8);
		 
		 System.out.println("Width of rectangle: " + r1.getWidth() + " meters, Height of rectangle: " + r1.getHeight() + " meters");
		 System.out.println("Surface Area: " + r1.computeSurfaceArea() + " meters squared");
		 r1.setWidth(5);
		 r1.setHeight(10);
		 System.out.println(r1 + "\n");
		 
		 System.out.println("1st rectangular prism");
		 System.out.println(r2);
		 System.out.println("Surface Area: " + r2.computeSurfaceArea() + " meters squared\n");
		 
		 System.out.println("Width of 2nd rectanglar prism: " + r3.getWidth() + " meters, Height of 2nd rectanglar prism: " + r3.getHeight() + " meters, Depth of 2nd rectanglar prism: " + r3.getDepth() + " meters");
		 System.out.println("Surface Area: " + r3.computeSurfaceArea() + " meters squared");
		 r3.setWidth(25);
		 r3.setHeight(30);
		 r3.setDepth(35);
		 System.out.println(r3);
		 System.out.println("Volume: " + r3.computeVolume() + " cubic meters");
	 }
 }