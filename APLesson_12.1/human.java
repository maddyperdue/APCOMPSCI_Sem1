public class human
{
	//instance variables
	private String hair, eyes, skin;
	
	//Default Constructor
	public human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	//Constructor
	public human(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//Modifier
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	//Accessors
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}