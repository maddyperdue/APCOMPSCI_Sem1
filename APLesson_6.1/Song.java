public class Song
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}

	public static void sing(String lyric, int mult)
	{
		for(int i = 1; i <= mult; i++)
		{
			System.out.print(lyric + " ");
		}
		System.out.println();
	}
}