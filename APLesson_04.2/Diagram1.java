import java.util.Scanner;
public class Diagram1
{
	static int l, w;
	static int perimeter;
	
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		
		//initialize variables
		System.out.println("What is your rectangle's length?");
		l = kb.nextInt();
		System.out.println("What is your rectangle's width?");
		w = kb.nextInt();
		
		//method calls
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perimeter = (2*l)+(2*w);
		//use l and w directly
	}
	public static void print()
	{
		//print using the perimeter value
		System.out.println("The perimeter of your rectangle is " + perimeter);
	}
}