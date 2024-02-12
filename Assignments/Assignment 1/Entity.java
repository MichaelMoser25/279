package PersonAndDate;
import java.text.SimpleDateFormat;

public class Entity {
	private String name;
	private Date born;
	
	// Constructors
    public Entity(String name, Date born) {
        this.name = name;
        this.born = born; // Create a new Date object to avoid privacy leak
    }

    // Copy Constructor
    public Entity(Entity entity) {
        this.name = entity.getName();
        this.born = entity.getBorn(); // Create a new Date object to avoid privacy leak
    }
    
    // Accessors
    public String getName() {
        return name;
    }

    public Date getBorn() {
        return born; 
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setBorn(Date born) {
        this.born = new Date(); // Create a new Date object to avoid privacy leak
    }

    // toString() method
    public String toString() {
    	String entityInfo = (name + ", born on " + born.toString());
        return entityInfo;
    }

    // equals() method
    public boolean equals(Entity entity) {
    	if (this == entity) {
            return true;
        }
        if (entity == null) {
            return false;
        }
        if (entity.getClass() != this.getClass()){
            return false;
        }
        return this.name.equals(entity.getName()) && this.born.equals(entity.getBorn());
    }
	
}

