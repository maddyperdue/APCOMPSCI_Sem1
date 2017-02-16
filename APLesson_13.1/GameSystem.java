import java.util.random;
public abstract class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem
	{
		//Constructors
		public GameSystem()
		{
			platform = "";
			serialNo = 0;
		}
		
		public GameSystem(String p)
		{
			platform = p;
			Random rand = new Random;
			serialNo = rand.nextInt(9000000) + 1000000;
		}
		
		//Accessors
		public String getPlatform()
		{
			return platform;
		}
		
		public int getserialNo()
		{
			return serialNo;
		}
	}
}