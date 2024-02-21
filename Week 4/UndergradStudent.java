package InheretancePackage;

public class UndergradStudent extends Student {
	
	public UndergradStudent() 
	{
		System.out.println("UndergradStudent break 10") ;
	}

	public UndergradStudent(String name, int number) 
	{
//		this.name = name ;
//		this.number = number ;
		super(name,number) ;
		System.out.println("UndergradStudent break 11") ;
	}
}
