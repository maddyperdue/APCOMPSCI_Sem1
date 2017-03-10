import java.util.Random;
public class GMC implements Location
{
	double xLoc, yLoc;
	
	public GMC()
	{
		xLoc = yLoc = 0;
	}
	
	public GMC(double x, double y)
	{
		xLoc = x;
		yLoc = y;
	}
	
	public double getID()
	{
		Random rand = new Random();
		return rand.nextInt(900000) + 100000;
	}
	
	public double move(double x, double y)
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