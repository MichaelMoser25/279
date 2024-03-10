package assignment3;

import java.util.Random;
import java.util.Scanner;

public class GuessMaster {
	private int numOfEntities;
	private Entity[] entities; 
    private int totalTickets;

	
	public GuessMaster() {
		numOfEntities = 0;
		entities = new Entity[100]; 
        totalTickets = 0;

	}

	public void addEntity(Entity entity) {
        entities[numOfEntities++] = entity.clone();
	}
	
	public void playGame(int entityId) {
		Entity entity = entities[entityId];
		playGame(entity);
	}
	
	public void playGame(Entity entity) {
		// Print welcome message
		System.out.println(entity.welcomeMessage());
		
		System.out.printf("\nGuess %s's birthday\n", entity.getName());
		System.out.println("(mm/dd/yyyy)");
        entity.welcomeMessage();
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String answer = scanner.nextLine();
			answer = answer.replace("\n", "").replace("\r", "");

			if (answer.equals("quit")) {
				System.exit(0);
			}

			Date date = new Date(answer);

			if (date.precedes(entity.getBorn())) {
				System.out.println("Incorrect. Try a later date.");
			} else if (entity.getBorn().precedes(date)) {
				System.out.println("Incorrect. Try an earlier date.");
			} else {
				Random random = new Random();
				int rd = random.nextInt(50);
				rd += 50; 
                int awardedTickets = entity.getAwardedTicketNumber();
                totalTickets += awardedTickets;
				System.out.println("*************Bingo!***************\n");
                System.out.println("You won " + awardedTickets + " tickets in this round. \n"
                		+ "Your total number of tickets is " + totalTickets + ".\n");
				System.out.printf("**********************************\n");
				
				// Call closing message
				String message = entity.closingMessage(entity);
				System.out.println(message);	
				System.out.printf("**********************************\n");

				break;
			}
		}
	}
	
	public void playGame() {
		while (true) {
			int entityId = genRandomEntityId();
			playGame(entityId);
		}
	}

	public int genRandomEntityId() {
		Random randomNumber = new Random();
		return randomNumber.nextInt(numOfEntities);
	}

	public static void main(String[] args) {
		System.out.println("=========================\n");
		System.out.println("     GuessMaster 1.0 \n");
		System.out.println("=========================");	
		
        
		Entity usa = new Country("United States", new Date("July", 4, 1776), 0.5, "Washington DC");

		// The last parameter of the follow line
		// is the difficulty score described above.
		Politician trudeau = new Politician("Justin Trudeau", new Date("December", 25, 1971), 0.25, "Liberal", "Male");
		
		
		Singer dion = new Singer("Celine Dion", new Date("March", 30, 1961), "La voix du bon Dieu", new Date("November", 6, 1981), 0.5, "Female");
		Person myCreator = new Person("myCreator", new Date("September", 1, 2000), "Female", 1);

		GuessMaster gm = new GuessMaster();
		gm.addEntity(trudeau);
		gm.addEntity(dion);
		gm.addEntity(myCreator);
		gm.addEntity(usa);
		
		gm.playGame();
	}
}

