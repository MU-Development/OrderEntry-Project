
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
		System.out.println("Added" + smdata[itemNumber].name + "to inventory" );
		smdata[itemNumber].quantity = smdata[itemNumber].quantity ++;
	}
	
	void removeItem(String name, String size) {
		int itemNumber = 0;
		for(int x = 0; x < smdata.length; x++ ) {
			if(name == smdata[x].name) {
				itemNumber = x;
			}
		}
		System.out.println("Removed" + smdata[itemNumber].name + "from inventory" );
		smdata[itemNumber].quantity = smdata[itemNumber].quantity --;
	}
	
	MenuData[] getInventory() {
		return smdata;
	}
}