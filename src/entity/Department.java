package entity;
import java.util.*;
public class Department {

	private String name;

	// private List<Course> courseList;
	private List <String> courses;
	// default constructor
	public Department() {
		name = "";
		courses = new ArrayList<String>();
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
	public void addCourse(String s){
		//thanks to question 5561100 on stackoverflow
		courses.add(s);
		Collections.sort(courses);
	}
	public void delCourse(String s){
		courses.remove(s);
	}
	public boolean isCoursethere(String s){
		return courses.contains(s);
	}
}