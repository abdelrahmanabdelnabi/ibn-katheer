package entity;

public class FacultyMember {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private char gender;
	// add a department reference?
	
	// default Constructor
	public FacultyMember(){
		firstName = "";
		lastName = "";
		phoneNumber = "";
		email = "";
	}
	
	//full argument constructor
	public FacultyMember(String fname, String lname, String number, String Email){
		firstName = fname;
		lastName = lname;
		phoneNumber = number;
		email= Email;
	}
	
	//setters and getters
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String name){
		firstName = name;
	}
	public String getlastName(){
		return lastName;
	}
	public void setLastName(String name){
		lastName = name;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public void setPhoneNumber(String number){
		phoneNumber = number;
	}
	public String getPhoneNubmer(){
		return phoneNumber;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}
	public char getGender(){
		return gender;
	}
	public void setGender(char Gender){
		gender = Gender;
	}

}
