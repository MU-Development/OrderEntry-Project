/**
 * Billing class provides an easy to use computation of a bill. The billing class also provides
 * a set tax rate at 6.625 % which can be changed by the user. 
 * 
 * @author mcohen 
 * @version 4
 */
import javax.swing.*;
import java.io.*;
import java.util.*;
public class Billing
{
    /**
     * Instance Variables
     */
    private String[][] billing2D;
    private double totalBill = 0;
    private double constantTax = 1.06625;
    private String[][] inventory2D = new String[100][3];
    private ArrayList<String> items = new ArrayList<String>();
    private ArrayList<String> qty = new ArrayList<String>();
    private String foodLoc = "";
    private double coupon = 0;
    private MenuData [] myMenu;
    private ComputeMethods remove;
    /**
     * Billing constructor
     * @param String 2d array
     */
    Billing(String [][] array1)
    {
       
        billing2D = array1;  
    }
    /**
     * Billing 2nd constructor used to keep inventory
     * @param String 2d array, and MenuData array
     */
    Billing(String [][] array1,  MenuData [] menu)
    {
      myMenu = menu;
      remove = new ComputeMethods(menu);
      billing2D = array1;
     
    }

    /**
     * Billing 3rd constructor used for coupons
     * @param String 2d array, MenuData array, string, string
     */
    Billing(String [][] array1,MenuData [] menu,double coup, String bkDDOrTB)
    {
      myMenu = menu;
      remove = new ComputeMethods(menu);
      coupon = coup;
      foodLoc = bkDDOrTB;
      billing2D = array1;
    }
   
    /**
     * SetTax sets the tax rate
     * @param double
     */
    public void setTax(double tax)
    {
        tax = tax*.01;
        tax = tax+1;
        constantTax = tax;
    }

    /**
     * SetTax overloaded method, takes in user input
     * 
     */
    public void setTax()
    {
        double tax = 0;
       do{ try{
       
        Scanner in = new Scanner(System.in);    
        System.out.println("What would you like the tax to be: ");
        tax = in.nextDouble();
        tax = tax*.01;
        tax = tax+1;
        
        constantTax = tax;
        }
       catch(InputMismatchException e){
        System.out.println("You have inputted an invalid number, please input a number >0 "+"\n");
        
        }
    }while(tax==0);
    }

    /**
     * ComputeBill computes the total of the bill and if a coupon is present will take the discount off
     * @return double
     */
    public double checkOut()
    {
        String price ="";
        
        String quantity ="";
        String name ="";
        for(int i=0; i<billing2D.length;i++)
        {
            price=billing2D[i][2]; 
            quantity=billing2D[i][1];
            name = billing2D[i][0];
            double holdPrice =  Double.parseDouble(price);
            double holdItems = Double.parseDouble(quantity);
            
            holdPrice = holdPrice*holdItems;
            totalBill = holdPrice + totalBill;
            
            if (myMenu != null)
            {
              remove.removeItem(name, quantity); // Removes the item from the inventory list depending on if myMenu is instantiated.
            }
            
        }
        /**
         * Coupon not functional 
         */
        if(coupon != 0)
        {
           
            Coupon myCoupon;
            if(foodLoc.equalsIgnoreCase("BK"))
            {
                myCoupon = new BKCoupons(coupon);
                totalBill=totalBill-myCoupon.price(); 
                
            }
            else if(foodLoc.equalsIgnoreCase("DD"))
            {
                myCoupon = new DDCoupons(coupon);
                totalBill=totalBill-myCoupon.price(); 
            }
            else
            {
               myCoupon = new TBCoupons(coupon);
               totalBill=totalBill-myCoupon.price(); 
               
            }

        }

        System.out.println("Bill before tax = $" +totalBill);
        return (totalBill);

    }
    /**
     * Getter for MenuData
     * @return MenuData array
     */
    public MenuData[] getMenu()
    {
        return (myMenu);
    }
    /**
     * ComputeSalesTax computes the sales tax with the bill
     * @return double
     */
    public double computeSalesTax()
    {
        totalBill = totalBill * constantTax;
        System.out.printf("The bill with tax is = $%.2f %n",totalBill); 
        return (totalBill);
    }

}