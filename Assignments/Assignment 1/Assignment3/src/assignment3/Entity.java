package assignment3;


public abstract class Entity {
	private String name;
	private Date born;
	private double difficulty; // Will be used to calculate number of tickets (0-1)
	
	public abstract String entityType(); // Abstract method to be implemented by subclasses to return the type of entity

	public abstract Entity clone(); // Abstract method to be implemented by subclasses to clone the entity

	public Entity(String name, Date birthDate, double difficulty) {
	    this.name = name;
	    this.born = new Date(birthDate); // Creating a new Date object to avoid privacy leak
	    this.difficulty = difficulty;
	}

	public Entity(Entity entity) {
	    this.name = entity.name;
	    this.born = new Date(entity.born); // Creating a new Date object to avoid privacy leak
	    this.difficulty = entity.difficulty;
	}

	public String getName() {
	    return name;
	}

	public Date getBorn() {
	    return new Date(born); // Returning a copy of the Date object to avoid privacy leak
	}

	public double getDifficulty() {
	    return difficulty;
	}

	public int getAwardedTicketNumber() {
	    int tickets = (int)(difficulty * 100); // Type cast to an integer
	    return tickets;
	}

	public String toString() {
	    return "Name: "+name+"\n"+"Born at: "+born.toString()+"\n"; // Returns a string representation of the entity
	}

	public String welcomeMessage() {
	    return "Welcome! Let’s start the game! " + entityType(); // Returns a welcome message for the game
	}

	public String closingMessage(Entity entity) {
	    return "Congratulations! The detailed information of the entity you guessed is: \n" + entity.toString(); // Returns a closing message with detailed information of the entity
	}
}
