public class AFigure extends toy
{
	private String name;
	private int count;
	
	public AFigure()
	{
		name = "";
		count = 1;
	}
	
	public AFigure(String n, int c)
	{
		name = n;
		count = c;
	}
	
	public String getType()
	{
		return "Action Figure";
	}
}