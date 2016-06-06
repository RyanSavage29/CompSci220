 /******************************************************************************************************************************************************************************************************************************
 * Class Student is a subclass to Person that stores number of courses, average grade, and arraylist courses
 * Includes methods to add a CourseTaken object to arraylist courses, prints out all of the CourseTaken objects in arraylist courses, calculates the average grades, and toString to print out name, address, and average grade
 ******************************************************************************************************************************************************************************************************************************/
 
 import java.util.ArrayList;
 
 public class Student extends Person
 {
	 private int numCourses;
	 private double avgGrade;
	 private ArrayList<CourseTaken> courses = new ArrayList<CourseTaken>();
	 
	 // constructor
	 public Student(String name, String address)
	 {
		 super(name, address);
	 }
	 
	 // string representation of name, address, and average grade
	 public String toString()
	 {
		 return super.toString() + " Average Grade: " + getAverageGrade();
	 }
	 
	 // add CourseTaken object to arraylist courses
	 public void addCourseGrade(String course, int grade)
	 {
		 courses.add(new CourseTaken(course, grade));
	 }
	 
	 // prints all of the CourseTaken objects in arraylist courses
	 public void printGrades()
	 {
		 for (int i = 0; i < courses.size(); i++)
		 {
			System.out.println(courses.get(i)); 
		 }
	 }
	 
	 // returns the average grade from all of the CourseTaken objects
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
 