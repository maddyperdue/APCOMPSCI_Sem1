public class Console extends GameSystem
{
	public abstract getController()
	{
		return controller;
	}
	
	public String toString()
	{
		return "\nPlatform: " + platform +
				"\nSerial #: " + serialNo +
				"\nController: " + controller;
	}
}