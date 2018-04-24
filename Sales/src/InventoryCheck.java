
public class InventoryCheck extends ComputeMethods {

	InventoryCheck(MenuData[] data) {
		smdata = data;
	}
	

	
	
	void CheckInv (String name, String size) {
		//sets the capacity for items
		//smdata is to be taken from erics filechooser to get the info for the food
		int Capacity= 30;
		double LowerLimit= .25;
		double UpperLimit= .75;
		
		//check the stock if its high or low on food
		if ( smdata[itemNumber].quantity < LowerLimit*Capacity) {
			System.out.print("Inventory is at Critical levels of stock below 25% Capacity");
		}
		
		if ( smdata[itemNumber].quantity > UpperLimit*Capacity) {
			System.out.print("Inventory is at nominal capacity at or above 75% Capacity");
			}
		
	}
	
	void addItem(String name, String size) {
		//adds items till the items reaches above the upperlimit
		int itemNumber = 0;
		for(int x = 0;smdata[itemNumber].quantity > UpperLimit*Capacity; x++ ) {
			if(name == smdata[x].name) {
				itemNumber = x;
			}
		}
		System.out.println("Added" + smdata[itemNumber].name + "to inventory" );
		smdata[itemNumber].quantity = smdata[itemNumber].quantity ++;
	}
	
	
	
	
	
}
