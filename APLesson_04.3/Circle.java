import java.util.Scanner;
public class Circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the circle's radius: ");
		double radius = kb.nextDouble();
		
		print(radius, calcArea(radius));
	}
	
	public static double calcArea(double radius)
	{
		return Math.PI*Math.pow(radius, 2);
	}
	
	public static void print(double r, double area)
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %.5f.", area);
	}
}