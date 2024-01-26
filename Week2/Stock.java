package package9;

public class Stock {
	private int day;
	private int month;
	private int year;
	
	private String name;
	private int[] values = new int[7];
	
	public Stock(){
		day = 1;
		month = 1;
		year = 1;
		name = "";
		for(int i = 0; i < 6; i++) {
			values[i] = 0;
		}
	}
		
	public Stock(int dayIn, int monthIn, int yearIn, String nameIn, int[] valIn) {
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
		
		// Value
		if (valIn.length != 7) {
			System.out.println("ERROR");
			valIn = new int[]{0, 0, 0, 0, 0, 0, 0};
		}

		if (valIn.length == 7 && !hasNegativeNumbers(valIn)) {
            // Set attributes
            day = dayIn;
            month = monthIn;
            year = yearIn;
            name = nameIn;
            for(int i = 0; i < 6; i++) {
    			values[i] = valIn[i];
    		}
        } else {
            System.out.println("Error: Invalid valIn. Using default values.");
            // Set default values
            day = dayIn;
            month = monthIn;
            year = yearIn;
            name = nameIn;
            valIn = new int[]{0, 0, 0, 0, 0, 0, 0};
        }
	}
		
	// Method to check if an array has negative numbers
    private boolean hasNegativeNumbers(int[] array) {
        for (int num : array) {
            if (num < 0) {
                return true;
            }
        }
        return false;
    }
	
    public String getName() {
		return name;
    }
    
    public int getValue(int ind) {
    	if(ind > 0 || ind > 7) {
    		System.out.println("ERROR");
    		return -1;
    	}
    	else {
    		return values[ind];
    	}
    }
    
    public void setName(String nameIn){
    	name = nameIn;
    }
    
	public void setValue(int val, int ind){
		if(val < 0 || ind < 0 || ind > 7) {
			System.out.println("ERROR");
		}
		
	}
	
	public void printStock() {
		System.out.println(name +"." +day +"." +month +"." +year);
		for(int i = 0; i<7; i++) {
			System.out.print(values[i]+",");
		}
	}
	
	public int getMean() {
		float mean = 0;
		int count = 0;
		for(int i = 0; i < 7; i++) {
			mean += values[i];
			count++;
		}
		return (int) (mean % count);
	}
	
}

