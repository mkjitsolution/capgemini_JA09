package p1;

import java.util.Random;
import java.util.Scanner;

public class StudentApp {

	Scanner sc = new Scanner(System.in);

	Student arr[] = new Student[3];

	public void addStudent(int index) {
		// 1. read student information from the user

		System.out.println("Enter Student Name");
		String name = sc.nextLine();

		System.out.println("Enter Student Id");
		int id = Integer.parseInt(sc.nextLine());

		System.out.println("Enter Student Marks");
		int marks = Integer.parseInt(sc.nextLine());

		System.out.println("Enter Student Course Name");
		String courseName = sc.nextLine();

		
		// 2. create student object

		Student s = new Student();
		s.setStudentInfo(name, id, marks,courseName);

		// insert student object into the array
		arr[index] = s;
	}

	public void displayInformation() {

		// iterate the array
		for (Student student : arr) {
			student.displayStudentInfo();
		}
		// print the student information
		// STudent class display information will print the information

	}

	public void attendExam() {
		// iterate the array
		
		Random random = new Random();
		
		for (Student student : arr) {
			System.out.println("Enter the marks");
			student.giveExam(Integer.parseInt(sc.nextLine()));
		}
		// for every student call giveExam()
	}

	
	public void changeCourseById()
	{
		
		// get the search id from user
		System.out.println("Enter Student Id for Changing the Course ");
		int inputid = Integer.parseInt(sc.nextLine());
		boolean isValidId = false;
		
		// search the id in the array
		
		for (Student student : arr) {
			if(student.getId() == inputid)
			{
				isValidId = true;
				// if match then ask for new course 
				   // change the course
				System.out.println("Enter New Course Name");
				String newCourseName = sc.nextLine();
				
				student.setNewCourse(newCourseName);
				break;
				
			}
		}
		
		
	
		// of not match -> display id not available 
		if(isValidId == false)
		{
			System.out.println(" ID "+inputid+" is not available ");
		}
	
		
		
	}
		
	public static void main(String[] args) {

		StudentApp app = new StudentApp();

		while (true) {

			System.out.println("== MENU ===");
			System.out.println("1. Add Student");
			System.out.println("2. Display Students");
			System.out.println("3. Attend Exam");
			System.out.println("4. Change Course by Id");
			
			System.out.println("0. EXIT");

			System.out.println("Enter the Option : ");
			int choice = Integer.parseInt(app.sc.nextLine());

			switch (choice) {
			case 1:
				for (int i = 0; i < 3; i++) {
					app.addStudent(i);
				}

				break;
			case 2:
				app.displayInformation();
				break;

			case 3:
				app.attendExam();
				break;
				
			case 4:
				app.changeCourseById();
				break;
				
				

			case 0:
				System.exit(0);

			default:
				break;
			}// end switch

		} // end of while

	}// end of main
}// end class
