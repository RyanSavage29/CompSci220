public class Rectangle
 {
	 private int width, height;
	 
	 public Rectangle(int width, int height)
	 {
		 this.width = width;
		 this.height = height;
	 }
	 
	 public int getWidth()
	 {
		 return width;
	 }
	 
	 public int getHeight()
	 {
		 return height;
	 }
	 
	 public void setWidth(int width)
	 {
		 this.width = width;
		 return;
	 }
	 
	 public void setHeight(int height)
	 {
		 this.height = height;
		 return;
	 }
	 
	 public String toString()
	 {
		 return "Width: " + width + " meters, Height: " + height + " meters";
	 }
	 
	 public int computeSurfaceArea()
	 {
		 return width * height;
	 }
 }