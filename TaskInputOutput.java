package package4;
import java.util.Scanner;


public class TaskInputOutput {

	//Similar to importing Date Class in the 
	//Previous DateApp exercise, lets import

	//Import System class for input output

	
	//Declare variable
	public String name;
	public int age;
	public String currentRole;
	
	public int num1;
	public int num2;
	
	public static void main(String args[]) {
		//Create an object of the Scanner class
		Scanner input = new Scanner(System.in);
		TaskInputOutput obj = new TaskInputOutput();
		//Ask user for input name
		System.out.println("Enter your name:");
		//Read input from user
		obj.name = input.nextLine();
		
		//Ask user for current role in the Lab
		//Enter navigator or driver
		System.out.println("What is your role in this lab? Nav. or Driver?:");
		obj.currentRole = input.nextLine();
		
		//Ask user for input age
		System.out.println("Your age please:");
		//Read user input
		obj.age = input.nextInt();
		
		System.out.println("Num1:");
		//Read user input
		obj.num1 = input.nextInt();
		
		System.out.println("Num2:");
		//Read user input
		obj.num2 = input.nextInt();
		
		System.out.println("Multiplication: " +obj.num1*obj.num2);
		
		System.out.println("Sum: " +(obj.num1+obj.num2));

		//Close the input stream
		input.close();
		
		//Output to user
		System.out.println("Name:" +obj.name);
		System.out.println("Age:" +obj.age);
		System.out.println("Lab Role:" +obj.currentRole);
		//System.out.println ("/* I love */ Java!");
		
	}
	
}
