import java.util.Scanner;
public class Diagram
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//variables
		System.out.println("Enter the height:");
		int height = kb.nextInt();
		
		System.out.println("Enter the width");
		int width = kb.nextInt();
		
		//method call(parameters)+
		int perimeter = calcPerim(height, width);
		
		//print statement
		System.out.println("Your perimeter is " + perimeter + "ft.");
	}
	
	public static int calcPerim(int h, int w)
	{
		//use parameters values in calculation
		return 2*(h+w);
	}
	
}