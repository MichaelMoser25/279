package package2;


public class Navigator {
	public static void main(String[] args) {
		// Java primative data types
		int year = 2018;
		double cash = 12.5;
		float score = 85.5f;
		char ch;
		
		// A class is a programmer-defined data type.
		
		// The value of an object of a class type variable can contain (encapsulate) 
		// multiple pieces of data, as well as actions called methods.
		
		// The class String  is a predefined class in Java that is used to store
		// and process strings:
		String greeting = "Hello";
		
		// Methods in the string class 
		
		// int length();
		// returns the length of the calling object (which is a string) as a value of type int
		
		String greeting1 = "Hello";
		greeting1.length();            // return 6
		
		// boolean equals(Other_String)
		//After program executes 
		String greeting2 = "Hello";
		greeting2.equals("Hello"); // returns true
		greeting2.equals("Good-Bye"); // returns false
		greeting2.equals("hello"); // returns false
		
		
		// boolean equalsIgnoreCase(Other_String) 
		// returns true if equal not considering upper and lower case letters
		//After program executes 
		String greeting3 = "mary";
		greeting2.equalsIgnoreCase("Mary"); // returns true
		
		// String toLowerCase()
		// Converts all upper case letters to lower case letters
		//After program executes 
		String greeting4 = "Hi mary";
		greeting4.toLowerCase(); // returns "hi mary"
		
		// String toUpperCase()
		// Converts all lower case letters to upper case letters
		//After program executes 
		String greeting5 = "Hi mary";
		greeting4.toUpperCase(); // returns "HI MARY"


		// String trim()
		// Returns string removing all extra spaces
		//After program executes 
		String pause = "     Hmmm     ";
		pause.trim(); // returns "Hmmm"
		
		// char chartAt(Position)
		// returns the character in the calling object string at the position
		// positions are counted 0,1,2
		//After program executes 
		String greeting6 = "Hello";
		greeting6.chartAt(0); // returns "H"
		greeting6.chartAt(1); // returns "e"
		
		
		// String substring(Start)
		// Returns the substring of the calling objects string starting from Start to end of object
		// positions are counted 0,1,2
		//After program executes 
		String sample = "AbcdeFG";
		sample.substring(2); // returns "cdeFG"
		
		// String substring(Start, End)
		// Returns the substring of the calling objects string starting from Start to End of object
		// positions are counted 0,1,2
		//After program executes 
		String sample1 = "AbcdeFG";
		sample1.substring(2, 5); // returns "cde"
		
		// int indexOf(A_string)
		// returns index of the string where it first occurs
		// positions are counted 0,1,2
		// if not present return -1
		//After program executes 
		String sample2 = "Hi Mary!";
		sample2.indexOf("Mary"); // returns 3
		sample2.indexOf("Sally"); // returns -1 (string is not found
		
		// int indexOf(A_string, Start)
		// Returns first occurance of string after or at position of Start
		// positions are counted 0,1,2
		// if not present return -1
		//After program executes 
		String name = "Mary, Mary quite contrary";
		name.indexOf("Mary", 1); // returns 6
		// would return same value if Start is 1-5^
		name.indexOf("Mary", 0); // returns 0
		name.indexOf("Mary", 8); // returns -1
		
		// int lastIndexOf(A_String)
		// returns index of last occurance of string
		// positions are counted 0,1,2
		//After program executes 
		String sample3 = "AbcdeFG";
		sample3.lastIndexOf("Mary"); // returns 12

		
		// Escape Sequences
		// A backslash (\) immediately preceding a character (i.e., without any
		// space) denotes an escape sequence or an escape character
		
		\" Double quote
		\' Single quote
		\\ Backslash
		\n new line. Go to begining of the next line.
		\r Carriage reuturn. Go to beginning of current line
		\t Tab. White space up to the next tab stop
		
		
		
		
		// Concatinating strings 
		String greeting = "Hello";
		String java = "Class";
		String total = greeting + java; // equals to "Hello Class"
		
		"The answer is " + 42;
		// returns "The answer is 42"
		
		
		// Flow of control
		// refers to branching and looping mechanisms
		// Java has several branching mechanisms: if, if-ekse, and switch statements
		// Java has three types of loop statements: the while, do-while, and for statements
		
		// Branching with an if-else Statement
		// if-else statement:
		if (Boolean_Expression)
			Yes_Statement
		else
			No_Statement
			
		// IF Boolean_Expression is true Yes_Statement is executed
		
			
		if (myScore > your Score)
			System.out.println("I Win!");
		else
			System.out.println("You Win");
		
		// if-else statement
		if (myScore > yourScore) {
			System.out.println("I Win");
			wager = wager + 100;
	
		}
		else {
			System.out.println("You Win");
			wager = 0;
		}
		
		
		
		
		// Nested Statements
		if (Boolean_Expression)
			Statement_1
		else if (Boolean_Expression){
			if (Boolean_Expression)
				Statement_2_1
			else
				Statement_2_2
		}
		else if (Boolean_Expression_n)
			Statement_n
		else
			Statement_For_All_Other_Possibilities
			
			
		// Multiway if-else statement
		if (rawScore > 90)
			Statement_1
		else if (rawScore > 80)
			Statement_2
		else if (rawScore > 70)
			Statement_3
		else if (rawScore > 60)
			Statement_4
		else
			Other_Statement
			
		// The multiway if-else statement is simply a normal if-else statement
	    // that nests another if-else statement at every else branch
		
		// Switch statement implements multiway branching
			// When a switch statement is evaluated, one of a number of different branches is executed
			// The controlling expression must evaluate to a char, int, short, or byte

		
		switch (Controlling_Expression) {
			case Case_Label_1:
				Statement_Sequence_1
				break;
			case Case_Label_2:
				Statement_Sequence_2
				break;
			case Case_Label_n:
				Statement_Sequence_n
				break;
			default:
				Default_Statement Sequence
				break;
		}
		
		
		
		Example
		int vehicleClass;
		double toll;
		
		switch(vehicleClass) {
			case 1:
				System.out.println("Passenger car.");
				toll = 0.50;
				break;
			case 2:
				System.out.println("Bus");
				toll = 1.50;
				break;
			case 3:
				System.out.println("Trunk");
				toll = 2.00;
				break;
			defult:
				System.out.println("Unknown vehicle class");
				break;
			
		}
		
		// Conditional Operator
		max = (n1 > n2) ? n1 : n2;
		
		if(n1 > n2)
			max = n1;
		else
			max = n2;
		
		// Loops
		 -> while
		 -> do-while
		 -> for
		 
		 while (Boolean_Expression) {
			 Statement_1
			 Statement_2
			 
			 
			 Statement_Last
		 }
		
		 // Loops and executes until statement is false
		 do
			 Statement
		 while (Boolean_Expression);
		 
		 
		 do {
			 Statement_1
			 Statement_2
			 
			 Statement_Last
		 } while (Boolean_Expression);
		 
		 
		 if (Boolean condition) {
			 do {
				 Statements;
			 } while (Boolean condition);
		 }
		 
		 
		 sum = 0;
		 for(int n = 1; n <= 10; n++) {
			 sum = sum + n;
		 }
				 
		
		
		
		// Nested Loops
		int rowNum, columnNum;
		for (rowNum = 1; rowNum <= 3; rowNum++) {
			for (columnNum = 1; columnNum <= 2; columnNum++) {
				System.out.print(" row " + rowNum + " column " + columnNum);
			}
			System.out.println();
	
		}
		
		System.exit(0); // Exits the program
			
	}
}
