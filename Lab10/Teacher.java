 /*
 * 
 */
 
 public class Teacher extends Person
 {
	 private String course1, course2;
	 
	 public Teacher(String name, String address)
	 {
		 super(name, address);
	 }
	 
	 public String toString()
	 {
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
	 
	 public String getCourse1()
	 {
		 return course1;
	 }
	 
	 public String getCourse2()
	 {
		 return course2;
	 }
	 
	 public void setCourse1(String course1)
	 {
		 this.course1 = course1;
		 return;
	 }
	 
	 public void setCourse2(String course2)
	 {
		 this.course2 = course2;
		 return;
	 }
 }