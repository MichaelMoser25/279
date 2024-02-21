package InheretancePackage;

public class Student {
	
	private int number ;
	private String name ;
	
	public Student() 
	{
		System.out.println("Student break 99") ;
	}
	
	public Student(String name, int number) 
	{
		this.name = name ;
		this.number = number ;
		System.out.println("Student break 109") ;
	}
	
	public String getName() { return this.name ; }
	public int getNumber() { return(this.number) ; } 

}
