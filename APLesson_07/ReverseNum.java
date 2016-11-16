import java.util.Scanner;
public class ReverseNum
{
	static int rev = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = kb.nextInt();
		getReverse(number);
		System.out.println(number + " reversed is " + rev);
	}
	public static void getReverse(int number)
	{
		int num = number;
		while(num>0)
		{
			rev*=10;
			rev += num%10;
			num /= 10;
		}
	}
}