package week5Package;

public class Jacket {
	
	public String color ;
	public String material ;
	public Button buttons ;
	
	public Jacket()
	{
		color = "" ;
		material = "" ;
		buttons = null ;
	}
	
	public Jacket(String color, String m, Button b)
	{
		this.color = color ;
		material = m ;
		buttons = b ;
	}
	
	public Jacket(Jacket j)
	{
		color = j.color ;
		material = j.material ;
//		buttons = j.buttons ; // shallow copy - bad !
		buttons = new Button(j.buttons) ; // deep copy - good !
	}
	
	public String toString()
	{
		String s = "color:" + color + ", " 
					+ "material:" + material 
					+ ", with " + buttons + " buttons";
		return(s) ;
	} 

	public static void main(String args[])
	{
		System.out.println("running Jacket main ...") ;
		
		Button b = new Button(17, "gold") ;
		Jacket j1 = new Jacket("purple", "leather", b) ;
		
		System.out.println("jacket 1 = " + j1) ;
		
		Jacket j2 = new Jacket(j1) ;
		j2.buttons.number = 34 ;
		System.out.println("jacket 2 = " + j2) ;
		
		System.out.println("jacket 1 = " + j1) ;

	}
	

}
