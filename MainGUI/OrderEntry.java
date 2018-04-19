
/**
 * Write a description of class C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class OrderEntry {
    private static String[][] ud;
    private static MenuData[] md;
    protected static final int sizeX = 500;
    protected static final int sizeY = 250;
    public static void main(String[] args)
    {
        LoadDataStoreFG userData = new LoadDataStoreFG();
        userData.sourceData();
        ud = userData.getUserData();

        MenuLoadData menuData = new MenuLoadData();
        menuData.sourceData();
        md = menuData.getMenu();
        
        OrderEntryUI OR = new OrderEntryUI("Welcome to the Order Entry Program!", ud, md);
        OR.setSize(sizeX, sizeY);
        OR.setVisible(true);

        //OrderEntryUI UI = new OrderEntryUI(Title);

    }
}

