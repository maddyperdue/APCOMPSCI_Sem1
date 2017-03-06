public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem uno = new XBox("Woof");
		GameSystem dos = new PlayStation("something");
		GameSystem tres = new PC("rad");
		
		System.out.println(uno);
		System.out.println(dos);
		System.out.println(tres);
	}
}