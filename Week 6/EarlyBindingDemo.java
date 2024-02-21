package Sale;

public class EarlyBindingDemo {

	public static void main(String[] args) {
        // The following code shows that you can override a static method definition
		Sale.announcement();
		DiscountSale.announcement();
		System.out.println("That showed that you can override a static method definition.");

        // The following code shows that invocation of static method uses early binding
		Sale simple4 = new Sale("floor mat", 10.00);
		DiscountSale discount4 = new DiscountSale("floor mat", 11.00, 10);
		simple4.showAdvertisementB();
		discount4.showAdvertisementB();
	}
}
