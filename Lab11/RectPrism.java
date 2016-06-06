/************************************************************************************************************************************************
* Class RectPrism is a subclass to Rectangle that stores depth
* Includes methods to get width, get height, set width, set height, compute surface area, compute volume, and toString to print width and height
************************************************************************************************************************************************/

public class RectPrism extends Rectangle
 {
	 private int depth;
	 
	 // constructor
	 public RectPrism(int width, int height, int depth)
	 {
		 super(width, height);
		 this.depth = depth;
	 }
	 
	 // getter for depth
	 public int getDepth()
	 {
		 return depth;
	 }
	 
	 // setter for depth
	 public void setDepth(int depth)
	 {
		 this.depth = depth;
		 return;
	 }
	
	// string representation of grade and courseName
	 public String toString()
	 {
		 
		 return super.toString() + ", Depth: " + depth + " meters";
	 }
	 
	 // return surface area
	 public int computeSurfaceArea()
	 {
		 return 2 * ((getWidth() * getHeight()) + (getHeight() * depth) + (getWidth() * depth));
	 }
	 
	 // return volume
	 public int computeVolume()
	 {
		 return (getWidth() * getHeight() * depth);
	 }
 }