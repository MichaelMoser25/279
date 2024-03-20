package exceptionPackage;

public class simpleExceptionDemo {
	
	public static void main(String argv[])
	{
		System.out.println("main running ...") ;

		int i=10 ;
		int j=0 ;
		float k=0 ;
		
		try {
			k = i/(float) j ;
			System.out.println("break try: " + k) ;
		}
		
//		catch (Exception e)
//		{
//			System.out.println("break catch 2") ;
//		
//		}
		
		catch (ArithmeticException e)
		{
			System.out.println("break catch 1") ;
		}

		finally
		{
			System.out.println("break finally") ;
		}
		
		System.out.println("end of main") ;

	}

}
