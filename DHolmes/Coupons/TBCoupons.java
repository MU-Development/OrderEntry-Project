
/**
 * Write a description of class TB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TBCoupons extends Coupon
{
  private double discount;
    public static final double THIRTY_PERCENT = 30;
    public static final double  TWENTY_PERCENT = 20;
    public static final double FIFTEEN_PERCENT = 15;
    public TBCoupons(double discount){
        this.discount = discount;
    }
    public void setDiscount(double discount) {
    	this.discount = discount;  
    }
    public double getDiscount(){
        return discount; 
    }
    @Override
    public double price(){
        //return price * (1 - discount);  //if discount is a decimal (e.g. .15
        return price * (1 - (discount/100.0)); //if discount is a whole number representing the percent discount.
    }
    public String toString(){
        int discountInt = (int) Math.round(discount);
        return "tb" + discountInt + "-" + getCouponCode();
    }
}
