import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UISetupCompanies extends ComputeMethods implements ActionListener {
	
	Integer[] reorderQuantity = {5,10,15,20};
	JComboBox <Integer> HamburgerReorder = new JComboBox<>(reorderQuantity);
	JComboBox <Integer> WhopperReorder = new JComboBox<>(reorderQuantity);
	JComboBox <Integer> QPReorder = new JComboBox<>(reorderQuantity);
	JComboBox <Integer> FriesReorder = new JComboBox<>(reorderQuantity);
	JComboBox <Integer> DrinkReorder = new JComboBox<>(reorderQuantity);
	JComboBox <Integer> DonutReorder = new JComboBox<>(reorderQuantity);
	JComboBox <Integer> TacoReorder = new JComboBox<>(reorderQuantity);
	JComboBox <Integer>  BurritoReorder = new JComboBox<>(reorderQuantity);	
	JComboBox <Integer> NachoReorder = new JComboBox<>(reorderQuantity);
	
	public UISetupCompanies() {
		
		/**
		 * Set up Frame
		 */
		JFrame frame = new JFrame("Owner Interface");
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		
		/**
		 * Set up panels for each company
		 */
		JPanel DD = new JPanel();
		DD.setPreferredSize(new Dimension(200,500));
		JPanel TB = new JPanel();
		TB.setPreferredSize(new Dimension(200,500));
		JPanel BK = new JPanel();
		BK.setPreferredSize(new Dimension(200,500));
		DD.setLayout(new GridBagLayout());
		TB.setLayout(new GridBagLayout());
		BK.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		/**
		 * Labels for Burger King
		 */
		JLabel BKLabel = new JLabel("Burger King");
		BKLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		gbc.gridx = 0;
		gbc.gridy = 0;
		BK.add(BKLabel,gbc);
		
		JLabel BKProfit = new JLabel("Profit/Loss: ");
		BKProfit.setFont(new Font("SansSerif", Font.BOLD, 15));
		gbc.gridx = 0;
		gbc.gridy = 1;
		BK.add(BKProfit,gbc);
		
		gbc.gridy = 2;
		BK.add(new JLabel("Hamburger"),gbc);
		gbc.gridy = 3;
		BK.add(HamburgerReorder,gbc);
		
		gbc.gridy = 4;
		BK.add(new JLabel("Whopper"),gbc);
		gbc.gridy = 5;
		BK.add(WhopperReorder,gbc);
		
		gbc.gridy = 6;
		BK.add(new JLabel("Quarter Pounder"),gbc);
		gbc.gridy = 7;
		BK.add(QPReorder,gbc);
		
		gbc.gridy = 8;
		BK.add(new JLabel("Fries"),gbc);
		gbc.gridy = 9;
		BK.add(FriesReorder,gbc);
		
		gbc.gridy = 10;
		BK.add(new JLabel("Drink"),gbc);
		gbc.gridy = 11;
		BK.add(DrinkReorder,gbc);
		
		/**
		 * Labels for Dunkin Donuts
		 */
		JLabel DDLabel = new JLabel("Dunkin Donuts");
		DDLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		gbc.gridy = 0;
		DD.add(DDLabel,gbc);

		JLabel DDProfit = new JLabel("Profit/Loss: ");
		DDProfit.setFont(new Font("SansSerif", Font.BOLD, 15));
		gbc.gridy = 1;
		DD.add(DDProfit,gbc);
		
		gbc.gridy = 2;
		DD.add(new JLabel("Donut"),gbc);
		gbc.gridy = 3;
		DD.add(DonutReorder,gbc);
		
		/**
		 * Labels for Taco Bell
		 */
		JLabel TBLabel = new JLabel("Taco Bell");
		TBLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		gbc.gridy = 0;
		TB.add(TBLabel,gbc);
		
		JLabel TBProfit = new JLabel("Profit/Loss: ");
		TBProfit.setFont(new Font("SansSerif", Font.BOLD, 15));;
		gbc.gridy = 1;
		TB.add(TBProfit,gbc);
		
		gbc.gridy = 2;
		TB.add(new JLabel("Taco"),gbc);
		gbc.gridy = 3;
		TB.add(TacoReorder,gbc);
		
		gbc.gridy = 4;
		TB.add(new JLabel("Burrito"),gbc);
		gbc.gridy = 5;
		TB.add(BurritoReorder,gbc);
		
		gbc.gridy = 6;
		TB.add(new JLabel("Nacho"),gbc);
		gbc.gridy = 7;
		TB.add(NachoReorder,gbc);
		
		/**
		 * Reorder Button
		 */
		JButton reorder = new JButton("Reorder");
		gbc.gridy = 8;
		TB.add(reorder, gbc);
		
		/**
		 * Add panels and set frame
		 */
		frame.setSize(700,1000);
		frame.getContentPane().add(DD);
		frame.getContentPane().add(TB);
		frame.getContentPane().add(BK);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("Reorder")){
			int orderHamburger = (Integer)HamburgerReorder.getSelectedItem();
			int orderWhopper = (Integer)WhopperReorder.getSelectedItem();
			int orderQP = (Integer)QPReorder.getSelectedItem();
			int orderFries = (Integer)FriesReorder.getSelectedItem();
			int orderDrink = (Integer)DrinkReorder.getSelectedItem();
			int orderDonut = (Integer)DonutReorder.getSelectedItem();
			int orderTaco = (Integer)TacoReorder.getSelectedItem();
			int orderBurrito = (Integer)BurritoReorder.getSelectedItem();
			int orderNacho = (Integer)NachoReorder.getSelectedItem();
			
			addItem("Hamburger", orderHamburger);
			addItem("Whopper", orderWhopper);
			addItem("Quarter Pounder", orderQP);
			addItem("Fries", orderFries);
			addItem("Drink", orderDrink);
			addItem("Donut", orderDonut);
			addItem("Taco", orderTaco);
			addItem("Burrito", orderBurrito);
			addItem("Nacho", orderNacho);
		}
	}//end of actionPerformed
}
