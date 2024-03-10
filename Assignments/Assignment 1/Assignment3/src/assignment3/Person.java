package assignment3;

public class Person extends Entity implements Cloneable {
	private String gender;
	
//	@Override
//    public Person clone() {
//        try {
//            return (Person) super.clone();
//        } catch (CloneNotSupportedException e) {
//            // Handle the exception appropriately
//            return null;
//        }
//    }
	
	public Person(Entity entity) {
		super(entity);
		gender = " ";
	}
    
    // Constructor
    public Person(String theName, Date theDate, String gender, double theDifficulty) {
        super(theName, theDate, theDifficulty);
        this.gender = gender;
    }
    
    // Copy constructor
    public Person(Person other) {
        super(other); // Call parent class copy constructor
        this.gender = other.gender;
    }
    
    // Clone method
    public Person clone() {
        return new Person(this); // Invoke copy constructor to create a new instance
    }
    
    public String getGender() {
    	return gender;
    }
    
    public void setGender(String newGender) {
    	gender = newGender;
    }
    
    // entityType method
    public String entityType() {
        return "This entity is a person!";
    }

    // toString method
    public String toString() {
        return ("Name: " + getName() + "\n" +
				"Born on: " + getBorn().toString() + "\n" + 
				"Gender: " + gender + "\n");
    }
}
