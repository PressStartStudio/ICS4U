// This is the ADT to store the Student's information
public class Student {

	public int studentNum, lockerNum;
	public String firstName, lastName;
	
	// default student constructor 
	public Student() {
		this("unknown", "unknown", -1, -1);
	}
	
	// parameterized constructor
	public Student(String fName, String lName, int number, int locker) {
		studentNum = number;
		lockerNum = locker;
		firstName = fName;
		lastName = lName;
	}

}

