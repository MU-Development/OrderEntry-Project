

import javax.swing.SwingUtilities;

import java. awt.*;


public class SalesTester {
	
	public static void main (String[] args) {
		SwingUtilities.invokeLater(() -> {
			SalesChart frame = new SalesChart();
			frame.setVisible(true);
		}
			);
		}
		
		
		
	}

