import java.util.Scanner; 

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first number.");
		
		int a = keyboard.nextInt();
		
		System.out.println("Enter your second number.");
		
		int b = keyboard.nextInt();
		
		int x = (b*a*a*a*a);
		
		System.out.println("Your first number to the fourth power and then multiplied by your second number is " + x + ".");
		
	}
	
}