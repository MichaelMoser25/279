package InheretancePackage;

public class Example {
	
	public static void main(String[] args)
	{
		System.out.println("running Example ...") ;
		
		UndergradStudent david = new UndergradStudent("David", 43466789) ;
//		System.out.println(
//				"My number and name are: " + david.number + ", " + david.name ) ;
		System.out.println(
		"My number and name are: " + david.getNumber() + ", " + david.getName() ) ;
	}

}
