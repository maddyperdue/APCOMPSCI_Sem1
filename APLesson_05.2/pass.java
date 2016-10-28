import java.util.Scanner;
public class pass
{
	static Scanner kb;
	static String password1;
	static String username1;
	static String password2;
	static String username2;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		
		System.out.println("Set your username: ");
		username1 = kb.next();
		System.out.println("Set your password: ");
		password1 = kb.next();
		
		passCheck();
	}	
	
	public static void passCheck()
	{
		kb = new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		username2 = kb.next();
		System.out.println("Enter your password: ");
		password2 = kb.next();
		
		if(username2.equals(username1) && password2.equals(password1))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if(username2.equals(username1) && password2!=password1)
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}
			else if(username2!=username1 && password2.equals(password1))
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			else
			{
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
		}
		
	}
}