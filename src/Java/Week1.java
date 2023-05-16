package Java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Week1{
	public static void main(String [] args) {
		
	JFrame frame = new JFrame("Adding Program");
	frame.setSize(500,500);
	
			
	JPanel panel= new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.LIGHT_GRAY);
		frame.add(panel);
		
		
		    
	JLabel LBL1 = new JLabel("Enter First Number:-");
	final JTextField  TXT1 = new JTextField(10);
	    panel.add(LBL1);
	    panel.add(TXT1);
	JLabel LBL2 = new JLabel("Enter Second Number:-");
	final JTextField TXT2 = new JTextField(10);
		panel.add(LBL2);
        panel.add(TXT2);
					
	JButton button = new JButton("Add");
	    panel.add(button);
	    
	JLabel LBL3 = new JLabel("Result");
	final JTextField TXT3 = new JTextField(10);
			    
	    panel.add(LBL3);
	    panel.add(TXT3);	
		     
button.addActionListener(new ActionListener () {
public void actionPerformed(ActionEvent e) {
	int a = Integer.parseInt(TXT1.getText());
	int b = Integer.parseInt(TXT2.getText());
    int sum = a + b;
	TXT3.setText(Integer.toString(sum));
}
});
		
frame.setVisible(true);
   }
}

	
