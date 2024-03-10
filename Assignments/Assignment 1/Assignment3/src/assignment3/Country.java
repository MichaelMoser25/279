package assignment3;

public class Country extends Entity implements Cloneable {
	private String capital;
	
//	@Override
//    public Country clone() {
//        try {
//            return (Country) super.clone();
//        } catch (CloneNotSupportedException e) {
//            // Handle the exception appropriately
//            return null;
//        }
//    }
	
	// This method creates a deep copy of the Country object using the copy constructor.
	public Country clone1() {
	    return new Country(this); // Invokes copy constructor to create a new instance
	}
	
	// Constructor to initialize a Country object with provided parameters.
	public Country(String theName, Date theDate, double theDifficulty, String theCapital) {
		super(theName, theDate, theDifficulty);
		capital = theCapital;
	}
	
	// Copy constructor to create a deep copy of another Country object.
	public Country(Country originalObject) {
		super(originalObject);
		capital = originalObject.capital;
	}
	
	// Getter method to retrieve the capital of the country.
	public String getCapital() {
		return capital;
	}
	
	// Setter method to set the capital of the country.
	public void setCapital(String newCapital) {
		capital = newCapital;
	}
	
	// toString method to return a string representation of the Country object.
	public String toString() {
		return ("Name: " + getName() + "\n" +
				"Born on: " + getBorn().toString() + "\n" + 
				"Capital: " + capital);
	}

	// Clone method to create a deep copy of the Country object using the copy constructor.
    public Country clone() {
        return new Country(this); // Invokes copy constructor to create a new instance
    }

	// Method to return the entity type of the object (Country).
	public String entityType() {
        return "This entity is a country!";	
    }


}
