
public class FrequentGuest {

	private String[][] ud;   
	
	public FrequentGuest(String[][] userData)
	{
		//constructor
		for(int i=0; i<userData.length; i++)
			  for(int j=0; j<userData[i].length; j++)
			  ud[i][j] = userData[i][j];
	}
	

	public void addGuestOrder(String[][] input)
	{
		int count;
		count = ud[1].length + 1;
		for(int i=count; i<input.length; i++)
			  for(int j=0; j<input[i].length; j++)
			    ud[i][j]=input[i][j];
	}
	
	public String[][] getGuestOrder(String user)
	{
		String[][] temp = new String[1][3];
		for(int i=0;i<ud.length;i++)
		{
			if(ud[i][1] == user)
			{
				temp[i][1] = ud[i][1];
				temp[i][2] = ud[i][2];
				temp[i][3] = ud[i][3];
			}
		}
	return temp;
	}
}
