import java.util.Scanner;
public class Average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your first number: ");
		double num1 = kb.nextDouble();
		
		System.out.println("Please enter your second number: ");
		double num2 = kb.nextDouble();
		
		System.out.println("Please enter your third number: ");
		double num3 = kb.nextDouble();
		print(num1, num2, num3, average(num1, num2, num3));
	}
	
	public static double average(double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3;
	}
	
	public static void print(double one, double two, double three, double average)
	{
		System.out.printf("The average of " + one + ", " + two + ", and " + three + " is %.5f.", average);
	}
}