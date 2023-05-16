package practice01;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe {
 
	JFrame frame;
	ImageIcon image;
	
public Jframe() {
	frame = new JFrame();
	frame.setTitle("Login Page");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setSize(420 , 420);
	
	
	image = new ImageIcon("hotel.jpg");
	frame.setIconImage(image.getImage());
	frame.getContentPane().setBackground(new Color(0, 0 ,0));
	frame.setVisible(true);
	
}
	 public static void main(String args []) {
		 
		 new Jframe();
	 }
	
}
