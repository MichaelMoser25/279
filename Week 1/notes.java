package package2;


public class Navigator {
	public static void main(String[] args) {
		
	}
}



public class BankAccount {
	
	private String owner;
	private int accountId;
	private double balance;
	private double interestRate;
	public void deposit (double amount) {}
	public void withdraw (double amount) {}
	private double computeInterest (double amount) { return 0.01;}
	public static void main(String[] args) {
		System.out.println("Hello World! \nHello Customer :) !");
		System.out.printf("This is my day %d",2);
		int smaller = Math.min(32, 46);
		
		// System and Math are objects
		// println("Hello World! \nHello Customer :) !"); ----method
		// min(32, 46); ----method
		
		
		// Initialize variables and assign values
		int year = 2017 + 1;
		float cash = 35.6f;
		double distance1 = 0.000589;
		double distance2 = 5.89e-4;
		char grade = 'A';
		boolean b = (year>2017);
		int number1=1, number2=3;
		number1 = (number2 = 4);
		number1 = number2 = 4;
	}
};


//◦ Each class definition must be in a file whose name is the same
//as the class name followed by .java
//◦ The class BankAccount must be in a file named
//BankAccount.java
//• Each class is compiled with the command javac followed by
//the name of the file in which the class resides
//javac BankAccount.java
//◦ The result is a byte-code program whose filename is the
//same as the class name followed by .class
//BankAccount.class




// Camel casing naming conventions




// Type Casting
double ans1 = 1/5; // be careful here
double ans2 = 1/(double)5;
double ans3 = (double)1/5;
double ans4 = (double)(1/5);


int n = 2;
int n1 = 2*(n++);
int n2 = 2*(++n);
int n3 = 2*(n--);
int n4 = 2*(--n);


BankAccount account1, account2;
// Class     Object   Object
