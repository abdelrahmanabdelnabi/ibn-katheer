package entity;

public class University {
	private String name;
	private String address;
	//List<Department> departmentList;
	
	// default constructor
	public University(){
		name = "";
		address = "";
	}
	
	// full argument constructor
	public University(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	//setters and getters
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
}
