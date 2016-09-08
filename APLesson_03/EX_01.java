import java.util.Scanner; 

public class EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		System.out.println("Huh...I thought " + name + " was only a dog's name. " + "\n" + "How old are you, " + name + "?");
		
		int age = keyboard.nextInt();
		int predAge = age*3;
		
		System.out.println("Only " + age + "?! I thought you were at least " + predAge + "!" + "\n" + "What do you do for fun, " + name + "?");
		
		String funAct = keyboard.next();
		
		System.out.println("It really boosts my confidence that you " + funAct + " for fun! It makes my lousy life as a computer seem much more exciting in comparison!" + "\n" + "What kind of music do you like?");
		
		String music = keyboard.next();
		
		System.out.println("Why???? I heard that " + music + " music is used as torture in Los Angeles State prisons." + "\n" + "How many siblings do you have?");
		
		String sib = keyboard.nextInt();
		
		System.out.println(ok);
		
		
	}

}