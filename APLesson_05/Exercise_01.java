public  class Exercise_01
{
	public static void main(String[]args)
	{
		int player = (int)(Math.random()*6)+1;
		int computer = (int)(Math.random()*6)+1;
	
		String winner = diceRoll(player, computer);
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is " + winner);
	}
	
	public static String diceRoll(int player, int computer)
	{
		String winner = "";
		
		if (player>computer)
			winner = "you";
		if (player<computer)
			winner = "computer";
		return winner;
	}
}