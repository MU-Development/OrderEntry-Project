import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.*;

/**
* *
* @author  Sam Pagano
* @version 1.0
* @since   2018-02-10
*/


public class LoadDataStoreFG
{
/** Setup private variables for the class */	
	private BufferedReader buff = null;
	private FileReader fileRd = null;
	private String line = "test";
	private String dfile = "";
	private StringTokenizer tok = null;
	private UserData[] udata;
	
	public LoadDataStoreFG()
	   /**
	   * If no argument is passed into the calling program command line,
	   * this method opens a GUI for the user to select the file they want to pull data from.
	   * 
	   * @param dfile this is the string set to the file path which the user chose
	   */
	{
	JFileChooser jfc = new JFileChooser();
	int returnVal = jfc.showOpenDialog(null);
	
	if (returnVal == JFileChooser.APPROVE_OPTION) 
	{
		File selectedFile = jfc.getSelectedFile();
		dfile=selectedFile.getAbsolutePath();
		System.out.println("Path and File Selected -->"+dfile); //print the path so the user can see which file was selected
		dfile = dfile.replace("\\", "\\\\"); //add slashes to the file path so FileReader can read the file path
		}
	}
	
	int countLines()
	   /**
	   * @param count this is the integer which increments each time a row is counted in the file
	   */
	{
		int count=0;
		try 
		//if a file was not selected, throw an exception. If there is a problem with counting the lines, throw an exception
		{
		
		fileRd = new FileReader(dfile);
		buff = new BufferedReader(fileRd);
		while ((line = buff.readLine()) != null) //keep looping until we reach the end of the lines of data
			{count++;} //increment the count
		}
		
		catch (FileNotFoundException e)
			{System.out.println("No file was selected !");}
		
		catch (IOException e)
			{e.printStackTrace();}
		return(count);
	}
	
	void printArrayOfObjects()
	   /**
	   * printArrayOfObjects will print out the array of the class.
	   * 
	   * @param mdata is an array of objects.
	   * 
	   */
	{
		for (int row=0; row < udata.length; row++) 
		{
			System.out.printf("%-25s ","User Name: "+udata[row].username+" ");
			System.out.printf("%-25s ","Item: "+udata[row].item+" ");
			System.out.printf("%-25s ","Quantity: "+udata[row].quantity+" ");
			System.out.printf("%-25s ","Price: "+udata[row].price+" ");
			System.out.println();
		}
	}
	
	public String[][] getUserData()
	{
		String[][] guestdata = new String[1][3];
		
		guestdata[0][0] = "Fries";
		guestdata[0][1] = "2"; 
		guestdata[0][2] = "2.50";
		
		return guestdata;
	}
	
	
	public String[][] getUserData(String guest, double order)
	{
		int count = 0;

		for (int i=0; i < udata.length;i++)
		{
			if(udata[i].username == guest)
			{
				count = count + 1;
			}
		}
		
		String[][] guestdata = new String[count][3];
		
		for (int i=0; i < udata.length;i++)
		{
			if(udata[i].username == guest)
			{
				guestdata[count][1] = udata[i].item; 
				guestdata[count][2] = udata[i].quantity;
				guestdata[count][3] = udata[i].price;
				count = count + 1;
			}
		}
		return guestdata;	
	}
	
	void sourceData()
	{
		int maxRow=0, i=0, c=0;
		maxRow = this.countLines();

		udata = new UserData[maxRow];
		
		for(int x=0; x < udata.length; x++)
		{
			udata[x] = new UserData();
		}
		
		try 
		{
			fileRd = new FileReader(dfile);
			buff = new BufferedReader(fileRd);
			
			while ((line = buff.readLine()) != null) //move into for loop
			{				
				tok = new StringTokenizer(line, ",");
				udata[i].username = tok.nextElement().toString();
				udata[i].item = tok.nextElement().toString();
				udata[i].quantity = tok.nextElement().toString();
				udata[i].price = tok.nextElement().toString();
				i++;
			}
			System.out.println("Import of data and array construction completed successfully !");
		}
		catch (NumberFormatException e)
		{
			System.out.println("There was an error converting the string to a double");
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("No file was selected !");
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}

		}
		
	}