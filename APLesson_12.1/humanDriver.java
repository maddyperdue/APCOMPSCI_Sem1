import java.util.Scanner;
public class humanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("For yourself....");
		
		System.out.println("Enter hair color: ");
		String hair = kb.next();
		
		System.out.println("Enter eye color: ");
		String eyes = kb.next();
		
		System.out.println("Enter skin color: ");
		String skin = kb.next();
		
		human object = new human(hair, eyes, skin);
		
		System.out.println("My info...");
		System.out.println("Hair:	" + hair);
		System.out.println("Eyes:	" + eyes);
		System.out.println("Skin:	" + skin);
		
		System.out.println("\nFor a friend...");
		
		System.out.println("Enter hair color: ");
		String hair2 = kb.next();
		
		System.out.println("Enter eye color: ");
		String eyes2 = kb.next();
		
		System.out.println("Enter skin color: ");
		String skin2 = kb.next();
		
		human object2 = new human(hair2, eyes2, skin2);
		
		System.out.println("Friend's info...");
		System.out.println("Hair:	" + hair2);
		System.out.println("Eyes:	" + eyes2);
		System.out.println("Skin:	" + skin2);
	}
}