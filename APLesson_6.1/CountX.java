import java.util.Scanner;
public class CountX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What number would you like to count up to? ");
		int count = kb.nextInt();
		System.out.println("By what number would you like to count up by? ");
		int mult = kb.nextInt();
		
		for(int i = 0; i <= count; i+=mult)
		{
			System.out.print(i + " ");
		}
	}
}