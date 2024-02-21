package Sale;

public class AbstractClassDemo {
	
	public static void printEmployInfo(Employee employee) {
		System.out.println(employee);
	}
	
	public static void main(String[] args) {
		HourlyEmployee hEmployee = new HourlyEmployee();
//		Employee josh = new Employee();
//		Employee employee = hEmployee;
		
		printEmployInfo(hEmployee);
		
        HourlyEmployee joe = new HourlyEmployee("Joe",
                new Date("January", 1, 2004), 50.50, 160);
        HourlyEmployee jack = new HourlyEmployee("Jack",
                new Date("December", 15, 2003), 50.50, 160);
        
        Boolean isSame = joe.samePay(jack);
        System.out.println("The pay is the same is " + isSame );
	}
	
	
}
