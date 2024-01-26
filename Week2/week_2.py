package package11;

public class first {

}


public class BankAccount {
	
	//------------------ Class members
	// Instance variables
	public String owner;
	public int accountId;
	private double balance;
	private double interestRate;
	
	// Methods
	public void deposit (double amount) {...}
	public double withdrawAll () {...}
	private double computeInterest () {...}
	
};

//new operators
// An object of a class is named or declared by a variable of the class type:
BankAcount account1;

// The new operator is then used to create the object:
account1 = new BankAccount();

// Combine 
BankAcount account1 = new BankAccount();

// When the new operator creates an object, it will call a special type of
// method, a constructor, to initialize an instance variable of the object.

// Constructors
// A constructor is a special type of methods that are designed to initialize
// the instance variables for an object:
// 	◦ A constructor must have the same name as the class.
// 	◦ A constructor has no type returned, not even void.

public class BankAccount {
	private String owner;
	private double balance;
	
	public BankAccount () {    // No argument constructor
		owner = “”;
		balance = 0.0;
	}
	public BankAccount (String ownerName,
							double firstDepositAmount) {
		owner = ownerName;
		balance = firstDepositAmount;
	}
};

BankAccount account1 = new BankAccount();
BankAccount account2 = new BankAccount(“Tom”,100.0);

// A constructor is called when an object of the class is created using new
//		◦ The name of a constructor and its parenthesized list of arguments (if any)
//		must follow the new operator



// this parameter 
// The first action taken by a constructor is to automatically create an
//	object that contains instance variables

// Then within the definition of a constructor, this parameter refers to
//	the object created by the constructor

public class BankAccount {
	private String owner;
	private int accountId;
	private double balance;
	private double interestRate;
	public BankAccount (String ownerName, double firstDepositAmount)
	{
		owner = ownerName;
		balance = firstDepositAmount;
	}
	public BankAccount(String ownerName,
						int iniAccountId,
						double firstDepositAmount,
						double iniInterestRate)
	{
		this(ownerName, firstDepositAmount);
		accountId = iniAccountId;
		interestRate = iniInterestRate;
	}
};

public class BankAccount {
	private String owner;
	private int accountId;
	private double balance;
	private double interestRate;
	public BankAccount (String owner, double balance)
	{
		this.owner = owner;
		this.balance = balance;
	}
	public BankAccount(String owner,
						int accountId,
						double balance,
						double interestRate)
	{
		this(owner, balance);
		this.accountId = accountId;
		this.interestRate = interestRate;
	}
}

//-----------

// create objects (or instance) using new Operator
//          object of instance of a class (account 1 & 2)
BankAccount account1 = new BankAccount();
BankAccount account2 = new BankAccount(“Tom”,100.0);


public class BankAccount {
	... ...
	public void deposit (double amount) {}
	public double withdrawAll () {
		...
		double interest = computeInterest()
			...
	}
	private double computeInterest () {...}
};
Here, computeInterest() is used to help withdrawAll() or other
methods in BankAccount, and is not visible outside by invoking
account1.computeInterest()


// Accessor Methods 
Accessor methods allow programmers to obtain the values of an object's
instance variables
◦ The name of an accessor method typically starts with the word get

public class BankAccount {
	private String owner;
	private double balance;
	...
	public String getOwner () {
		return owner;
	}
	...
};


// Mutator Methods
As discussed earlier, constructors can be used to initialize instance variables when
the new operator is used, but you cannot use them as a regular method to
change values of instance variables.
• You need to write a separate mutator method to change the values of an object's
instance variables
public class BankAccount {
	private String owner;
	private double balance;
	...
	public void setBalance (double newBalance) {
		balance = newBalance;
	}
};

The name of a mutator method typically starts with the word set
◦ a.k.a. Setter methods
• Incoming data is typically tested and/or filtered

public class BankAccount {
	private String owner;
	private double balance;
	...
	public boolean setBalance (double newBalance) {
		if (newBalance < 0)
		return false;
		balance = newBalance;
		return true;
	}
};


Accessor methods allow the programmer to obtain the values of an
object's instance variables
◦ The data is accessed but not changed
◦ The name of an accessor method typically starts with the word get
• Mutator methods allow the programmer to change the values of an
object's instance variables in a controlled manner
◦ Incoming data is typically tested and/or filtered
◦ The name of a mutator method typically starts with the word set.


Encapsulation means that the data and methods of a class are combined
into a single unit (i.e., a class object), which hides the implementation
details


The API or Application Programming Interface for a class is a description of
how to use the class.
◦ A programmer needs only to know the API in order to effectively make
use of a well designed class
• You have already had a large library of predefined classes to use. An
example is the String class we have discussed earlier.
◦ Here is the API of the String class:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html


Method definitions are divided into two parts:
◦ a heading and a method body:

public void myMethod() {
	//code
}

There are two types of methods:
◦ Methods that compute and return a value.
◦ Methods that perform an action
• This type of method does not return a value, and is called a void
method.

A method that returns a value must specify the type of that value in its
heading:
	public typeReturned methodName(paramList)
• A void method uses the keyword void in its heading to show that it does not
return a value :
	
	public void methodName(paramList)
	
• Note that constructors have no type returned, not even void.

A method that returns a value can also perform an action.
• If you want the action performed, but do not need the returned value,
you can invoke the method as if it were a void method, and the
returned value will simply be discarded:
	
	
	objectName.returnedValueMethod();

Java expects certain methods, such as equals() and toString(),
to be in all, or almost all, classes
• The purpose of equals(), a boolean valued method, is to compare
two objects of the class to see if they satisfy the notion of "being equal"

	public boolean equals(ClassName objectName)
	
◦ (Note that you should not use == to compare two objects!)
• The purpose of the toString() method is to return a String value
that represents the data in the object

	public String toString()


