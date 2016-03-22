package entity;

public class Course {

	private String name;
	private String code;
	private int creditHours;

	// List<Student> studentList;
	// add a department reference?

	// default constructor
	public Course() {
		name = "";
		code = "";
		creditHours = 0;
	}

	// full argument constructor
	public Course(String name, String code, int hours) {
		this.name = name;
		this.code = code;
		this.creditHours = hours;
	}

	// setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int hours) {
		creditHours = hours;
	}

}
