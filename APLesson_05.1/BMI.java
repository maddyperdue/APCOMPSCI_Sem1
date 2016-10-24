import java.util.Scanner;
public class BMI
{
	static String condition;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your height in inches: ");
		double h = kb.nextDouble();
		System.out.println("Enter your weight in pounds: ");
		double w = kb.nextDouble();
		
		double bmi = ((703*w)/(h*h));
		calcCondish(bmi);
		
		System.out.printf("Your BMI is: %.1f\nYou are %s", bmi, condition);
	}
	
	public static void calcCondish(double bmi)
	{
		if(bmi>39.9)
			condition = "Morbidly Obese";
		else if(bmi>35)
			condition = "Very Obese";
		else if(bmi>29.9)
			condition = "Obese";
		else if(bmi>25)
			condition = "Overweight";
		else if(bmi>18.5)
			condition = "Normal";
		else
			condition = "Underweight";

	}
}