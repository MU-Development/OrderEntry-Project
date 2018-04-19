/**
 * Class to verify the login information
 * 
 * @author Lauren Clauberg
 * @version 1.0
 * @since 4/18/2018
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class VerifyLogin 
{
	private BufferedReader buff = null;
	private FileReader fileRd = null;
	private String line = "test";
	private String dfile; //= "C:\\Users\\Lauren\\Desktop\\OwnerLogin.csv";
	private StringTokenizer tok = null;
	FileChooser fChooser = new FileChooser();
	
	int rowNum = 3;
	int colNum = 2;
	String [][] loginInfo = new String[rowNum][colNum];
	
	public void setDFile() {
		dfile = fChooser.selectFile(); }
	
	/**
	 * Take in info from excel file and put it into a 2d array
	 */
	public void sourceData(){
		setDFile();
		try {
			fileRd = new FileReader(dfile);
			buff = new BufferedReader(fileRd);
			
			for(int row = 0; row < rowNum; row++ ) {
				line = buff.readLine();
				if(line != null) {
					tok = new StringTokenizer(line, ",");}
				
				for (int col = 0; col < colNum; col++) {
					loginInfo[row][col] = tok.nextElement().toString(); } }
		}//end of try
		catch (IOException e) {
			e.printStackTrace();} 
		finally {
			try {
				if(buff != null) {
					buff.close();}
				if(fileRd != null) {
					fileRd.close();}} 
			catch(IOException ioe) {
				ioe.printStackTrace();}
		}//end finally
	}//end of sourceData
	
	/**
	 * Verifies to UISetup if the password and username entered is correct
	 * 
	 * @param user
	 * @param pass
	 * @return verification
	 */
	public boolean Verify(String user, String pass) {
		sourceData();
		boolean verification = false;
		for(int row = 0; row < rowNum; row++) 
		{
			if(user.equals(loginInfo[row][0])&& pass.equals(loginInfo[row][1]))
			{
				verification = true;
				return verification;
			}
		}
		return verification;
	}//end of Verify
}//end of VerifyLogin


