import java.util.Scanner;
public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		String toyList = "";
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a list of toys: ");
		toyList = kb.nextLine();
		
		toyStore toy = new toyStore(toyList);
		System.out.println(toy);
		System.out.println("Most Frequent Toy: " + toy.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + toy.getMostFrequentType());
	}
}
