package package5;

import java.util.Scanner;


public class WorkHourApp {
	
	public int hours;
	public int numdays;
	
	public static void main(String args[]) {
		try (//Create an object of the Scanner class
		Scanner input = new Scanner(System.in)) {
			WorkHourApp obj = new WorkHourApp();
					
			System.out.println("Hours?:");
			obj.hours = input.nextInt();
			
			System.out.println("Days?:");
			obj.numdays = input.nextInt();
			
			for(int count = 1; count < obj.numdays; count++) {
				System.out.println("Worked: Day " +count +" " +count*obj.hours +" hours");
			}
		}
	}
}
