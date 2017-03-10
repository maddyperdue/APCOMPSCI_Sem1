import java.util.Random;
public class Toyota implements Location
{
	private double[] location;
	private double xLoc, yLoc;
	
	public Toyota()
	{
		super();
		location = new location[2];
	}
	
	public Toyota(String loc)
	{
		xLoc = Double.parseDouble(loc.substring(0,1));
		yLoc = Double.parseDouble(loc.substring(3));
	}
	
	public double getID()
	{
		Random rand = new Random();
		return rand.nextInt(900000) + 100000;
	}
	
	public double move()
}