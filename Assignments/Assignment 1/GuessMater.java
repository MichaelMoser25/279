package PersonAndDate;

import java.util.Scanner;

// Michael Moser
// 20349246

public class GuessMaster {
    private int numberOfCandidateEntities; // Number of entities currently in the game
    private Entity[] entities; // Array to hold Entity objects
    private static Scanner scanner; // Scanner object for user input

    // Constructor
    public GuessMaster() {
        // Initialize scanner for user input
        this.scanner = new Scanner(System.in);
        
        // Initialize the number of entities and the entities array with a size of 5
        this.numberOfCandidateEntities = 0;
        this.entities = new Entity[5]; 
    }

    // Method to add an Entity to the game
    public void addEntity(Entity entity) {
        // Check if there's space in the entities array
        if (numberOfCandidateEntities < entities.length) {
            entities[numberOfCandidateEntities] = entity;
            numberOfCandidateEntities++;
        } else {
            System.out.println("Entities are maxed out.");
        }
    }

    // Method to play the game with a specific Entity
    public void playGame(Entity entity) {
        // Prompt user for input
        System.out.println("Type 'quit' to exit game");
        System.out.println("Guess the birth date of " + entity.getName() + " (mm/dd/yyyy): ");
        String input = scanner.nextLine();
        
        // Check if user wants to quit
        if (input.equals("quit") || input.equals("exit")) {
            System.out.println("Exiting the game.");
            System.exit(0);
        }
        
        // Create a Date object using the input date string
        Date guessDate = new Date(input);
        // Get the actual birth date of the entity
        Date actualDate = entity.getBorn();

        // Check if the guessed date matches the actual birth date
        if (guessDate.equals(actualDate)) {
            System.out.println("Congratulations! You guessed the correct birth date of " + entity.getName() + ".");
            return; // Exit method
        } else if (guessDate.precedes(actualDate)) {
            System.out.println("Incorrect. Try a later date.");
        } else {
            System.out.println("Incorrect. Try an earlier date.");
        }
    }

    // Method to play the game with an Entity at a specific index
    public void playGame(int index) {
        if (index < numberOfCandidateEntities && index >= 0) {
            Entity entity = entities[index];
            playGame(entity);
        } else {
            System.out.println("Invalid entity index.");
        }
    }

    // Method to play the game with a randomly selected Entity
    public void playGame() {
        if (numberOfCandidateEntities == 0) {
            System.out.println("No entities are added");
            return;
        }
        
        int randomNum = randomEntity();
        Entity randomEntity = entities[randomNum];
        playGame(randomEntity);
    }

    // Method to generate a random index within the range of available entities
    int randomEntity() {
        return (int) (Math.random() * numberOfCandidateEntities);
    }
    
    // Method to generate a string representation of the GuessMaster object
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("GuessMaster{");
        for (int i = 0; i < numberOfCandidateEntities; i++) {
            s.append("\nEntity ").append(i + 1).append(": ").append(entities[i]);
        }
        s.append("\n}");
        return s.toString();
    }

    // Main method
    public static void main(String[] args) {
        // Create a GuessMaster object
        GuessMaster gm = new GuessMaster();
        
        // Create Entity objects and add them to GuessMaster
        Entity trudeau = new Entity("Justin Trudeau", new Date("December", 25, 1971));
        Entity dion = new Entity("Celine Dion", new Date("March", 30, 1968));
        Entity usa = new Entity("United States", new Date("July", 4, 1776));
        gm.addEntity(trudeau);
        gm.addEntity(dion);
        gm.addEntity(usa);
        
        // Print the current state of GuessMaster
        System.out.println(gm.toString());
        
        // Start the game loop
        while (true) {
            gm.playGame();
        }
    }
}
