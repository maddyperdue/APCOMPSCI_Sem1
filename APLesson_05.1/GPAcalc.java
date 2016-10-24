import java.util.Scanner;
public class GPAcalc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your math grade: ");
		String grade1 = kb.next();
		System.out.println("Enter your science grade: ");
		String grade2 = kb.next();
		System.out.println("Enter your english grade: ");
		String grade3 = kb.next();
		System.out.println("Enter your art grade: ");
		String grade4 = kb.next();
		System.out.println("Enter your music grade: ");
		String grade5 = kb.next();
		System.out.println("Enter your history grade: ");
		String grade6 = kb.next();
		System.out.println("Enter your computer science grade: ");
		String grade7 = kb.next();
		
		String A = "A";
		String B = "B";
		String C = "D";
		String D = "D";
		String F = "F";
		
		double gPoints = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
		
		System.out.printf("Your GPA is %.2f", gPoints/7);
	}
	
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		
		return 0.0;
	}
}