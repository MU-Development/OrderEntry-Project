import java.io.*;
import java.util.*;
/**
 * Write a description of class Coupon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Coupon{
    protected String couponCode;
    protected String userCouponCode;
    protected double price;
    public static final String ranString = "abcdefghijklmnopqrtuvwxyxABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*+=";
    private static final int stringLength = 8;
    public static final String EMPTY_couponCode = null;
    public Coupon(){
        this.couponCode = randString();
    }
    public abstract double price();
    private String randString(){
        StringBuffer sbuff = new StringBuffer();
        for(int i = 0; i < stringLength; i++){
            int num = randNum();
            char charVar = ranString.charAt(num);
            sbuff.append(charVar);
        }
        return sbuff.toString();
    }
    private int randNum(){
        int randomNumber = 0;
        Random rn = new Random();    
        randomNumber = rn.nextInt(ranString.length());
        if(randomNumber - 1 == -1){
            return randomNumber;
        } else {
            return randomNumber - 1;
        }
    }
    public void setCouponCode(String couponCode){
        this.couponCode = couponCode;
    }
    public String getCouponCode(){
        return couponCode;
    }
}
