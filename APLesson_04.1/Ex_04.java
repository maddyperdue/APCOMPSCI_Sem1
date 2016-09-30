import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Ex_04 volume = new Ex_04();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("To calculate a subwoofer box's volume in cubic feet:" + "\n" + "Enter the height in inches");
		double h = kb.nextDouble();
		
		System.out.println("Enter the length in inches");
		double l = kb.nextDouble();
		
		System.out.println("Enter the width in inches");
		double w = kb.nextDouble();
		
		System.out.printf("The volume of the subwoofer is %10.2f cubic feet.", volume.vol(h,l,w));
	}
	
	public double vol(double h, double l, double w)
	{
		return h*l*w/1728;
	}
}