import java.util.Scanner;
public class adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You are alone in the woods. ");
		System.out.println("From the south, you hear a cry for help. ");
		System.out.println("From the north, you hear a stream. ");
		System.out.println("What do you do?");
		System.out.println("[1] Run south. ");
		System.out.println("[2] Run north. ");
		System.out.println("[3] Stay put. ");
		
		int choice = kb.nextInt();
		
		if(choice == 1)
		{
			System.out.println("You find the source of the cry for help. It is a clown, and he does not need help. You have been tricked. ");
			System.out.println("What do you do?");
			System.out.println("[1] Ask him for a balloon animal. ");
			System.out.println("[2] Try to run away. ");
			
			choice = kb.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Smiling, he pulls out a deflated balloon and stretches it out. ");
				System.out.println("With a single swift motion, he wraps it around your neck, slowly suffocating you. ");
				System.out.println("You are added to the long list of people murdered by the anonymous clown of the woods. You lose. ");
			}
			
			else
			{
				System.out.println("The clown attempts to grab you as you begin your sprint, but you are able to escape. ");
				System.out.println("You eventually find a road and see a car slowly approaching from the distance. ");
				System.out.println("What do you do? ");
				System.out.println("[1] Attempt to hitchhike with the approaching driver. ");
				System.out.println("[2] Ignore the driver and walk along the road to find the nearest town. ");
				
				choice = kb.nextInt();
				
				if(choice == 1)
				{
					System.out.println("The driver pulls over and lets you into their car. You don't look at the driver as you buckle your seatbelt");
					System.out.println("After a couple minutes of driving, you glance over at him. It is a clown. You have been kidnapped, and are never seen again. You lose. ");
				}
				
				else
				{
					System.out.println("You eventually make it to the next town and are able to report the clown to the local police. You survived. ");
				}
			}
		}
	
		else if(choice == 2)
		{
			System.out.println("You make it to the stream, but discover you are not alone. ");
			System.out.println("A momma bear and her cubs are fishing for a late night snack, but have not noticed you yet. ");
			System.out.println("On a rock in the middle of the stream, you spot a pile of unopened Klondike bars. ");
			System.out.println("What do you do? ");
			System.out.println("[1] Quietly retreat and re-enter the woods. ");
			System.out.println("[2] Make a mad dash to the Klondike bars. ");
			
			choice = kb.nextInt();
			
			if(choice == 1)
			{
				System.out.println("As soon as you enter the woods, you are greeted by grinning clown. ");
				System.out.println("You are kidnapped by the clown, and never seen again. ");
				System.out.println("After weeks of searches by the police, you are presumed dead. You lose. ");
			}
			
			else 
			{
				System.out.println("You grab the Klondike bar and open it. The bears hear the packaging and instantly run over to you. ");
				System.out.println("They also grab Klondike bars for themselves and eat them whole. ");
				System.out.println("You all smile at the camera and say \"What would YOU do for a Klondike bar?\" ");
				System.out.println("You are in a new TV commerical. You survived! ");
			}
		}
		
		else
		{
			System.out.println("After 30 minutes of waiting around, you begin to feel sleepy. ");
			System.out.println("What do you do? ");
			System.out.println("[1] Take a walk to keep yourself awake. ");
			System.out.println("[2] Take a nap on the ground. ");
			
			choice = kb.nextInt();
			
			if(choice == 1)
			{
				System.out.println("You walk for hours without finding anything new. You lose track of what direction you came from, and find yourself lost in the woods. ");
				System.out.println("Your calls for help are met with silence. You seek to find the stream you heard before, but cannot reach it. ");
				System.out.println("You continue to wander for days, and eventually die of dehydration. You lose. ");
			}
			
			else
			{
				System.out.println("In an hour, you wake up from your slumber. You look up to see a clown grinning at you from above. ");
				System.out.println("You don't have time to react, and he knocks you out with his air pump. ");
				System.out.println("You are never seen again. After weeks of searches, you are assumed dead. You lose. ");
			}
		}
	}
}
