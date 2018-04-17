
public class ComputeMethods {
	private MenuData[] smdata;
	
	ComputeMethods(MenuData[] data){
			smdata = data;
		}
	
	double computeNamePrice(String name, String size) {
		int itemNumber = 0;
		double price = 0;
		for(int x = 0; x < smdata.length; x++ ) {
			if(name == smdata[x].Name) {
				itemNumber = x;
			}
		}
		System.out.println(smdata[itemNumber].Name);
		if(size == "small") {
		System.out.println("$" + smdata[itemNumber].small);
		price = (int) smdata[itemNumber].small;
		}else if(size == "medium") {
		System.out.println("$" + smdata[itemNumber].medium);	
		price = (int) smdata[itemNumber].medium;
		}else {
		System.out.println("$" + smdata[itemNumber].large);	
		price = (int) smdata[itemNumber].large;
		}
		return price;
	}
	
	void addItem(String name, String size) {
		int itemNumber = 0;
		for(int x = 0; x < smdata.length; x++ ) {
			if(name == smdata[x].Name) {
				itemNumber = x;
			}
		}
		smdata[itemNumber].quantity = smdata[itemNumber].quantity ++;
	}
	
	void removeItem(String name, String size) {
		int itemNumber = 0;
		for(int x = 0; x < smdata.length; x++ ) {
			if(name == smdata[x].Name) {
				itemNumber = x;
			}
		}
		smdata[itemNumber].quantity = smdata[itemNumber].quantity --;
	}
}