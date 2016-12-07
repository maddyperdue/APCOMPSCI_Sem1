public class AverageNumbers
{
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100);
		}
		
		System.out.println("Numbers... ");
		
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
	
		System.out.println("\n");
		System.out.println("The average of the above numbers is... " + average(numbers));
	}
	
	public static int average(int[] n)
	{
		int avg = 0;
		for(int num : n)
		{
			avg += num;
		}
		return avg/10;
	}
}