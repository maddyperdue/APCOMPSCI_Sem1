public abstract class Console extends GameSystem
{
	
	public Console()
	{
		super();
	}
	
	public Console(String x)
	{
		super(x);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "\nPlatform: " + super.getPlatform() +
				"\nSerial #: " + super.getserialNo() +
				"\nController: " + getController(); 
	}
}