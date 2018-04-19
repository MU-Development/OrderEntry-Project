/**
 * GUI for the login screen
 * 
 * @author Lauren Clauberg
 * @version 1.0
 * @since 4/18/2018
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UISetupLogin implements ActionListener{
	String usernameTxt;
	String passwordTxt;
	VerifyLogin verify = new VerifyLogin();
	
	JLabel blank = new JLabel(" ");
	JLabel userLabel = new JLabel("Username   ");
	JTextField username = new JTextField(10);
	JLabel passLabel = new JLabel("Password   ");
	JPasswordField password = new JPasswordField(10);
	JButton login = new JButton("Login");
	JLabel loginStatus = new JLabel("Username and/or Password do not match or are not in our system");
	
	public UISetupLogin() {
		JFrame frame = new JFrame("Owner Login");

		JPanel p = new JPanel();
		p.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		/**
		 * Username Field
		 */
		gbc.gridx = 0;
		gbc.gridy = 1;
		p.add(userLabel,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		//username.addActionListener(this);
		p.add(username,gbc);
		
		/**
		 * Password Field
		 */
		gbc.gridx = 0;
		gbc.gridy = 2;
		p.add(passLabel,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;	
		//password.addActionListener(this);
		p.add(password,gbc);
		
		/**
		 * Login enter button
		 */
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 3;
		login.addActionListener(this);
		p.add(login,gbc);
		
		/**
		 *  Adds extra space between enter and error popup
		 */
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 4;
		p.add(blank,gbc);
		
		/**
		 *  Pops up after you enter user and pass
		 */
		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 5;
		//login.addActionListener(this);
		p.add(loginStatus,gbc);
		loginStatus.setVisible(false);
		
		
		/**
		 * Set the size of the Frame
		 * add the panel to the Content Pane
		 * make it Visible
		 */
		frame.setSize(300,300);
		frame.getContentPane().add(p);
		frame.setVisible(true);
	}
	
	/**
	 * Looks at the button that was pressed and chooses what to do with it
	 * @param ActionEvent e or the type of button was presses
	 */
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("Login")){
			usernameTxt = username.getText();
			passwordTxt = String.valueOf(password.getPassword());
			if(verify.Verify(usernameTxt, passwordTxt) == false) {
				loginStatus.setVisible(true);}
			else {
				UISetupCompanies uicomp = new UISetupCompanies();}} 
	}
}