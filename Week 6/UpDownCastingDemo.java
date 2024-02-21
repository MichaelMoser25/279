package Sale;


public class UpDownCastingDemo {
    public static void main(String[] args)
    {
        Sale saleItem = new Sale("floor mat", 10.00);//One item at $10.00.
        DiscountSale discountItem = new DiscountSale("floor mat", 11.00, 10);
    
        //up-casting
        Sale upCastedSaleItem = discountItem;

        //down-casting
        //Be very careful
//        DiscountSale downCastedItem = (DiscountSale) saleItem;

        //down-casting
        //be careful: legal (no compilation errors) 
        //but may lead to run-time errors
        //programmer himself/herself takes the responsibility
        //to ensure it makes sense
//        if(upCastedSaleItem instanceof DiscountSale) {
//        	DiscountSale upThenDown = (DiscountSale) upCastedSaleItem;
//        }
        
        //upcasting and late binding
        //Sale simple1 = discount;
        String str = upCastedSaleItem.toString();
        System.out.println("break 1: " + str);
                
        upCastedSaleItem.announcement();
        discountItem.announcement();
        
        DiscountSale downUpSale = (DiscountSale) upCastedSaleItem ;
        downUpSale.announcement() ;
        
        DiscountSale altRealityDiscountSaleItem = (DiscountSale) saleItem ;
//        altRealityDiscountSaleItem.onlyForDiscount();
        
        
//
//        System.out.println(upCastedSaleItem);
//        
//        int test = 1;
    }
}
