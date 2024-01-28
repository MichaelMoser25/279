
// Static methonds

Remember that we have invoked public methods by creating a (calling) object
first (e.g., the object accnt below) :
	
	BankAccount accnt = new BankAccount(“Mr. Simpson”,100.0);
	accnt.deposit(300.0);
	
• But you might also remember that sometimes we have invoked a method
without creating a calling object:
	int min = Math.min(20,30);
	System.exit(0);
	System.out.println(“Hello, World!”);
	
• Why?
◦ let’s refer to the API (Application Programming Interface ) of the Math class:
https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html


• A static method is one that can be used without creating (i.e. instantiating) a
calling object.

public static returnedType myMethod(arguments){ ... }


Static methods can be invoked in 2 ways
1. Using just the class name:
	returnedValue = MyClass.myMethod(arguments);

2. From the calling object:
	MyClass object1 = new MyClass() ;
	returnedValue = object1.myMethod(arguments);
	
	
	Suppose you are defining a class Car. Should you define the following
	methods as static or not?
		boolean setMileage(double mpg) {...}
		// set the mileage for a car
		double convertMpgToKpl(double mpg){...}
		// convert miles per gallon
		// to kilometers per liter
	• Imagine how you are going to use/invoke these methods:
		Car myFordCar = new Car();
		myFordCar.setMileage(200.0);
		double kpl = Car.convertMpgToKpl(10.0);
		
That means you should define setMileage to be a regular (i.e. non-static)
method, but convertMpGToKpl should be static
	
• Use the following headers:
	public boolean setMileage(double mpg){...}
	public static double convertMpgToKpl(double mpg){...}


public static double abs(double arguement)  // returns absolute value of the arguement


Math.abs(-6) and Math.abd(6) // both return 6
public static double min(double n1, double n2)
public static double max(double n1, double n2)

public static long round(double argument)
Math.round(3.2) // return 3


public static double cell(double argument)
Math.ceil(3.2) and Math.ceil(3,9) // both return 4.0

public static double floor(double argument)
Math.floor(3.2) and Math.floor(3.8) // both return 3.0

public static double sqrt(double argument)
Math.sqrt(4) // return 2.0

// Example

public static int moreEfficient(Car c1, Car c2)
public int moreEfficient(Car anotherCar)

//We can invoke these methods with:
Car c3 = new Car(...);
Car c4 = new Car(...);
... ...
int compResult = Car.moreEfficient(c3, c4);
int compResult = c3.moreEfficient(c4);


public static void main(String[] args){...}

• As we have seen before, the main method is a special static method: it will
be automatically invoked when you run the corresponding program in the
Command Window (e.g., “java HelloWorld”) or in Eclipse.


Boxing: the process of going from a value of a primitive type to an object of
its wrapper class:

	int age = 87;
	Integer ageObj = new Integer(age);

Unboxing: the process of going from an object of a wrapper class to the
corresponding value of a primitive type
	int age = ageObj.intValue();


Automatic boxing: Instead of creating a wrapper class object using the new
operation (as shown before), it can be done as an automatic type cast:
	
	Integer ageObj = 87;
this is same as:
	
	Integer ageObj = new Integer(87);

• Automatic unboxing

	int age = ageObj;
this is same as :
	int age = ageObj.intValue();


For example, wrapper classes include useful constants that provide the largest
and smallest values for any of the primitive number types
	Integer.MAX_VALUE
	Integer.MIN_VALUE
	Double.MAX_VALUE
	Double.MIN_VALUE




For example, wrapper classes have static methods that convert a correctly
formed string representation of a number to the number of a given type:

	double interestRate = Double.parseDouble("0.015");
	int age = Integer.parseInt("87");
	
• Wrapper classes also have static methods that convert from a numeric value to
a string representation of the value

• For example, the expression
	Double.toString(123.99); //returns the string value "123.99"

public static char toUpperCase(char argument)
public static char toLowerCase(char argument)
public static boolean isUpper(char argument) // returns bool
public static boolean isLower(char argument) // returns bool
public static boolean isWhitespace(char argument)
public static boolean isLetter(char argument)
public static boolean isDigit(char argument)
public static boolean isLetterOrDigit(char argument)



variable2.setName(“Josephine”);
variable2.setNumber(1);


variable2.set("Josephine", 1);


When a method’s parameter is a primitive type ...
	public void setMileage(double iniMileage){
		mileage = iniMileage;
		iniMileage = 100.0;
	}

...and if it is invoked by:
		
	double myMileage = 50.0;
	car1.setMileage(myMileage);
	
... then the value of myMileage will still be 50.0 after you invoke :
	
	car1.setMileage(myMileage);


public boolean equals(BankAccount otherAcount){
	...
	otherAccount.setOwner(“Mr. Change”);
}
which is invoked by:
	BankAccount accnt1 = new BankAccount(“Mr. Simpson”,100.0);
	BankAccount accnt2 = new BankAccount(“Bart”,200.0);
	Boolean bSameAccount = accnt1.equals(accnt2);
	
Now, the value of owner in accnt2 will be “Mr. Change”;


Last lrcture
Static variables in wrapper classes
	Integer.MAX_VALUE
◦ Static methods in wrapper classes
	double interestRate = Double.parseDouble("0.015");
	int age = Integer.parseInt("87");

When a method’s parameter is a primitive type
	public void setMileage(double iniMileage){
		mileage = iniMileage;
		iniMileage = 100.0;
	}
• and if it is invoked by:
	double myMileage = 50.0;
	car1.setMileage(myMileage);
◦ the value of myMileage will still be 50.0 after you invoke
	car1.setMileage(myMileage);



public Person(String initialName,
				Date birthDate,
				Date deathDate){
	if (consistent(birthDate, deathDate)){
		name = initialName;
		born = new Date(birthDate);
		if (deathDate == null)
			died = null;
		else
			died = new Date(deathDate);
	}
	else{
		System.out.println("Inconsistent dates.");
		System.exit(0);
	}
}

private static boolean consistent(Date birthDate, Date deathDate)
{
	if (birthDate == null) return false;
	else if (deathDate == null) return true;
	else return (birthDate.precedes(deathDate) || birthDate.equals(deathDate));
}

public boolean equals(Person otherPerson)
{
	if (otherPerson == null)
		return false;
	else
		return (name.equals(otherPerson.name) &&
		born.equals(otherPerson.born) &&
		datesMatch(died, otherPerson.died));
}

private static boolean datesMatch(Date date1, Date date2)
{
	if (date1 == null)
		return (date2 == null);
	else if (date2 == null) //&& date1 != null
		return false;
	else // both dates are not null.
		return(date1.equals(date2));
}

public String toString( )
{
	String diedString;
	if (died == null)
		diedString = ""; //Empty string
	else
		diedString = died.toString( );
		return (name + ", " + born + "-" + diedString);
}




public Date getBirthDate()
{
	return born; //dangerous
}
◦ Instead of:
public Date getBirthDate()
{
	return new Date(born); //correct
}

