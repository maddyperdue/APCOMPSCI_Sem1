import java.util.Scanner;
public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your rectangle's length in feet: ");
		double l = kb.nextDouble();
		
		System.out.println("Please enter your rectangle's width in feet: ");
		double w = kb.nextDouble();
		
		print(calcPerim(l, w));
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is %.5f ft around.", perimeter);
	}
}