package se.hig.odp2.mp2.model;

import java.util.List;

public class Person
{
    private String firstName, LastName;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		LastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return LastName;
	}
    
}
