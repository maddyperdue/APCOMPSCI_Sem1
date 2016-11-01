import java.util.Scanner;
public class Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the cube's side length: ");
		double side = kb.nextDouble();
		
		print(side, calcSurf(side));
	}
	
	public static double calcSurf(double side)
	{
		return 6*side*side;
	}
	
	public static void print(double s, double surfaceA)
	{
		System.out.printf("The surface area of a cube whose sides are " + s + " in length is %.5f.", surfaceA);
	}
}