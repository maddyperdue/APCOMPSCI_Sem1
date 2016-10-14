import java.util.Scanner;
public class Exercise_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1: ");
		String item1 = kb.next();
		
		System.out.println("Please enter the price: ");
		double price1 = kb.nextDouble();
		
		System.out.println("Please enter item 2: ");
		String item2 = kb.next();
		
		System.out.println("Please enter the price: ");
		double price2 = kb.nextDouble();
		
		System.out.println("Please enter item 3: ");
		String item3 = kb.next();
		
		System.out.println("Please enter the price: ");
		double price3 = kb.nextDouble();
		
		System.out.println("Please enter item 4: ");
		String item4 = kb.next();
		
		System.out.println("Please enter the price: ");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = calcDisc(subtotal);
		double discountprice = subtotal - discount;
		double tax = discountprice * .08;
		double total = discountprice * 1.08;
		
		System.out.println("<<<<< Receipt >>>>>");
		
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		
		format("Subtotal:", subtotal);
		format("Discount:", discount);
		format("Subtotal:", discountprice);
		format("Tax:", tax);
		format("Total:", total);
		
		System.out.println("\n______________________");
		System.out.println("\nThank you for shopping with us!");
	}
	
	public static double calcDisc(double subtotal)
	{
		if (subtotal>=2000)
			return subtotal*.15;
		return 0.0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n%10s    %10.2f", item, price);
	}
}