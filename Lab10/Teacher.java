 /****************************************************************************************************
 * Class Teacher is a subclass to Person that stores 2 courses
 * Includes methods to get courses, set courses, and toString to print out name, address, and courses
 ****************************************************************************************************/
 
 public class Teacher extends Person
 {
	 private String course1, course2;
	 
	 // constructor
	 public Teacher(String name, String address)
	 {
		 super(name, address);
	 }
	 
	 // string representation of name, address, and courses
	 public String toString()
	 {
		 
		 /************************************************************
		 * If block that returns name, address, and possibly courses
		 * course1 and course2 are only returned if they have a value
		 ************************************************************/
		 
		 if (course1 == null && course2 != null)
		 {
			return super.toString() + " Teaches " + course2;
		 }
		 
		 else if (course2 == null && course1 !=null)
		 {
			 return super.toString() + " Teaches " + course1;
		 }
		 
		 else if (course1 == null && course2 == null)
		 {
			 return super.toString();
		 }
		 
		 else
		 {
			 return super.toString() + " Teaches " + course1 + " and " + course2;
		 }
	 }
	 
	 // getter for course1
	 public String getCourse1()
	 {
		 return course1;
	 }
	 
	 // getter for course2
	 public String getCourse2()
	 {
		 return course2;
	 }
	 
	 // setter for course1
	 public void setCourse1(String course1)
	 {
		 this.course1 = course1;
		 return;
	 }
	 
	 // setter for course2
	 public void setCourse2(String course2)
	 {
		 this.course2 = course2;
		 return;
	 }
 }