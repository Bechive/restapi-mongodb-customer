package customer;

import org.springframework.data.annotation.Id;

public class Customer {
	@Id private String id;
	private String firstName;
	private String lastName;
	private String email;// = "NOT_SET"; //Example doesn't include email setup

	public void setfirstName(String firstName) {
			this.firstName = firstName;
	}
	public void setLastName(String lastName) {
			this.lastName = lastName;
	}
	public void setEmail(String email) {
			this.email = email;
	}

	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public String getEmail() {return email;}
}
