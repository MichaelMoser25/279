package week5Package;

public class Button {
	
	public int number ;
	public String color ;
	
	public Button() 
	{
		number = 0 ;
		color = "" ;
	}
	
	public Button(int number, String color)
	{
		this.number = number ;
		this.color = color ;
	}
	
	public Button(Button b)
	{
		number = b.number ;
		color = b.color ;
	}
	
	public String toString()
	{
		String s = number + " : " + color ;
		return(s) ;
	}

}
