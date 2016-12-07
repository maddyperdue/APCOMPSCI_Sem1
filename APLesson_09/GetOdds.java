public class GetOdds
{
	static int [] numbers = new int[10];
	
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the following numbers... ");
		printArray();
		System.out.println("The numbers " + getOdds() + "are the odd numbers. ");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100) + 1;
		}
		
	}
	
	public static void printArray()
	{
		for(int num : numbers)
		{
			System.out.print(num+ " ");
		}
		System.out.println("\n");
	}
	
	public static String getOdds()
	{
		String odds = "";
		for(int num : numbers)
		{
			if(num%2 != 0)
			odds += num + " ";
		}	
		return odds;		
	}
}