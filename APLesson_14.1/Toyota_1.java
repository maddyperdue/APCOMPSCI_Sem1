import java.util.Random;
public class Toyota_1 implements Car
{
	private double[] location;
	private double xLoc, yLoc;
	
	public Toyota_1()
	{
		super();
		location = new double[2];
	}
	
	public Toyota_1(String loc)
	{
		xLoc = Double.parseDouble(loc.substring(0,1));
		yLoc = Double.parseDouble(loc.substring(3));
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