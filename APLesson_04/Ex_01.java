import java.util.Scanner; 

public class Ex_01
{
	public static void main(String[]args)
	{
		Ex_01 receipt = new Ex_01();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = kb.next();
		
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		
		System.out.println("Please enter item 2:");
		String item2 = kb.next();
		
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		
		System.out.println("Please enter item 3:");
		String item3 = kb.next();
		
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		String subtotal = "Subtotal:";
		double subtotal1 = price1 + price2 + price3;
		
		String tax = "Tax:";
		double tax1 = subtotal1*.08;
		
		String total = "Total:";
		double total1 = subtotal1 + tax1;
		
		System.out.println("\t<<<<<<Receipt>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		receipt.format(subtotal, subtotal1);
		receipt.format(tax, tax1);
		receipt.format(total, total1);
		System.out.println("\n" + "_______________________________");
		System.out.println("Thank you for shopping with us!");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n%10s     %10.2f", item, price);
	}
}