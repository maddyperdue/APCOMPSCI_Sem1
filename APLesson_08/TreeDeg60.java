import java.util.Scanner;
public class TreeDeg60
{
	static String word;
	static int start;
	static int stop;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		word = kb.next();
		start=1;
		stop = word.length();
		tree(word, start, stop);
	}
	
	public static void tree(String word, int start, int stop)
	{
		if(start <= stop) 
		{
			System.out.printf("%10s\n", word.substring(0, start));
			start++;
			tree(word, start, stop);
		}	
		
	}
}