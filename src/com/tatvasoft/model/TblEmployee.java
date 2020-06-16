package com.tatvasoft.model;

public class TblEmployee {

	private int userid;
	private String username, firstname, lastname, password, dateofbirth,emailaddress;
	char active;
	double mobilenumber;
public TblEmployee () {
	
}
	public TblEmployee(int userid , String username , String firstname , String lastname , String password , String dateofbirth , String emailaddress ,double mobilnumber ,char active ){		
		this.userid = userid;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.dateofbirth = dateofbirth;
		this.emailaddress = emailaddress;
		this.mobilenumber = mobilnumber;
		this.active = active;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public char getActive() {
		return active;
	}

	public void setActive(char active) {
		this.active = active;
	}

	public double getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(double mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


}
