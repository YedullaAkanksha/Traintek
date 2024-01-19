package demo.example.beans;

public class User {
	private String FirstName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	private String LastName;
	public User() {
		FirstName="firstname";
		LastName="lastname";
	}

}
