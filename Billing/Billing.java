
/**
 * Billing class provides an easy to use computation of a bill. The billing class also provides
 * a set tax rate at 6.625 % which can be changed by the user. 
 * 
 * @author mcohen 
 * @version SP18
 */
import java.util.*;
public class Billing
{
    private String[][] billing2D = new String[100][100];
    private double totalBill = 0;

    private double constantTax = 1.06625;
    private String[][] inventory2D = new String[100][100];
    private ArrayList<String> items = new ArrayList<String>();
    private ArrayList<String> qty = new ArrayList<String>();
    private String foodLoc = "";
    private String coupon = "";
    /**
     * Billing constructor
     * @param String 2d array
     */
    Billing(String [][] array1)
    {
        billing2D = array1;
    }

    /**
     * Billing 2nd constructor used for coupons
     * @param String 2d array, string, string
     */
    Billing(String [][] array1,String coup, String bkDDOrTB)
    {
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
        constantTax = tax;
    }

    /**
     * SetTax overloaded takes in user input
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
        System.out.println("You have inputted an invalid number, please input a number >0 "+"\n"+
        "tax rate should look like if 6% 1.06");
        
        }
    }while(tax==0);
    }

    /**
     * ComputeBill computes the total of the bill
     * @return double
     */
    public double checkOut()
    {
        String price ="";
        //ComputeMethods remove = new ComputeMethods();
        //.removeItem(string, int)

        String quantity ="";
        String name ="";
        for(int i=0; i<billing2D.length;i++)
        {
            price=billing2D[i][2]; 
            quantity=billing2D[i][1];
            name = billing2D[i][0];
            double holdPrice =  Double.parseDouble(price);
            double holdItems = Double.parseDouble(quantity);
            //remove.removeItem(name, quantity);
            holdPrice = holdPrice*holdItems;
            totalBill = holdPrice + totalBill;

        }
        if(coupon != null)
        {
            //Coupon myCoupon = new Coupon(coupon, totalBill)
            if(foodLoc.equalsIgnoreCase("BK"))
            {
                //myCoupon.
            }
            else if(foodLoc.equalsIgnoreCase("DD"))
            {
                //myCoupon.
            }
            else
            {
                //myCoupon.
            }

        }

        System.out.println("Bill before tax = $" +totalBill);
        return (totalBill);

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
