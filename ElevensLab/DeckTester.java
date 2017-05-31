/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] rankA = {"9", "Jack", "Ace"};
		String[] suitA = {"Spades", "Clubs", "Hearts"};
		int[] valueA = {9, 10, 1}
		Deck deckA = new Deck(rankA, suitA, valueA);
		System.out.println("deckA size (expected 3): " + deckA.size());

		String[] rankB = {"King", "2", "6"};
		String[] suitB = {"Hearts", "Clubs", "Diamonds"};
		int[] valueB = {13, 2, 6}
		Deck deckB = new Deck(rankB, suitB, valueB);
		System.out.println("deckB is empty (expected false): " + deckB.isEmpty());

		String[] rankC = {"Queen", "King", "King"};
		String[] suitC = {"Diamonds", "Spades", "Hearts"};
		int[] valueC = {12, 13, 13}
		Deck deckC = new Deck(rankC, suitC, valueC);
		System.out.println("card delt by deckC: " deckC.deal());
	}
}
