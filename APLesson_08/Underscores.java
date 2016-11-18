import java.util.Scanner;
public class Underscores
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		replace();
		System.out.println(replace(sentence));
	}
	
	public static void replace()
	{
		if(sentence.indexOf(" ") <= 0)
			return sentence;
		else
			sentence = sentence.substring(0, sentence.indexOf(" ")) + ("_") + sentence.substring(sentence.indexOf(" ") + 1);
			replace();
	}
}