import java.awt.*;
import javax.swing.*;

public class UISetupCompanies {
	public UISetupCompanies() {
		/**
		 * Set up Frame
		 */
		JFrame frame = new JFrame("Owner Interface");
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		Integer[] reorderQuantity = {5,10,15,20};
		
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
		BKProfit.setFont(new Font("SansSerif", Font.BOLD, 18));
		gbc.gridx = 0;
		gbc.gridy = 1;
		BK.add(BKProfit,gbc);
		
		JLabel Hamburger = new JLabel("Hamburger");
		gbc.gridx = 0;
		gbc.gridy = 2;
		BK.add(Hamburger,gbc);
		
		/*
		JComboBox <Integer> HamburgerReorder = new JComboBox<>(reorderQuantity);
		gbc.gridx = 0;
		gbc.gridy = 3;
		DD.add(Hamburger,gbc);
		*/
		
		JLabel Whooper = new JLabel("Whooper");
		gbc.gridx = 0;
		gbc.gridy = 3;
		BK.add(Whooper,gbc);
		
		/*
		JComboBox <Integer> WhopperReorder = new JComboBox<>(reorderQuantity);
		gbc.gridx = 0;
		gbc.gridy = 3;
		DD.add(WhopperReorder,gbc);
		*/
		
		JLabel QPounder = new JLabel("Quater Pounder");
		gbc.gridx = 0;
		gbc.gridy = 4;
		BK.add(QPounder,gbc);
		
		/*
		JComboBox <Integer> QPReorder = new JComboBox<>(reorderQuantity);
		gbc.gridx = 0;
		gbc.gridy = 3;
		DD.add(QPReorder,gbc);
		*/
		
		JLabel Fries = new JLabel("Fries");
		gbc.gridx = 0;
		gbc.gridy = 5;
		BK.add(Fries,gbc);
		
		/*
		JComboBox <Integer> FriesReorder = new JComboBox<>(reorderQuantity);
		gbc.gridx = 0;
		gbc.gridy = 3;
		DD.add(DonutReorder,gbc);
		*/
		
		JLabel Drink = new JLabel("Drink");
		gbc.gridx = 0;
		gbc.gridy = 6;
		BK.add(Drink,gbc);
		
		/**
		 * Labels for Dunkin Donuts
		 * 
		 */
		JLabel DDLabel = new JLabel("Dunkin Donuts");
		DDLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		gbc.gridx = 0;
		gbc.gridy = 0;
		DD.add(DDLabel,gbc);

		JLabel DDProfit = new JLabel("Profit/Loss: ");
		DDProfit.setFont(new Font("SansSerif", Font.BOLD, 18));
		gbc.gridx = 0;
		gbc.gridy = 1;
		DD.add(DDProfit,gbc);
		
		JLabel Donut = new JLabel("Donut");
		gbc.gridx = 0;
		gbc.gridy = 2;
		DD.add(Donut,gbc);
		
		JComboBox <Integer> DonutReorder = new JComboBox<>(reorderQuantity);
		gbc.gridx = 0;
		gbc.gridy = 3;
		DD.add(DonutReorder,gbc);
		
		
		/**
		 * Labels for Taco Bell
		 * 
		 */
		JLabel TBLabel = new JLabel("Taco Bell");
		TBLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
		gbc.gridx = 0;
		gbc.gridy = 0;
		TB.add(TBLabel,gbc);
		
		JLabel TBProfit = new JLabel("Profit/Loss: ");
		TBProfit.setFont(new Font("SansSerif", Font.BOLD, 18));
		gbc.gridx = 0;
		gbc.gridy = 1;
		TB.add(TBProfit,gbc);
		
		JLabel Taco = new JLabel("Taco");
		gbc.gridx = 0;
		gbc.gridy = 2;
		TB.add(Taco,gbc);
		
		JLabel Burrito = new JLabel("Burrito");
		gbc.gridx = 0;
		gbc.gridy = 3;
		TB.add(Burrito,gbc);
		
		JLabel Nacho = new JLabel("Nacho");
		gbc.gridx = 0;
		gbc.gridy = 4;
		TB.add(Nacho,gbc);
		
		frame.setSize(700,1000);
		frame.getContentPane().add(DD);
		frame.getContentPane().add(TB);
		frame.getContentPane().add(BK);
		frame.setVisible(true);
	}
}
