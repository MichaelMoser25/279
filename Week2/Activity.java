package package9;

public class Activity {
	private int day;
	private int month;
	private int year;
	
	public Activity() {
		day = 1;
		month = 1;
		year = 1;
	}
	
	public Activity(int dayIn, int monthIn, int yearIn) {
		day = dayIn;
		month = monthIn;
		year = yearIn;
		setDate(dayIn, monthIn, yearIn);
	}
	
	public int getDay() {return day;}
	public int getMonth() {return month;}
	public int getYear() {return year;}

	public void setDate(int dayIn, int monthIn, int yearIn) {
		// TODO Auto-generated method stub
		//Day

		if (monthIn == 2 && dayIn>28) {
			System.out.println("ERROR");
		}

		else if (monthIn == 4 && dayIn>30) {
			System.out.println("ERROR");
		}

		else if (dayIn<0 || dayIn>31) {
			System.out.println("ERROR");
		}
		else day = dayIn;
		
		//Month
		if (monthIn<1 || monthIn>12) {
			System.out.println("ERROR");
		}
		else month = monthIn;
		
		//Year

		if (yearIn<0 || yearIn>2024) {
			System.out.println("ERROR");
		}
		else year = yearIn;
	}
	
	public void printDate() {
		System.out.println(day +"." +month +"." +year);
	}
	
	
}
