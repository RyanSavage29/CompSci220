/********************************************************************************************************************************
* Class Rectangle is a superclass to RectPrism that stores a width and a height
* Includes methods to get width, get height, set width, set height, compute surface area, and toString to print width and height
********************************************************************************************************************************/

public class Rectangle
 {
	 private int width, height;
	 
	 // constructor
	 public Rectangle(int width, int height)
	 {
		 this.width = width;
		 this.height = height;
	 }
	 
	 // getter for width
	 public int getWidth()
	 {
		 return width;
	 }
	 
	 // getter for height
	 public int getHeight()
	 {
		 return height;
	 }
	 
	 // setter for width
	 public void setWidth(int width)
	 {
		 this.width = width;
		 return;
	 }
	 
	 // setter for height
	 public void setHeight(int height)
	 {
		 this.height = height;
		 return;
	 }
	 
	 // // string representation of width and height
	 public String toString()
	 {
		 return "Width: " + width + " meters, Height: " + height + " meters";
	 }
	 
	 // return surface area
	 public int computeSurfaceArea()
	 {
		 return width * height;
	 }
 }