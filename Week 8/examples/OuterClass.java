package InnerClasses;

public class OuterClass {
	
	public class InnerClass
	{
		int myNumber ;
		String myString ;
		
		public InnerClass() 
		{
			myNumber = 15 ;
			myString = "Thequickbrownfox" ;
		}
		
		public void iMethod1()
		{
			System.out.println("running Inner Class iMethod1() ...") ;
			oMethod1() ;
		}

	}
	
	public class InnerClass2 extends InnerClass
	{
		
	}
	
	int myNumber ;
	String myString ;
	InnerClass inner ;
	
	public OuterClass() 
	{
		myNumber = 76 ;
		myString = "jumpsoverthelazydog" ;
		inner = new InnerClass() ;
		
	}
	
	public void oMethod1()
	{
		System.out.println("running Outer Class oMethod1() ...") ;
	}

	
	public static void main(String argv[])
	{
		System.out.println("running Outer Class demo ...") ;
		
		OuterClass outer = new OuterClass() ;
		
		System.out.println(outer.inner.myNumber + ", " + outer.inner.myString) ;
		System.out.println(outer.myNumber + ", " + outer.myString) ;
		
		outer.oMethod1();
		outer.inner.iMethod1();

	}

}
