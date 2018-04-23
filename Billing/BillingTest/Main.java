
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main (String [] args)
    {
        String [][] testBill = new String[3][3];
        testBill[0][0] = "Steak";
        testBill[0][1] = "2";
        testBill[0][2] ="4.50";
        testBill[1][0] = "Burger";
        testBill[1][1] = "1";
        testBill[1][2] ="4.04";
        testBill[2][0] = "Chicken";
        testBill[2][1] = "3";
        testBill[2][2] ="5.50";
        
        
       // MenuData[] myBD;
       // MenuLoadData myD = new MenuLoadData();
       // myD.sourceData();
        //myBD = myD.getMdata();
        //ComputeMethods cp = new ComputeMethods(myBD);
        
        
        Billing theBill = new Billing(testBill);
        theBill.setTax();
        theBill.checkOut();
        theBill.computeSalesTax();
    }
}
