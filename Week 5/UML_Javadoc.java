package week5Package;

public class Jacket {
	
	//Unified Modelling Language Programming Errors Javadoc

	• For OOP, Unified Modeling Language (UML) is a graphical representation
	formalism designed to reflect the OOP philosophy
	◦ UML is a graphical language used for designing and documenting OOP
	software

	// doesnt require al members of class indicate more with 3 dots on bottom

	// Inheritance diagram
	• An inheritance diagram shows the relationship between a base class and its
	derived class(es)
	◦ Normally, only as much of the class diagram is shown as is needed
	• Each base class is drawn above its derived class(es)
	◦ An upward pointing arrow is drawn between them to indicate the
	inheritance relationship


	// Javadoc
	• However, Java has a program called javadoc that automatically extracts the
	interface from a class definition and produces documentation
	◦ This information is presented in HTML format, and can be viewed with a
	Web browser
	◦ If a class is correctly commented, a programmer needs only refer to this
	API (Application Programming Interface) documentation in order to use the
	class
	◦ javadoc can obtain documentation for anything from a single class to an
	entire package



	• To extract a comment, the following must be true:
	1. The comment must immediately precede a class, variable, or method
	definition
	2. The comment must be a block comment, and the opening /* must
	contain an extra * ( /** . . . */ )
	◦ Note: Extra options would have to be set in order to extract line
	comments ( // ) and private items

	• In addition to any general information, the comment preceding a public
	method definition should include descriptions of parameters, any value
	returned, and any exceptions that might be thrown
	◦ This type of information is preceded by the @ symbol and is called an @
	tag
	◦ @ tags come after any general comment, and each one is on a line by
	itself
	
		/**
			General Comments about the method . . .
			@param aParameter Description of aParameter
			@return What is returned
			. . .
		*/

			
	// @ Tags
	• @ tags should be placed in the order found below
	• If there are multiple parameters, each should have its own @param on a separate
	line, and each should be listed according to its left-to-right order on the parameter list
	• If there are multiple authors, each should have its own @author on a separate line:
		
		@param Parameter_Name Parameter_Description
		@return Description_Of_Value_Returned
		@throws Exception_Type Explanation
		@deprecated
		@see Package_Name.Class_Name
		@author Author
		@version Version_Information

	• To run Javadoc in Eclipse, you can click the following menu items:
	◦ Project->Generate Javadoc...
	◦ Then select your options (often you can use the default options)
	◦ Then click finish
		


	• In command line, to run javadoc on a package, give the following command:
		javadoc –d Documentation_Directory Package_Name
	
	◦ The HTML documents produced will be placed in the folder:
		Documentation_Directory
	
	◦ If the –d and Documentation_Directory are omitted, javadoc will create suitable directories for the documentation


	• To run javadoc on a single class, give the following command from the
	directory containing the class file:
		
		javadoc ClassName.java
	
	• To run javadoc on all the classes in a directory, give the following command
	instead:
		
		javadoc *.java


	// Programming errors
	• Syntax Errors
		◦ Detected by the compiler
	• Runtime Errors
		◦ Causes the program to abort
	• Logic Errors
		◦ Produces incorrect result

}
