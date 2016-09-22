import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Ex_03 payment = new Ex_03();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("To calculate the monthly payment on a loan, please answer the following:" + "\n" + "What is the interest rate in decimal form?" );
		double r = kb.nextDouble();
		
		System.out.println("What is the principal, or orginal amount intended to borrow?");
		double P = kb.nextDouble();
		
		System.out.println("How many times is the loan compounded per year?");
		double n = kb.nextDouble();
		
		System.out.println("What is the life of loan, in years?");
		double t = kb.nextDouble();
		
		
		System.out.printf("Your minimum monthly payment is $%10.2f.", payment.pay(r, P, n, t));
		
	}
	
	public double pay(double r, double P, double n, double t)
	{
		double amount = P * Math.pow(1+(r/n), n*t);
		return amount/(t*12);
	}
}