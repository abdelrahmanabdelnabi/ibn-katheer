package entity;
import java.util.*;

public class Course {

	private String name;
	private String code;
	private int creditHours;
	private List<Integer> ids ; //student
	private List <Integer>idp;	//professors

	// List<Student> studentList;
	// add a department reference?

	// default constructor
	public Course() {
		name = "";
		code = "";
		creditHours = 0;
		ids=  new ArrayList<Integer>();
		idp=  new ArrayList<Integer>();
	}
	
	// full argument constructor
	public Course(String name, String code, int hours) {
		this.name = name;
		this.code = code;
		this.creditHours = hours;
		ids = new ArrayList<Integer>();
		idp = new ArrayList<Integer>();
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
	public void addStudent(int id){
		Integer i = new Integer(id);
		//thanks to question 5561100 on stackoverflow
		ids.add(i);
		Collections.sort(ids);
	}
	public void delStudent(int id){
		Integer i = new Integer (id);
		ids.remove(i);
	}
	public void addProf(int id){
		Integer i = new Integer(id);
		//thanks to question 5561100 on stackoverflow
		//and yes I just copied pasted from the above one :P :P
		idp.add(i);
		Collections.sort(idp);
	}
	public void delProf(int id){
		Integer i = new Integer (id);
		idp.remove(i);
	}
	public boolean isStudentthere(int id){
		Integer i = new Integer(id);
		return ids.contains(i);
	}
	public boolean isProfthere(int id){
		Integer i = new Integer(id);
		return idp.contains(i);
	}
}
