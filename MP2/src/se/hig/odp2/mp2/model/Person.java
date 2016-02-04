package se.hig.odp2.mp2.model;

import java.util.List;

public class Person
{
    private String firstName, lastName;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString()
	{
		return firstName + " " + lastName;
	}
}
