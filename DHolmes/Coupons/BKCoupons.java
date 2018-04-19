import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Calendar;
/**
 * Write a description of class BKCoupons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BKCoupons extends Coupon{
    private double discount;
    public BKCoupons(String couponCode, double discount){
        super(couponCode);
        this.discount = discount;
    }
    public void setBK15(String couponCode, double discount){
        this.couponCode = couponCode;
        this.discount = discount;
    }
    public String getBK15(){
        return "bk15-" + getCouponCode();
    }
    public Double getBK15Discount(){
        discount = 15/100;
        return price * discount;
    }
    public void setBK20(String couponCode, double discount){
        this.couponCode = couponCode;
    }
    public String getBK20(){
        return "bk20-" + getCouponCode();
    }
    public Double getBK20Discount(){
        discount = 20/100;
        return price * discount;
    }
    public void setBK30(String couponCode, double discount){
        this.couponCode = couponCode;
    }
    public String getBK30(){
        return "bk30-" + getCouponCode();
    }
    public Double getBK30Discount(){
        discount = 30/100;
        return price * discount;
    }
    @Override
    public double price(){
        if(Boolean.parseBoolean(getBK15())){
            price = price - getBK15Discount();
        } else if(Boolean.parseBoolean(getBK20())){
            price = price - getBK20Discount();
        } else if(Boolean.parseBoolean(getBK30())){
            price = price - getBK30Discount();
        }
        return price;
    }
}
