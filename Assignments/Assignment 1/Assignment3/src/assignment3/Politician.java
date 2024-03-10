package assignment3;

public class Politician extends Entity implements Cloneable{
	private String party;

	
	public Politician(Entity entity) {
	    super(entity); // Calls the superclass constructor to initialize inherited fields
	    party = " "; // Initializes the party attribute to an empty string
	}

	// Constructor to initialize Politician object with provided parameters
	public Politician(String theName, Date theDate, double theDifficulty, String party, String gender) {
	    super(theName, theDate, theDifficulty); // Calls the superclass constructor to initialize inherited fields
	    this.party = party; // Initializes the party attribute with the provided party
	}

	// Copy constructor to create a deep copy of another Politician object
	public Politician(Politician other) {
	    super(other); // Calls the superclass constructor to initialize inherited fields
	    this.party = other.party; // Copies the party attribute from the original object
	}

	// Clone method to create a deep copy of the Politician object
	@Override
	public Politician clone() {
	    return new Politician(this); // Invokes the copy constructor to create a new instance
	}

	// Getter method to retrieve the party of the politician
	public String getParty() {
	    return party;
	}

	// Setter method to set the party of the politician
	public void setParty(String newParty) {
	    party = newParty;
	}

	// toString method to return a string representation of the Politician object
	@Override
	public String toString() {
	    return super.toString() + // Calls the superclass toString method info
	            "Party: " + party + "\n"; // Adds party to the string 
	}

	// entityType method to return the entity type of the object (Politician)
	public String entityType() {
	    return "This entity is a politician!";
	}
}
