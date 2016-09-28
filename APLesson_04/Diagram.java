import java.util.Scanner;
public class Diagram
{	
	public static void main(String[]args)
	{
		Diagram product = new Diagram();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		one = kb.nextInt();

		System.out.println("Enter your second number:");
		two = kb.nextInt();
		
		product.multiply(one, two);
	}
	
}