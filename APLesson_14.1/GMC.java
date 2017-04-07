import java.util.Random;
public class GMC extends Car
{
	double xLoc, yLoc;
	private int ID;
	
	public GMC()
	{
		xLoc = yLoc = 0;
		ID = (int)(Math.random()*1000000+1);
	}
	
	public GMC(double x, double y)
	{
		xLoc = x;
		yLoc = y;
		ID = (int)(Math.random()*1000000+1);
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		xLoc = x;
		yLoc = y;
	}
	
	public double[] getLoc()
	{
		double[] location = {xLoc, yLoc};
		return location;
	}
	
}