/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card cardA = new Card("Diamond", "8", 8)
		Card cardB = new Card("Club", "Queen", 12)
		Card cardC = new Card("Club", "Queen", 12)

		//test matches method
		System.out.println("cardA and cardB match (expected false): " + cardA.matches(cardB));
		System.out.println("cardA and cardC match (expected false): " + cardA.matches(cardC));
		System.out.println("cardB and cardC match (expected true): " + cardB.matches(cardC));

		//test toString method
		System.out.println(cardA.toString());
	}
}
