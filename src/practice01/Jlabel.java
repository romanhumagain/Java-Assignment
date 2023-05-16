package practice01;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Jlabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImageIcon image = new ImageIcon("haha.jpeg");
		Border border = BorderFactory.createLineBorder(Color.red , 3);
		JLabel label = new JLabel();
		label.setText("Are You A Human?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.RIGHT);// SET TEXT LEFT , CENTER , RIGHT OG IMAGEICON
		label.setVerticalTextPosition(JLabel.CENTER);//SET TEXT TOP , CENTER , BUTTON OF IMAGE ICON
		label.setForeground(new Color(0 ,123 ,0));
		label.setFont(new Font("Mv Boli" , Font.PLAIN , 20));
		label.setIconTextGap(10);
		label.setBackground(Color.black);
		label.setOpaque(true); // to make background color visible
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(0, 0, 450, 250);
		
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500 , 500);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack(); //it automatically resize frame accordingly
	}

}
