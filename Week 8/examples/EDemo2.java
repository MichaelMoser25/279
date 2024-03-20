package exceptionPackage;

public class EDemo2 {
	
	EDemo2() {}
	
	public void method1() // throws Exception
	{
		try 
		{
			System.out.println("try 1") ;
			throw new Exception() ;
//			System.out.println("try 2") ;
		}
		catch (Exception e)
		{
			System.out.println("catch 1") ;
		}
		finally 
		{
			System.out.println("finally 1") ;
		}
	}
	
	public void method2() throws Exception
	{
		System.out.println("break 2") ;
		throw new Exception() ;
	}
	
	public void method3() // throws Exception
	{
		method2() ;
	}
	
	public void method4()
	{
		try
		{
			method3() ;
		}
		catch (Exception e)
		{
			System.out.println("catch 3") ;
		}
		finally 
		{
			System.out.println("finally 3") ;
		}
	}
	
	
	public static void main(String argv[])
	{
		EDemo2 eDemo = new EDemo2() ;
		
		eDemo.method4();
	}

}
