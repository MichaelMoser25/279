package prac;

public class Scratch1 {
	private static int myID;
	
	public Scratch1() {
		
	}
	
	public Scratch1(int id) {
		myID = id;
	}
	public static void someStaticMethod(Scratch1 myObj) {
		myObj.someMethod(30033);
	}
	public void someMethod(int myID) {
		System.out.println("myId is: " + myID);
	}
	
	public static void main(String[] args) {
		System.out.println("Running Scratch1");
		Scratch1 s1 = new Scratch1(99);
		System.out.println("id = " + s1.myID);
		s1.someMethod(2002);
		someStaticMethod(s1);
	}
	
	
}
