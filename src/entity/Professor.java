package entity;

public class Professor extends FacultyMember {

	private String degree;
	private float salary;
	// List<Course> courseList;
	// add a department reference?

	// default constructor
	public Professor() {
		super();
		degree = "";
		salary = 0;
	}

	// full argument constructor
	public Professor(String fname, String lname, String number, String Email,
			String degree, float salary) {
		super(fname, lname, number, Email);
		this.degree = degree;
		this.salary = salary;
	}
	
	//setters and getters
	public String getDegree(){
		return degree;
	}
	public void setDegree(String degree){
		this.degree = degree;
	}
	public float getSalary(){
		return salary;
	}
	public void setSalary(float salary){
		this.salary = salary;
	}

}
