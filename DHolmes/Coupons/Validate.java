import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Calendar;
/**
 * Write a description of class Validate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Validate extends Coupon{
    public Validate(String couponCode){
        super(couponCode);
    }
    public boolean isBKValid(String couponCode){
       int num = 10;
       ArrayList<BKCoupons> BK15CouponList = new ArrayList<BKCoupons>(num);
        for(int i = 0; i < num; i++){
           BKCoupons c = new BKCoupons(couponCode, 15);
           BK15CouponList.add(c);
           StringBuilder strBuild = new StringBuilder();
           System.out.println(c.getBK15() + " " + strBuild.append(c.getBK15Discount()));
        }
       
       ArrayList<String> userInput = new ArrayList<String>();
        if(BK15CouponList.contains(couponCode)){

            return true;
            userInput.add(couponCode);
        } else {
            return false;
        }
       return true;
    }
    public double price(){
        return price;
    }
}

