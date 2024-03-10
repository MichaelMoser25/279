package assignment3;

public class Singer extends Entity implements Cloneable{
	private String debutAlbum;
    private Date debutAlbumReleaseDate;
    
    
    public Singer(Entity entity) {
		super(entity);
		debutAlbum = " ";
		debutAlbumReleaseDate = new Date();
	}
    
    // Constructor
    public Singer(String theName, Date theDate, String album, Date debutDate, double d, String gender) {
        super(theName, theDate, d);
        this.debutAlbum = album;
        this.debutAlbumReleaseDate = debutDate;
    }
    
    // Copy constructor
    public Singer(Singer original) {
        super(original);
        this.debutAlbum = original.debutAlbum;
        this.debutAlbumReleaseDate = new Date(original.debutAlbumReleaseDate);
    }
    
    // Clone method
    public Singer clone() {
        return new Singer(this);
    }
    
    // toString method
    @Override
    public String toString() {
        return super.toString() +
                "Debut Album: " + debutAlbum + "\n" +
                "Debut Album Release Date: " + debutAlbumReleaseDate + "\n";
    }
    
    // entityType method
    
    public String entityType() {
        return "This entity is a singer!";
    }
}
