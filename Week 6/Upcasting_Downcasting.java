package week5Package;

public class Jacket {
	// Upcasting & downcasting
	• Binding: The process of associating a method definition with a method
	invocation is called binding
	• Early binding: If the method definition is associated with its invocation when
	the code is compiled, that is called early binding
	• Late binding: If the method definition is associated with its invocation when
	the method is invoked (at run time), that is called late binding or dynamic
	binding
	• Late binding
	◦ The Sale and DiscountSale classes
	◦ The toString example


	// Early (static) Binding
	• Unlike late binding, if the decision of “when invoking a method, which definition
	of the overridden methods to use?” is made at compiling time, that is called
	early/static binding
	• Java uses early/static binding with private, final, and static methods
	◦ In the case of private and final methods, late binding would serve no
	purpose
	• Show a demo if we change the bill method in Sale to be private; then if I run
	LateBindingDemo, which bill method the LessThan method will call
	(the bill method in Sale or that in DiscountSale)?
	◦ Show another demo for static methods.
		Show EarlyBindingDemo
	
	// No late binding for static methods
	• The Sale class announcement() method:
		public static void announcement( )
		{
		System.out.println("Sale class");
		}
	• The DiscountSale class announcement() method:
		public static void announcement( )
		{
		System.out.println("DiscountSale class");
		}
	• In the demo, we can see that advertisementB() only calls
	announcement() defined in the Sale class, but not the one in the
	DiscountSale class.


	// Upcasting
	• Upcasting happens when an object of a derived class is assigned to a variable of a
	base class (or any ancestor class):

		DiscountSale discountItem = new DiscountSale("paint",15,10); //Derived class
		Sale simpleItem = discountItem; // Upcasting!

	• This also happens implicitly in the equals example we talked earlier,
	when the following code:
		anEmployee.equals(anHourlyEmployee)

	invokes the following method defined in Employee:
		public void equals(Object aLocalVariable){ ... }

	it creates a local variable aLocalVariable with upcasting:
		Object aLocalVariable = anHourlyEmployee;
		
	// Downcasting
	• Downcasting is when a type cast is performed from a base class (or any ancestor
	class) to a derived class
		Sale simple = new Sale();
		discount = (DiscountSale)simple;

	• Downcasting should be done very carefully!
	◦ In many cases it doesnt make sense


	• There are times, however, downcasting is necessary: Remember the equals
	method defined in Employee, where we can safely downcast otherObject (of
	a type Object) to otherEmployee (of a type Employee)
		public boolean equals(Object otherObject){
			...
			else if(getClass( ) != otherObject.getClass( ))
			return false;
			else{
			Employee otherEmployee = (Employee)otherObject;
			...
	• We can safely downcast here, because the getClass()line above can confirm
	otherObject was originally created (using the new operator) as a type of
	Employee, although otherObject has just been upcasted to Object.
	
	• Show UpDownCastingDemo
	• If a variable is upcasted from DiscountSale to Sale, for overridden static
	methods, the version in the Sale will be invoked (even if that method is overridden
	in DiscountSale).
	• If a variable is upcasted from DiscountSale to Sale, for late-binding methods,
	the version in DiscountSale will be still be invoked.
	◦ We have just seen an example.
	◦ See additional examples in LateBindingDemo about println.

}
