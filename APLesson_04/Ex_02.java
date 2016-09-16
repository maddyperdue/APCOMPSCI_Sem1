import java.util.Scanner;

public class Ex_02
{
	public static void main(String[]args)
	{
		Ex_02 id = new Ex_02();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String first = kb.next();
		
		System.out.println("Enter your last name:");
		String last = kb.next();
		
		System.out.println("Enter your title:");
		String title = kb.next();
		
		System.out.println("Enter the school site:");
		String school = kb.next();
		
		System.out.println("Enter the school year:");
		String year = kb.next();
		
		System.out.println("What is your subject?");
		String subject = kb.next();
		
		id.format(school, year);
		id.format(first, last);
	
	}
}