/*******************************
 * Programmer: Ryan Strenkowski
 * Instructor: Dr. Tao
 * Course: CSC220-03
 * Lab10
 ******************************/
 
 /***********************************************************************************************************************************
 * Class Test is a driver class that instantiates and  updates Teacher objects and Student objects using Classes Teacher and Student
 ***********************************************************************************************************************************/
 
 public class Test
 {
	 public static void main(String[] args)
	 {
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
		 
		 Teacher t = new Teacher("Professor Tao", "2000 Pennington Road");
		 System.out.println(t);
		 t.setCourse1("Computer Science");
		 t.setCourse2("Mathematics");
		 System.out.println(t.getName() + " teaches " + t.getCourse1());
		 System.out.println(t.getName() + " teaches " + t.getCourse2());
	 }
 }