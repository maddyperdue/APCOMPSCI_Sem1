import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		System.out.println("Enter the length: ");
		double l = nextDouble();
		
		System.out.println("Enter the width: ");
		double w = nextDouble();
		
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = (2*l) + (2*w);
	}
	
	public static void print()
	{
		System.out.print("The perimeter of your rectangle is " + perimeter);
	}
}