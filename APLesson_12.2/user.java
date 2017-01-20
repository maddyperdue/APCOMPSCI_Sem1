public class user
{
	//instance variables
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	//Default Constructor
	public user()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	
	//Constructors
	public user(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public user(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random()* 1000000) + 1;
	}
	
	//Modifier
	public void setProfile(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random()* 1000000) + 1;
	}
	
	//Accessors
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
								"\nLast Name: " + lastName +
								"\nAvatar: " + avatar +
								"\nUser ID#: " + userID;
	}
	
}