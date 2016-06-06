 /*
 * 
 */
 
 import java.util.ArrayList;
 
 public class Student extends Person
 {
	 private int numCourses;
	 private double avgGrade;
	 private ArrayList<CourseTaken> courses = new ArrayList<CourseTaken>();
	 
	 public Student(String name, String address)
	 {
		 super(name, address);
	 }
	 
	 public String toString()
	 {
		 return super.toString() + " Average Grade: " + getAverageGrade();
	 }
	 
	 public void addCourseGrade(String course, int grade)
	 {
		 courses.add(new CourseTaken(course, grade));
	 }
	 
	 public void printGrades()
	 {
		 for (int i = 0; i < courses.size(); i++)
		 {
			System.out.println(courses.get(i)); 
		 }
	 }
	 
	 public double getAverageGrade()
	 {
		for (int i = 0; i < courses.size(); i++)
		{
			avgGrade += courses.get(i).getGrade(); 
			numCourses += 1;
		}
		return avgGrade / numCourses; 
	 }
 }
 