import java.util.Objects;

class User
{
	//User Profile Information 
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private final int userID;

	//defining a user
	public User(String firstName, String lastName, String username, String password, String email)
	{
		//profile info
		this.username = firstName;
		this.password = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.userID = Objects.hash(username, password);

	}

	//Retrieving information (get functions)
	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}
	
	public String getUsername()
	{
		return username;
	}

	public String getPassword()
	{
		return password;
	}

	public String getEmail()
	{
		return email;
	}

	public int getUserID()
	{
		return userID;
	}


	//Setting attributes
	public void setNewFirstNameame(String NewFirstName)
	{
		this.firstName = NewFirstName;
	}

	public void setLastName(String NewLastName)
	{
		this.lastName = NewLastName;
	}
	
	public void setNewUsername(String NewUser)
	{
		this.username = NewUser;
	}

	public void setNewPassword(String NewPassword)
	{
		this.password = NewPassword;
	}

	public void setNewEmail(String NewEmail)
	{
		this.email = NewEmail;
	}


}