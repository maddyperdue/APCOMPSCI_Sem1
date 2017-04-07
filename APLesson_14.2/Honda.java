import java.util.Random;
public class Honda extends Car
{
	private double[] location = new double[2];
	private double xLoc, yLoc;
	private int ID;
	
	public Honda()
	{
		xLoc = 0;
		xLoc = 0;
		ID = (int)(Math.random()*1000000+1);
	}
	
	public Honda(double[] location)
	{
		xLoc = location[0];
		yLoc = location[1];
		ID = (int)(Math.random()*1000000+1);
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		xLoc = x + xLoc;
		yLoc = y + yLoc;
	}
	
	public double[] getLoc()
	{
		
		return location;
	}
}