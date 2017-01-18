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
		userID = "";
	}
	
	//Constructor
	public user(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
}