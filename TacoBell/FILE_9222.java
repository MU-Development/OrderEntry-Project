import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Tbell {
	public static void main(String[] args) {
		JFrame f = new JFrame("Taco Bell");
		f.setSize(500, 250);
		f.setLocation(200, 200);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		final JPanel mainPanel = new JPanel();
		mainPanel.add(new JCheckBox("Taco"));
		mainPanel.add(new JCheckBox("Burrito"));
		mainPanel.add(new JCheckBox("Soda"));
		mainPanel.add(new JCheckBox("Nachos"));

		JPanel orderPanel = new JPanel();
		JButton orderButton = new JButton("Place Order");
		orderPanel.add(orderButton);
		JButton coupButton = new JButton("Coupon");
		orderPanel.add(coupButton);
		//JPanel p = new JPanel();
		//p.setLayout(new GridBagLayout());
		//Component text = null;
		//p.add(text);
		JComboBox<String> size = new JComboBox<String>();
		JComboBox<String> size2 = new JComboBox<String>();
		// add items to the combo box
		size.addItem("Small");
		size.addItem("Medium");
		size.addItem("Large");
		size2.addItem("10%");
		size2.addItem("15%");
		size2.addItem("20%");

		orderPanel.add(orderButton);

		Container content = f.getContentPane();
		content.setLayout(new GridLayout(3, 1));
		content.add(mainPanel);
		content.add(orderPanel);
		content.add(size);
		content.add(size2);
		
		

		
		orderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Component[] components = mainPanel.getComponents();
				for (int i = 0; i < components.length; i++) {
					JCheckBox cb = (JCheckBox) components[i];
					if (cb.isSelected())
						System.out.println("1 " + cb.getText());
				}
				 //f.setVisible(true);
			}});
		f.setVisible(true);};}
