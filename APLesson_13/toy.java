public abstract class toy
{
	private String name;
	private int count;
	
	//Default constructor
	public toy()
	{
		this.name = "";
		this.count = 1;
	}
	
	//Constructor
	public toy(String n)
	{
		this.name = n;
		this.count = 1;
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	
	public int getCount()
	{
		return this.count;
	}
	
	//Modifiers
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	//Abstract Method
	public abstract String getType();
	
	public String toString()
	{
		return this.name + " " + this.count;
	}
}