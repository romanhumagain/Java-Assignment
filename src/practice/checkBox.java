package practice;

import javax.swing.*;

public class checkBox{
	JButton btn;
	JFrame frame; 
	JCheckBox box;

	public checkBox() {
		
		frame = new JFrame();
		 btn = new JButton();
		 btn.setText("submit");

btn.setBounds(20,60, 60, 30);
		
		 
		 frame.add(btn);
		 frame.setSize(450 , 400);
		 frame.setVisible(true);
		 frame.setLayout(null);
	}
	
 public static void main(String args []) {
	 new checkBox();
	 
 }
}
