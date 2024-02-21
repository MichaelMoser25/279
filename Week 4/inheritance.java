package prac;


public class pack {

	//INHERITANCE
	
	/** 
	Imagine you are working for the federal government and you are asked
	to develop record-keeping software to host employees’ information:
		Employee.java
		HourlyEmployee.java
		SalariedEmployee.java
		
	Instead of defining:
		public class HourlyEmployee {}
		
	define:
		public class HourlyEmployee extends Employee{}
	 */
	
	// The derived class does not inherit any private methods
	
	// Any methods or variables that are added to the derived class, are not
	// accessible from the base class
	
	//--------CHECK WEEK 4 SHOW 2 SLIDE 10 EXAMPKE
	
	// A derived class is also called a subclass (or a parent class)
	// A base class is also called a superclass (or a child class)
	
	// These relationships are often extended such that a class that is a parent of a
	//	parent . . . of another class is called an ancestor class
	//		◦ If class A is an ancestor of class C, then class C can be called a descendent
	//		of class A

	
	// THE super constructor
	
	//A derived class uses a constructor from the base class to initialize all the data
	//inherited from the base class
	//	◦ In order to invoke a constructor from the base class, it uses a special syntax:
	
	public derivedClass(int p1, int p2, double p3){
		super(p1, p2);
		this.p3 = p3;
	}
	//	◦ In the above, super(p1, p2)is a call to the base class constructor
	
	// EXAMPLE SHOW 2 SLIDE 15 WEEK 4
	
	/**
	• A call to the base class constructor should not use the name of the base class,
	but use the keyword super instead.
	• A call to super must always be the first action taken in a constructor
	definition
	*/

	public HourlyEmployee() {
		this("No name", new Date(), 0, 0);
	}
	
	//• The above constructor will cause the constructor with the following
	//heading to be invoked:
	
	public HourlyEmployee(String theName, Date theDate, double theWageRate, double theHours)

	/**
	 • In Java, every class is a descendent of the class Object
	◦ Every class therefore has Object as its ancestor
	• If a class is not explicitly a derived class of another class, it is still automatically a
	descendant class of the class Object
	• The class Object is in the package java.lang which is always imported automatically
	 */
	
	
	// METHODS IN INHERITANCE
	
	
	
	// defining a derived class
	public class HourlyEmployee extends Employee{}
	
	// HourlyEmployee is a derived class of Employee
	
	//-----EXAMPLE SHOW 3 SLIDE 7 (OVERLOADING)
	
	//-----EXAMPLE SHOW 3 SLIDE 12 (OVERRIDING)
	
	// Overriding vs overloading
	/**
	 • When a method is overridden, the new method definition given in the
	derived class has the exact same signature (i.e. method name, and number
	and types and order of parameters) as in the base class
	• When a method in a derived class has a different signature from the method
	in the base class, then that method is overloaded
	◦ Note that when the derived class overloads the original (base class)
	method, it still inherits the original method from the base class as well
	 */

	
	
	// Covariant Return Type
	/**
	1. the return types are class types, and
	2. the return type of the overriding method in the derived class is a descendent
	class of the return type of the overridden method in the base/ancestor class
		◦ this is known as a covariant return type
	 */
	
	class ShapeFactory {
		public Shape newShape() {return new Shape();}
	}
	class CircleFactory extends ShapeFactory {
		public Circle newShape() {return new Circle();}
	}
	
	/**
	• Note that this is legal if
	◦ CircleFactory is a decedent class of ShapeFactory (which is true), and,
	◦ Circle is a descendent class of Shape.
	*/
	
	// Given the following method header in a base class:
		private void doSomething()
	//The following method header is valid in a derived class:
		public void doSomething()
	
		
	// ----Not allowed
	// Given the following method header in a base class:
		public void doSomething()
	// The following method header is not valid in a derived class:
		private void doSomething()
		
	//EXAMPLE SLIDE 19 SHOW 3 WEEK 4
	
		
	// Instance Variables in inheritance
	
		
	//EXAMPLE SLIDE 27 SHOW 3 WEEK 4

		
	/**
	 • Why aren’t private instance variables of base classes accessible in derived
	classes?
	◦ If private instance variables of a base class were accessible in method
	definitions of a derived class, then anytime someone wants to access a
	private instance variable, they would only need to create a derived class,
	and then access it in a method of that new derived class
	◦ This would allow private instance variables to be changed by mistake or in
	inappropriate ways
	◦ The behavior of the originally defined base class would therefore not be
	obeyed, which is not good.
	 */
		

	// Copy class constructor
	public Date(Date aDate){
	month = aDate.month;
	day = aDate.day;
	year = aDate.year;

	}

	// Equals method for class employee (overriden version)
	public boolean equals(Object otherObject) {
		if(otherObject == null)
			return false;
		else if(getClass( ) != otherObject.getClass( ))
			return false;
		else {
			Employee otherEmployee = (Employee)otherObject;
			return (name.equals(otherEmployee.name) && hireDate.equals(otherEmployee.hireDate));
		}
	}

	// The results of any two such invocations can be compared with == or != to
	// determine whether or not they represent the exact same class
	(object1.getClass() == object2.getClass())
		
	
	
	
}
