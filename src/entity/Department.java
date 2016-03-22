package entity;

public class Department {

	private String name;

	// private List<Course> courseList;

	// default constructor
	public Department() {
		name = "";
	}

	// full argument constructor
	public Department(String name) {
		this.name = name;
	}

	// setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
