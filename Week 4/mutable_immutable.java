package prac;

//Generating random numbers
import java.util.Random;

// Import scanner
import java.util.Scanner;

// The import statements:
import utilities.numericstuff.*;
import utilities.numericstuff.statistical.*;
//imports both the utilities.numericstuff and utilities.numericstuff.statistical packages

/** • The package java.lang contains the classes that are fundamental to Java
programming
◦ It is imported automatically, so no import statement is needed
◦ Classes made available by java.lang include Math, String, and the
wrapper classes for the fundamental data types
*/

public class pack {
	// Generating random numbers
	Random rnd = new Random();
	
	// To generate random numbers use the nextInt() method to get a
	// random number from 0 to n-1
	int i = rnd.nextInt(10);	// Random
	// number from 0-9
	
	// The following line creates an object named keyboard of the class Scanner:
	Scanner keyboard = new Scanner(System.in);
	
	// The method nextInt reads one int value typed in at the keyboard, and assigns it to
	// a variable:
	int numberOfPods = keyboard.nextInt();
	
	// The method nextDouble reads one double value typed in at the keyboard, and
	// assigns it to a variable:
	double d1 = keyboard.nextDouble();
	
	// The method nextLine reads an entire line of keyboard input
	String line = keyboard.nextLine();
	
	// PRIVACY LEAKS
	public Date getBirthDate() {
		return born;               // dangerous
	}
	
	public Date getBirthDate() {
		return new Date(born);    // Corrrect
	}
	
	/** Mutator Classes
	A class that contains public mutator methods or other public methods that can
	change the data in its objects is called a mutable class, and its objects are called
	mutable objects 
	◦ Never write a method that returns a mutable object.
	◦ Instead, use a copy constructor to return a reference to a completely
	independent copy of the mutable object
	*/
	
	/** Immutable Classes
	◦ Objects of such a class are called immutable objects
	◦ It is perfectly safe to return a reference to an immutable object because
	the object cannot be changed in any way
	◦ The String class is an immutable class
	◦ All wrapper classes of fundamental types are immutable:
		◦ Boolean, Character, Byte, Short, Integer, Long,
		Float, Double
	*/
	
	//Immutable Class
	public class IAmImmutable {
		private int myID ;
		
		public IAmImmutable(int myID) {
			this.myID = myID ;
		}
		
		public int getMyID() {
			return(this.myID) ;
		}
	}
	// ...
	IAmImmutable var1 = new IAmImmutable(55) ;

	var1 = new IAmImmutable(22); // OK!
	
	// Better Immutable Class
	public final class IAmMoreImmutable {
		private final int myID ;
		
		public IAmMoreImmutable(int myID) {
			this.myID = myID ;
		}
		public int getMyID() {
			return(this.myID) ;
		}
	}
	// ...
	final IAmMoreImmutable var2 = new IAmMoreImmutable(55) ;

	var1 = new IAmMoreImmutable(22); // NOT ALLOWED
	

	
}
