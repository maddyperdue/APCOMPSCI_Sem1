import java.util.Random;
public class Toyota extends Car
{
	private double[] location;
	private double xLoc, yLoc;
	private int ID;
	
	public Toyota()
	{
		super();
		location = new double[2];
		ID = (int)(Math.random()*1000000+1);
	}
	
	public Toyota(String loc)
	{
		xLoc = Double.parseDouble(loc.substring(0,1));
		yLoc = Double.parseDouble(loc.substring(3));
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