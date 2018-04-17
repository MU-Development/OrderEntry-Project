import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class MenuLoadData{
	private int datasize=-1;
	private BufferedReader buff = null;
	private FileReader fileRd = null;
	private String line = "test";
	private String loadfile=null;
	private StringTokenizer tok = null;
	private MenuData[] mdata;
	
	/**
	 * Getter method for MarketData
	 * @return
	 */
	MenuData[] getMenu(){
		return(mdata);
	}
	
	/**
	 * Getter method for Size of Data
	 * @return
	 */
	int getDataSize(){
		if (datasize < 0) {
			this.countLines();
		}
		return(datasize);
	}
	
	/**
	 * Setter method for Size of Data
	 */
	void setDataSize(int s){
		datasize = s;
	}
	
	
	/**
	 * A Integer that represents the size of the data file.
	 * Set the size using setter setDataSize.
	 */
	void countLines() {
		int counter = 0;
		
		try{ 
			BufferedReader Clines = new BufferedReader(new FileReader(loadfile));
			while ((line = Clines.readLine()) != null) {
				counter++;
			}
			Clines.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			}
		
		this.setDataSize(counter);
	}
	
	/**
	 * Helper method to print out the Array of Objects.
	 */
	
	void printArrayOfObjects(){
		for (int row=0; row < mdata.length; row++){
			System.out.println("Food: " + mdata[row].Name);
			System.out.println("  Small Combo: "+ mdata[row].small);	
			System.out.println("  Medium Combo: "+ mdata[row].medium);	
			System.out.println("  Large Combo: "+ mdata[row].large);	
		}
	}
	
	
	/*
	 * Method will read the data from a file, will split the structured data
	 * based off commas that represent the columns, than 
	 * load the data into a 2-dimension array.(Depreciated)
	 * 
	 * @param iparams are command line arguments array "args" 
	 */
	void sourceData() {
		
	 int arraySize=0;
	 int rowNum=0;
	  
	 //Used for Testing without having to change Eclipse.
	 //iparams[1] = null;
	 
	  FileChooser fc = new FileChooser();
	  loadfile = fc.selectFile(dfile);

	 
		
	 	arraySize = this.getDataSize();
		System.out.println("Items of Menu: "+ arraySize);
		mdata = new MenuData[arraySize];
		
		//Each element in the mdata references a MarketData class.
		//This loop is allocating storage to hold the variables.
		for(int x=0; x < mdata.length; x++){
			mdata[x] = new MenuData();
		}
		
	
	try{
		fileRd = new FileReader(loadfile);
		buff = new BufferedReader(fileRd);
	
		while ((line = buff.readLine()) != null) {
		
			//Need to separate the file based off commas. Using StringTokenizer
			tok = new StringTokenizer(line, ",");
			
				/* While Function has been Depreciated - Not using 2-Dimensional Array
				 * 
				 * while (tok.hasMoreElements()){
					for(int colNum=0;colNum<7;colNum++){
						stockData[rowNum][colNum] = tok.nextElement().toString();	
						}
						
					}
				 
				 */
				
				/*Double.parseDouble throws a NumberFormatException */
				mdata[rowNum].Name = tok.nextElement().toString();
				mdata[rowNum].small = Double.parseDouble(tok.nextElement().toString());	
				mdata[rowNum].medium = Double.parseDouble(tok.nextElement().toString());	
				mdata[rowNum].large = Double.parseDouble(tok.nextElement().toString());	
				rowNum++;
				
			}//While End Readline
		
	} catch (NumberFormatException nfe){
		System.out.println("There was a problem converting the String to a Double");
		nfe.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
			try{
				if (buff != null){
					//System.out.println("Closing buffer reader");
					buff.close();
				}
				if (fileRd != null){
					//System.out.println("Closing File reader");
					fileRd.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
  }
}