/************************************************************************************
* Class CourseTaken stores a courseName and a grade
* Includes methods to get grade and toString to print out grade and the course name
************************************************************************************/

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