public class ticketdriver
{
	public static void main(String[]args)
	{
		ticket uno = new walkup();
		ticket dos = new advance(10);
		ticket tres = new studentadvance(21);
		
		System.out.println(uno);
		System.out.println(dos);
		System.out.println(tres);
		
	}
}