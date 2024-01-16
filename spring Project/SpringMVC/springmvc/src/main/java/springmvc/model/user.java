package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class user {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 private String firstname;
	 private String lastname;
	 private String number;
	 private String exampleInputEmail1;
	 private String username;
	 private String Password;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExampleInputEmail1() {
		return exampleInputEmail1;
	}
	public void setExampleInputEmail1(String exampleInputEmail1) {
		this.exampleInputEmail1 = exampleInputEmail1;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "user [firstname=" + firstname + ", lastname=" + lastname + ", number=" + number
				+ ", exampleInputEmail1=" + exampleInputEmail1 + ", username=" + username + ", Password=" + Password
				+ "]";
	}
	 
	 
}
