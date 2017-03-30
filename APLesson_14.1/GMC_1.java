import java.util.Random;
public class GMC_1 implements Car
{
	double xLoc, yLoc;
	
	public GMC_1()
	{
		xLoc = yLoc = 0;
	}
	
	public GMC_1(double x, double y)
	{
		xLoc = x;
		yLoc = y;
	}
	
	public int getID()
	{
		Random rand = new Random();
		return rand.nextInt(900000) + 100000;
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