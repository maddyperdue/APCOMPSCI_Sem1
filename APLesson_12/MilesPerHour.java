import java.lang.Math.*;
public class MilesPerHour
{
	//instance variables
	private int distance, hours, minutes;
	private double mph;
	
	//Default Constructor
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	//Constructor with params
	public MilesPerHour(int dis, int hrs, int min)
	{
		distance = dis;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	
	//Modifier
	public void setValues(int dis, int hrs, int min)
	{
		distance = dis;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	
	//Accessor
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
}