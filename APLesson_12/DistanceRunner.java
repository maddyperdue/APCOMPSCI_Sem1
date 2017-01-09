import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter x1: ");
		int x1 = kb.nextInt();
		
		System.out.println("Enter y1: ");
		int y1 = kb.nextInt();
		
		System.out.println("Enter x2: ");
		int x2 = kb.nextInt();
		
		System.out.println("Enter y2: ");
		int y2 = kb.nextInt();
		
		Distance object = new Distance(x1, y2, x2, y2);
		
		System.out.println("Distance = " + object.getDist());
		
		System.out.println("Enter x3: ");
		int x3 = kb.nextInt();
		
		System.out.println("Enter y3: ");
		int y3 = kb.nextInt();
		
		System.out.println("Enter x4: ");
		int x4 = kb.nextInt();
		
		System.out.println("Enter y4: ");
		int y4 = kb.nextInt();
	
		object.setValues(x3,y3,x4,y4);
		
		System.out.println("Distance = " + object.getDist());
	}
}