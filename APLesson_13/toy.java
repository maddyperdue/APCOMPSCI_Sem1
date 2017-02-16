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
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	//Modifiers
	public void setName(String n)
	{
		name = n;
	}
	
	public void setCount(int c)
	{
		count = c;
	}
	
	//Abstract Method
	public abstract String getType();
	
	public String toString()
	{
		return "[" + name + "]" + "[" + count + "], ";
	}
}