import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Tbell {
public static void main(String[] args) {
    JFrame f = new JFrame("Taco Bell");
    f.setSize(300, 150);
    f.setLocation(200, 200);
    f.addWindowListener(new WindowAdapter( ) {
      public void windowClosing(WindowEvent we) { System.exit(0); }
    });

    final JPanel mainPanel = new JPanel( );
    mainPanel.add(new JCheckBox("Taco"));
    mainPanel.add(new JCheckBox("Burrito"));
    mainPanel.add(new JCheckBox("Soda"));
    mainPanel.add(new JCheckBox("Nachos"));
    
    JPanel orderPanel = new JPanel( );
    JButton orderButton = new JButton("Place Order");
    orderPanel.add(orderButton);
    JComboBox<String> size = new JComboBox<String>();
    
    // add items to the combo box
    size.addItem("Small");
    size.addItem("Medium");
    size.addItem("Large");
  
    orderPanel.add(orderButton);
    
    Container content = f.getContentPane( );
    content.setLayout(new GridLayout(3, 1));
    content.add(mainPanel);
    content.add(orderPanel);
    content.add(size);
    
    

  
// Select the 3rd string

 

//   public void buttonClicked(JButton buttonObj){
//
//        String cbStr = "", rStr = "";
//
//        if (cbDriver.isSelected())
//
//            cbStr = "Driver";
//
//        if (cbPassenger.isSelected())
//
//            cbStr = cbStr + "Passenger";
//
//        checkField.setText(cbStr);
//
//        if (rMarried.isSelected())
//
//            rStr = "Married";
//
//        else if (rDivorced.isSelected())
//
//            rStr = "Divorced";
//
//        else if (rSingle.isSelected())
//
//            rStr = "Single";
//
//        radioField.setText(rStr);
//
//        comboField.setText((String) size.getSelectedItem());
//
//    }
	
 

    
    orderButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Component[] components = mainPanel.getComponents();
        for (int i = 0; i < components.length; i++) {
          JCheckBox cb = (JCheckBox)components[i];
          if (cb.isSelected( ))
            System.out.println("1 " + cb.getText( ));
        }
/*       size.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent ae) {
//              Component[] comp2 = size.getComponents();
//              for (int j = 0; j < comp2.length; j++) {
//                JComboBox cb2 = (JComboBox)comp2[j];
//                if (cb2.isSelected( ))
                System.out.println("1 " + cb2.getText( ));
        
      }
    });
    */
    f.setVisible(true);
  }});
};}
