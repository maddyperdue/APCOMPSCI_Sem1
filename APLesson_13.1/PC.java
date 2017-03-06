public class PC extends GameSystem
{
	
	public PC()
	{
		super();
	}
	
	public PC(String x)
	{
		super(x);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "\nPlatform: " + super.getPlatform() +
				"\nSerial #: " + super.getserialNo() +
				"\nSystem Input: " + systemInput(); 
	}
	
}