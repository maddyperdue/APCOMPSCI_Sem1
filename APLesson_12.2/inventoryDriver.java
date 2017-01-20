import java.util.Scanner;
public class inventoryDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter item manufacturer: ");
		String manufacturer = kb.next();
		
		System.out.println("Enter item name: ");
		String name = kb.next();
		
		System.out.println("Will you be entering category and price information? (y or n)");
		String ans = kb.next();
		
		if(ans.equals("n"))
		{
			inventory item1 = new inventory(manufacturer, name);
			System.out.println(item1);
		}
		if(ans.equals("y"))
		{
			System.out.println("Enter item category: ");
			String category = kb.next();
			
			System.out.println("Enter item price: ");
			double price = kb.nextDouble();
			
			inventory item1 = new inventory(manufacturer, name, category, price);
			System.out.println(item1);
		}
	}
}