import java.util.Random;
public class Honda_1 implements Car
{
	private double[] location;
	private double xLoc, yLoc;
	
	public Honda_1()
	{
		xLoc = 0;
		xLoc = 0;
	}
	
	public Honda_1(double[] location)
	{
		xLoc = location[0];
		yLoc = location[1];
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