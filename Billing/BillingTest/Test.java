import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.text.ParseException;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test{
    public static void main(String[] args){
       
        
       String couponCode = null;
       
       int num2 = 10;
       ArrayList<BKCoupons> BK15CouponList = new ArrayList<BKCoupons>(num2);
       for(int i = 0; i < num2; i++){
           BKCoupons c = new BKCoupons(couponCode, 15);
           BK15CouponList.add(c);
           StringBuilder strBuild = new StringBuilder();
           System.out.println(c.getBK15() + " " + strBuild.append(c.getBK15Discount()));
       }
       
       int num3 = 10;
       ArrayList<DDCoupons> DD15CouponList = new ArrayList<DDCoupons>(num3);
       for(int i = 0; i < num3; i++){
           DDCoupons c2 = new DDCoupons(couponCode,15);
           DD15CouponList.add(c2);
           StringBuilder strBuild = new StringBuilder();
           System.out.println(c2.getDD20() + " " + strBuild.append(c2.getDD20Discount()));
       }
    }
}


