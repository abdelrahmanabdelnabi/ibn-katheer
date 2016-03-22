package entity;

public class Student extends FacultyMember {

	private float GPA;

	// List<Course> courseList;

	// default constructor
	public Student() {
		super();
		GPA = 0;
	}

	// full argument constructor
	public Student(String fname, String lname, String number, String Email,
			float gpa) {
		super(fname, lname, number, Email);
		GPA = gpa;
	}

	// setters and getters
	public float getGPA() {
		return GPA;
	}

	public void setGPA(float gpa) {
		GPA = gpa;
	}

}
