package myNewPackage;

public class David {
	
	public int myID ;
	
	public David() 
	{
		System.out.println("I'm David's constructor: " + myID) ;
	}
	
	public David(int myID) 
	{
		this.myID = myID ;
		myID = -1 ;
		System.out.println("I'm David's constructor: " + this.myID) ;
	}
	

	public static void main(String[] args)
	{
		System.out.println("I'm David and I'm running ...") ;
		
//		David dave1;
		David dave1 = new David() ;
		David dave2 = new David(99) ;
	}

}
