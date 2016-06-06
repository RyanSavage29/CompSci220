/****************************************************************************************************************************************************
* Class CourseTaken creates CourseTaken objects that defines a courseName and a grade for the objects in the constructor based on object decleration
* Includes methods to get grade and toString to print out grade and the course name
****************************************************************************************************************************************************/

 public class CourseTaken
 {
	 private String courseName;
	 private int grade;
	 
	 // constructor
	 public CourseTaken(String courseName, int grade)
	 {
		this.courseName =  courseName;
		this.grade = grade;
	 }
	 
	 // getter for grade
	 public int getGrade()
	 {
		 return grade;
	 }
	 
	 // string representation of grade and courseName
	 public String toString()
	 {
		 return "Has a " + grade + " in " + courseName;
	 }
 }