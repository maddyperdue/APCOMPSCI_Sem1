public class Car extends toy
{
	private String name;
	private int count;
	
	public Car()
	{
		super();
	}
	
	public Car(String n)
	{
		super(n);
	}
	
	public String getType()
	{
		return "Car";
	}
}