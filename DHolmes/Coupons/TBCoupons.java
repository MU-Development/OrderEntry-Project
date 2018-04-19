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
public class TBCoupons extends Coupon{
    private double discount;
    public TBCoupons(String couponCode, double discount){
        super(couponCode);
        this.discount = discount;
    }
    public void setTB15(String couponCode, double discount){
        this.couponCode = couponCode;
        this.discount = discount;
    }
    public String getTB15(){
        return "tb15-" + getCouponCode();
    }
    public Double getTB15Discount(){
        discount = 15/100;
        return price * discount;
    }
    public void setTB20(String couponCode, double discount){
        this.couponCode = couponCode;
    }
    public String getTB20(){
        return "tb20-" + getCouponCode();
    }
    public Double getTB20Discount(){
        discount = 20/100;
        return price * discount;
    }
    public void setTB30(String couponCode, double discount){
        this.couponCode = couponCode;
    }
    public String getTB30(){
        return "tb30-" + getCouponCode();
    }
    public Double getTB30Discount(){
        discount = 30/100;
        return price * discount;
    }
    @Override
    public double price(){
        if(Boolean.parseBoolean(getTB15())){
            price = price - getTB15Discount();
        } else if(Boolean.parseBoolean(getTB20())){
            price = price - getTB20Discount();
        } else if(Boolean.parseBoolean(getTB30())){
            price = price - getTB30Discount();
        }
        return price;
    }
}
