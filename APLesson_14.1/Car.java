public class Car
{
	private double[] location;
	public int ID;
	
	public Car()
	{
		location = new double[2];
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double xLoc, double yLoc)
	{
		xLoc = location[0];
		yLoc = location[1];
	}
	
	public double[] getLoc()
	{
		return location;
	}
}