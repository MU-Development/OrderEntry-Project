import java.io.*;
import java.util.*;
import java.lang.Object.*;
import java.util.stream.Collectors;
import java.util.Arrays;
/**
 * Test class for coupon codes.
 *
 * @Daniel Holmes
 * @3/23/2018
 */
public class Test{
    static ArrayList<BKCoupons> BKCouponList = new ArrayList<BKCoupons>(10);
    static ArrayList<TBCoupons> TBCouponList = new ArrayList<TBCoupons>(10);
    static ArrayList<DDCoupons> DDCouponList = new ArrayList<DDCoupons>(10);
    public static void main(String[] args){
      UISetup uiset = new UISetup();
      String couponCode = null;
      int num2 = 1;
      for(int i = 0; i < num2; i++){
           BKCoupons c = new BKCoupons(BKCoupons.THIRTY_PERCENT);
           BKCoupons c1 = new BKCoupons(BKCoupons.TWENTY_PERCENT);
           BKCoupons c2 = new BKCoupons(BKCoupons.FIFTEEN_PERCENT);
           BKCouponList.add(c);
           BKCouponList.add(c1);
           BKCouponList.add(c2);
       }
      System.out.println(Arrays.toString(BKCouponList.toArray()));
      int num3 = 1;
      for(int i = 0; i < num3; i++){
           TBCoupons c = new TBCoupons(TBCoupons.THIRTY_PERCENT);
           TBCoupons c1 = new TBCoupons(TBCoupons.TWENTY_PERCENT);
           TBCoupons c2 = new TBCoupons(TBCoupons.FIFTEEN_PERCENT);
           TBCouponList.add(c);
           TBCouponList.add(c1);
           TBCouponList.add(c2);
       }
      System.out.println(Arrays.toString(TBCouponList.toArray()));
      int num4 = 1;
      for(int i = 0; i < num4; i++){
           DDCoupons c = new DDCoupons(DDCoupons.THIRTY_PERCENT);
           DDCoupons c1 = new DDCoupons(DDCoupons.TWENTY_PERCENT);
           DDCoupons c2 = new DDCoupons(DDCoupons.FIFTEEN_PERCENT);
           DDCouponList.add(c);
           DDCouponList.add(c1);
           DDCouponList.add(c2);
       }
      System.out.println(Arrays.toString(DDCouponList.toArray()));
    }
    public boolean isBKValid(String userCouponCode){
        System.out.println("user:"+userCouponCode);
        for (BKCoupons coupon :  BKCouponList) {
            System.out.println(coupon);
            if (coupon.toString().equals(userCouponCode)) {
                BKCouponList.remove(userCouponCode);
                return true;
            }
        }
        return false;
    }
    public boolean isTBValid(String userCouponCode){
        System.out.println("user:"+userCouponCode);
        for (TBCoupons coupon :  TBCouponList) {
            System.out.println(coupon);
            if (coupon.toString().equals(userCouponCode)) {
                TBCouponList.remove(userCouponCode);
                return true;
            }
        }
        return false;
    }
    public boolean isDDValid(String userCouponCode){
        System.out.println("user:"+userCouponCode);
        for (DDCoupons coupon :  DDCouponList) {
            System.out.println(coupon);
            if (coupon.toString().equals(userCouponCode)) {
                DDCouponList.remove(userCouponCode);
                return true;
            }
        }
        return false;
    }
}


