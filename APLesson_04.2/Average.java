import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double average;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		num1 = kb.nextDouble();
		
		System.out.println("Enter the second number: ");
		num2 = kb.nextDouble();
		
		System.out.println("Enter the third number: ");
		num3 = kb.nextDouble();
		
		average();
		print();
	}
	
	public static void average()
	{
		average = (num1 + num2 + num3)/3;
	}
	
	public static void print()
	{
		System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is %.5f", average);
	}
}