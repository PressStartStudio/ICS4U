// This class uses and Array of Students to represent a classroom and store Student data

import java.util.Scanner;
public class Classroom {
	
	public static void main(String[] args) {
		// create a scanner to use for user input
		Scanner input = new Scanner(System.in);
		// prompt the user for the number of students in the class
		System.out.print("Please enter the number of students in the class: ");
		int classSize = input.nextInt();
		// now create the class (i.e. the array of students)
		Student[] theClass = new Student[classSize];
		// now start filling up the class
		for(int i = 0; i < theClass.length; i++) {
			// prompt the user for the student's information
			System.out.println("Entering Student " + (i+1));
			System.out.print("Please enter the student's first name: ");
			String fName = input.next();
			System.out.print("Please enter the student's last name: ");
			String lName = input.next();
			System.out.print("Please enter the student's number: ");
			int number = input.nextInt();
			System.out.print("Please enter the student's locker number: ");
			int locker = input.nextInt();
			// now create the Student and add it to the array
			theClass[i] = new Student(fName, lName, number, locker);
		}
		input.close();
		// now print the class list
		System.out.println("Student ID	Name			Locker");
		for(int i = 0; i < theClass.length; i++) {
			System.out.println(theClass[i].studentNum + "               " + theClass[i].lastName + ", " + theClass[i].firstName + "                    " + theClass[i].lockerNum);
		}
	}
}
