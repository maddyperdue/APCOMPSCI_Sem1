import java.util.Random;
public abstract class ticket
{
	private int serialNo;
	
	//Constructor
	public ticket()
	{
		Random rand = new Random();
		serialNo = rand.nextInt(9000000) + 1000000; 
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "\nSerial #: " + getSerialNo() +
				"\nPrice: " + getPrice();
	}
	
}