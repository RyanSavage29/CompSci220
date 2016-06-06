/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab10
 ******************************/
 
 /****************************************************************************************
 * Class Test is a driver class that instantiates and updates Teacher and Student objects
 ****************************************************************************************/
 
 public class Test
 {
	 public static void main(String[] args)
	 {
		 
		 /*******************************************************************************************
		 * Created new Student object
		 * Printed out s Student object
		 * Added 6 CourseTaken objects to arraylist course in s Student object
		 * Printed all CourseTaken objects in arraylist courses in s Student object
		 * Printed out average grade of CourseTaken objects in arraylist courses in s Student object
		 *******************************************************************************************/
		 
		 Student s = new Student("Ryan", "49 Brandon Avenue"); 
		 System.out.println(s);
		 s.addCourseGrade("Astronomy", 100);
		 s.addCourseGrade("Biology", 30);
		 s.addCourseGrade("Calculus", 80);
		 s.addCourseGrade("Computer Science", 90);
		 s.addCourseGrade("Physics", 60);
		 s.addCourseGrade("English", 10);
		 s.printGrades();
		 System.out.println("Average Grade: " + s.getAverageGrade() + "\n");
		 
		 /***********************************************
		 * Created new Teacher object
		 * Printed out t Teacher object
		 * Set 2 courses to t Teacher object
		 * Printed out teacher and courses using getters
		 ***********************************************/
		 
		 Teacher t = new Teacher("Professor Tao", "2000 Pennington Road");
		 System.out.println(t);
		 t.setCourse1("Computer Science");
		 t.setCourse2("Mathematics");
		 System.out.println(t.getName() + " teaches " + t.getCourse1());
		 System.out.println(t.getName() + " teaches " + t.getCourse2());
	 }
 }