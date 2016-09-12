import java.util.Scanner; 

public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("To calculate your BMI, please answer the following questions..." + "\n" + "First, how tall are you in inches?");
		
		int h = keyboard.nextInt();
		
		System.out.println("How much do you weigh in pounds?");
		
		int w = keyboard.nextInt();
		
		int BMI = ((703*w)/(h*h));
		
		System.out.println("Your BMI is " + BMI + ".");
		
		
	}
	
}