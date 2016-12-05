import java.util.Scanner;
public class Lesson_09.1
{
	public static void main(String[]args)
	{
		int[] numbers = nwe int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int num : numbers)
			System.out.println(num);
	}
}