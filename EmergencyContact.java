import java.util.Objects;
import java.util.ArrayList;

import java.util.*;

class EmergencyContact
{

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String Relationship;

	public EmergencyContact(String firstName, String lastName, String phoneNumber, String Relationship)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.Relationship = Relationship;
	}

	//update emergency contact information
	public void updateFirstName(String name)
	{
		this.firstName = name;
	}

	public void updateLastName(String name)
	{
		this.lastName = name;
	}

	public void updatePhone(String number)
	{
		this.phoneNumber = number;
	}

	public void updateRelationship(String status)
	{
		this.Relationship = status;
	}

	//getter methods
	public String getFirstName()
	{
		return this.firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public String getNumber()
	{
		return this.phoneNumber ;
	}

	public String getRelationship()
	{
		return this.Relationship;
	}

}