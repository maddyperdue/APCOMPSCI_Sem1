import java.util.Scanner;
public class userDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = kb.next();
		System.out.println("Enter last name: ");
		String lastName = kb.next();
		
		System.out.println("Would you like to use a public avatar? (y or n)");
		String ans = kb.next();
		if(ans.equals("n"))
		{
			user user1 = new user(firstName, lastName);
			System.out.println(user1);
		}
		if(ans.equals("y"))
		{
			System.out.println("Enter avatar: ");
			String avatar = kb.next();
			user user1 = new user(firstName, lastName, avatar);
			System.out.println(user1);
		}
	}
}