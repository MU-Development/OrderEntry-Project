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
public class DDCoupons extends Coupon{
    private double discount;
    public DDCoupons(String couponCode, double discount){
        super(couponCode);
        this.discount = discount;
    }
    public void setDD15(String couponCode, double discount){
        this.couponCode = couponCode;
        this.discount = discount;
    }
    public String getDD15(){
        return "dd15-" + getCouponCode();
    }
    public Double getDD15Discount(){
        discount = 15/100;
        return price * discount;
    }
    public void setDD20(String couponCode, double discount){
        this.couponCode = couponCode;
    }
    public String getDD20(){
        return "dd20-" + getCouponCode();
    }
    public Double getDD20Discount(){
        discount = 20/100;
        return price * discount;
    }
    public void setDD30(String couponCode, double discount){
        this.couponCode = couponCode;
    }
    public String getDD30(){
        return "dd30-" + getCouponCode();
    }
    public Double getDD30Discount(){
        discount = 30/100;
        return price * discount;
    }
    @Override
    public double price(){
        if(Boolean.parseBoolean(getDD15())){
            price = price - getDD15Discount();
        } else if(Boolean.parseBoolean(getDD20())){
            price = price - getDD20Discount();
        } else if(Boolean.parseBoolean(getDD30())){
            price = price - getDD30Discount();
        }
        return price;
    }
}
