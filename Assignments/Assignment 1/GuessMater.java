package PersonAndDate;

import java.util.Scanner;

public class GuessMaster {
	private int numberOfCandidateEntities;
    private Entity[] entities;
    private static Scanner scanner;

    public GuessMaster() {
    	// Create scanner
        this.scanner = new Scanner(System.in);
        
        // Initialize the entities array with size 5
        this.numberOfCandidateEntities = 0;
        
        // Initialize the entities array with size 5
        this.entities = new Entity[5]; 
    }

    public void addEntity(Entity entity) {
        if (numberOfCandidateEntities < entities.length) {
            entities[numberOfCandidateEntities] = entity;
            numberOfCandidateEntities++;
        } else {
            System.out.println("Entites are maxed out.");
        }
    }


    
    public void playGame(Entity entity) {
        System.out.println("Guess the birth date of " + entity.getName() + " (mm/dd/yyyy): ");
        String input = scanner.nextLine();
        
        // Check if user wants to quit
        if (input.equals("quit") || input.equals("exit")) {
          System.out.println("Exiting the game.");
          System.exit(0);;
      }
        
        // Create a Date object using the input date string
        Date guessDate = new Date(input);

        // Get the actual birth date of the entity
        Date actualDate = entity.getBorn();

        // Check if the guessed date matches the actual birth date
        // Correct guess (exit loop)
        if (guessDate.equals(actualDate)) {
            System.out.println("Congratulations! You guessed the correct birth date of " + entity.getName() + ".");
            return; 
        } 
        
        // Incorrect guess- try later (continue loop)
        if (guessDate.precedes(actualDate)) {
            System.out.println("Incorrect. Try a later date.");
            return;
        } 
        
        // Incorrect guess- try earlier (continue loop)
        else {
            System.out.println("Incorrect. Try an earlier date.");
            return;
        }
        
    }
    
    

    public void playGame(int index) {
        if (index < numberOfCandidateEntities && index >= 0) {
            Entity entity = entities[index];
            playGame(entity);
        } 
        
        // Out of entity bounds
        else {
            System.out.println("Invalid entity index.");
        }
    }

    public void playGame() {
        if (numberOfCandidateEntities == 0) {
            System.out.println("No entites are added");
            return;
        }
        
        int randomNum = randomEntity();
        Entity randomEntity = entities[randomNum];
        playGame(randomEntity);
    }

    int randomEntity() {
        return (int) (Math.random() * numberOfCandidateEntities);
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("GuessMaster{");
        for (int i = 0; i < numberOfCandidateEntities; i++) {
            s.append("\nEntity ").append(i + 1).append(": ").append(entities[i]);
        }
        s.append("\n}");
        return s.toString();
    }
    

	public static void main(String []args) {
		// Add Entitys;
		GuessMaster gm = new GuessMaster();
		Entity trudeau = new Entity("Justin Trudeau", new Date("December", 25, 1971));
		Entity dion = new Entity("Celine Dion", new Date("March", 30, 1968));
		Entity usa = new Entity("United States", new Date("July", 4, 1776));
		gm.addEntity(trudeau);
		gm.addEntity(dion);
		gm.addEntity(usa);
		gm.toString();
		
		// Print Entitys
	    System.out.println(gm.toString());
	    	   

	    while (true) {
//	        System.out.println("Do you want to play again? (yes/no): ");
	    	gm.playGame();
	    }
    }
	
}
