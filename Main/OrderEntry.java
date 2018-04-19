/**
 * Order Entry Program
 * By: Java Class - Cool Kidz
 */

public class OrderEntry {

	private static String[][] ud;
	private static MenuData[] md;
	
	public static void main(String[] args)
	{

		LoadDataStoreFG userData = new LoadDataStoreFG();
		userData.sourceData();
		ud = userData.getUserData();
		
		MenuLoadData menuData = new MenuLoadData();
		menuData.sourceData();
		md = menuData.getMenu();
		
		//OrderEntryUI UI = new OrderEntryUI(Title);
				
	}
}
