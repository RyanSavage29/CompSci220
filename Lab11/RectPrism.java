public class RectPrism extends Rectangle
 {
	 private int depth;
	 
	 public RectPrism(int width, int height, int depth)
	 {
		 super(width, height);
		 this.depth = depth;
	 }
	 
	 public int getDepth()
	 {
		 return depth;
	 }
	 
	 public void setDepth(int depth)
	 {
		 this.depth = depth;
		 return;
	 }
	
	 public String toString()
	 {
		 
		 return super.toString() + ", Depth: " + depth + " meters";
	 }
	 
	 public int computeSurfaceArea()
	 {
		 return 2 * ((getWidth() * getHeight()) + (getHeight() * depth) + (getWidth() * depth));
	 }
	 
	 public int computeVolume()
	 {
		 return (getWidth() * getHeight() * depth);
	 }
 }