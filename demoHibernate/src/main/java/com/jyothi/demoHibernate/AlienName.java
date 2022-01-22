package com.jyothi.demoHibernate;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName {
	
	
	private String firstName;	
	private String middlename;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "AlienName [firstName=" + firstName + ", middlename=" + middlename + ", lastName=" + lastName + "]";
	}

	
}
