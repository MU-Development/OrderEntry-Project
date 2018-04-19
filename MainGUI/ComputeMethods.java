
/**
 * Write a description of class ComputeMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComputeMethods {
    private MenuData[] smdata;

    ComputeMethods(MenuData[] data){
        smdata = data;
    }

    double computeNamePrice(String name, String size) {
        int itemNumber = 0;
        double price = 0;
        for(int x = 0; x < smdata.length; x++ ) {
            if(name == smdata[x].name) {
                itemNumber = x;
            }
        }
        price = smdata[itemNumber].cost;
        return price;
    }

    void addItem(String name, String size) {
        int itemNumber = 0;
        for(int x = 0; x < smdata.length; x++ ) {
            if(name == smdata[x].name) {
                itemNumber = x;
            }
        }
        smdata[itemNumber].quantity = smdata[itemNumber].quantity ++;
    }

    void removeItem(String name, String size) {
        int itemNumber = 0;
        for(int x = 0; x < smdata.length; x++ ) {
            if(name == smdata[x].name) {
                itemNumber = x;
            }
        }
        smdata[itemNumber].quantity = smdata[itemNumber].quantity --;
    }
}

