import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

class CustomActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        System.out.println("Has been selected " + e);
        
        if (e.getActionCommand().equals("Button")){
            System.out.println("You have selected");
        }
    }
}

public class bkpanel {
protected JTextField textField;
protected JTextArea textArea;

public bkpanel() {
JFrame frame = new JFrame("Select your items");
//JButton btn1 = new JButton("Burger")
JButton btn2 = new JButton("Fries");
JButton btn3 = new JButton("Drink");

JPanel bk = new JPanel();
bk.setLayout(new GridBagLayout());
//visual layout for buttons

GridBagConstraints gbc = new GridBagConstraints();
gbc.fill = GridBagConstraints.HORIZONTAL;

//gbc.gridx = 0;
//gbc.gridy = 0;
//btn1.addActionListener(new CustomActionListener())
//bk.add(btn1,gbc)

gbc.gridx = 100;
gbc.gridy = 50;
bk.add(btn2,gbc);

gbc.gridx = 200;
gbc.gridy = 50;
bk.add(btn3,gbc);

/*JCheckBox jb = new JCheckBox("Drink");
//visual layout for checkbox
gbc.gridx = 150;
gbc.gridy = 50;
gbc.gridwidth = 1;
bk.add(jb,gbc);*/

JComboBox burgers = new JComboBox();
burgers.addItem("Whopper");
burgers.addItem("Hamburger");
burgers.addItem("Quarter Pounder");

gbc.gridx = 300;
gbc.gridy = 50;
bk.add(burgers,gbc);

JComboBox dq = new JComboBox();
dq.addItem("1");
dq.addItem("2");
dq.addItem("3");
dq.addItem("4");
dq.addItem("5");

gbc.gridx = 200;
gbc.gridy = 60;
bk.add(dq,gbc);

JComboBox fq = new JComboBox();
fq.addItem("1");
fq.addItem("2");
fq.addItem("3");
fq.addItem("4");
fq.addItem("5");

gbc.gridx = 100;
gbc.gridy = 60;
bk.add(fq,gbc);



frame.setSize(300,300);
frame.getContentPane().add(bk);
frame.setVisible(true);  
}


}
