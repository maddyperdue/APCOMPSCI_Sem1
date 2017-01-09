import java.lang.Math.*;
public class Distance
{
	//instance variables
	private int xOne, yOne, xTwo, yTwo;
	double distance;
	
	//constructor
	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	//constructor with parameters
	public Distance(int xO, int yO, int xT, int yT)
	{
		xOne = xO;
		yOne = yO;
		xTwo = xT;
		yTwo = yT;
		distance = 0;
	}
	
	//modifier
	public void setValues(int xO, int yO, int xT, int yT)
	{
		xOne = xO;
		yOne = yO;
		xTwo = xT;
		yTwo = yT;
	}
	
	//accessor
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}