package week5Package;

public class Jacket {
	
	// Polymorphism & Early and Late Binding

	//Polymorphism
	• DiscountSale extends Sale
	• The base Sale class lessThan() method:

		public boolean lessThan (Sale otherSale)
		{
		...
		return (bill( ) < otherSale.bill( ));
		}

	• The base Sale class has a bill() method:
		public double bill( )
		{
		return price;
		}
	• The derived DiscountSale class also has a bill() method:""
		public double bill( )
		{
		double fraction = discount/100;
		return (1 - fraction) * getPrice( );
		}
		
	Sale simple = new Sale("floor mat", 10.00);
	DiscountSale discount = new
		DiscountSale("floor mat", 11.00, 10);
	. . .
	if (discount.lessThan(simple))
		System.out.println("$" + discount.bill() +
			" < " + "$" + simple.bill() +
			" because late-binding works!");
	. . .
	
	• An output could be:
		$9.90 < $10 because late-binding works!
		
	As the output indicates, when the lessThan method in the Sale class is
	executed, it knows which bill() method to invoke
	◦ The DiscountSale class bill() method for discount
	◦ The Sale class bill() method for simple
	• Note that when the Sale class was created and compiled, the DiscountSale
	class and its bill() method did not yet exist
	◦ Q/ If the DiscountSale class did not yet exist, then how did the Sale
	class know how to call a DiscountSale method?
	◦ Ans/ late-binding !
		

	• Binding:
		◦ The process of associating a method definition with a method invocation is
		called binding
	• Early binding:
		◦ If the method definition is associated with its invocation when the code is
	compiled, then it is called early binding
	• Late binding:
		◦ If the method definition is associated with its invocation when the method
		is invoked (i.e. at run time), then it is called late binding or dynamic binding

	• The terms polymorphism and late binding are essentially just different words
	for the same concept
	• Polymorphism allows changes to be made to method definitions in the derived
	classes, and have those changes apply to the software written for the base
	class
	• The bill() method has one head, and multiple bodies
		
	• If the decision of “which definition of the overridden methods to use?” is made
	at compile time, then that is called early/static binding
	• Java uses early/static binding with private, final, and static methods
	◦ In the case of private and final methods, late binding would serve no
	purpose

	Example: late binding with toString
	Run the following code in LateBindingDemo:
		
		Sale simple3 = new Sale("floor mat", 10.00);
		DiscountSale discount3 = new DiscountSale("floor mat", 11.00, 10);
		simple3.showAdvertisementA();
		discount3.showAdvertisementA();

	• As discussed earlier in the course, a static method can be invoked using
	class name directly (without creating a calling object):
		Sale.announcement();
		DiscountSale.announcement();
	The above code will call the announcement method defined in the
	corresponding class.
	• Note that a static method can also be invoked within the definition of a
	non-static method
	◦ We will have shown, early/static binding is used for static methods.
		
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
	
• In the EarlyBindingDemo program, we can see that advertisementB()
calls the announcement() method defined in the Sale class, but not the one in
the DiscountSale class.


}
