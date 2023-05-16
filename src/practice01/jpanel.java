package practice01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class jpanel {
 public static void main(String args []) {
	 ImageIcon roman= new ImageIcon("hotel.jpg");
	 
	 
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JPanel panel1 = new JPanel();



frame.setTitle("Login Page");
frame.setSize(100,100);
//frame.setLayout(null);
frame.setResizable(false);
frame.setLocation(200, 50);
frame.setIconImage(roman.getImage());



panel.setBackground(new Color(0, 153 ,153));
panel.setPreferredSize(new Dimension(150,100));


panel1.setBackground(Color.DARK_GRAY);
panel1.setPreferredSize(new Dimension(100, 100));




JLabel lbl = new JLabel();
lbl.setText("Please Provide Your Information !!");
lbl.setBounds(100 , 10 , 400 , 200);
lbl.setVerticalAlignment(JLabel.TOP);
lbl.setFont(new Font("Mv Boli" , Font.PLAIN , 20));


 JLabel  lbl1 = new JLabel();
 lbl1 = new JLabel();
 Font font = new Font("Mv Boli",Font.ITALIC, 25);
 
 lbl1.setText("Username:");
 lbl1.setBounds(50, 60,200, 30);
 lbl1.setFont(font);
 lbl1.setForeground(Color.blue);

 panel.add(lbl);
 panel.add(lbl1);
 
 JTextField txt1;
 txt1 = new JTextField();
 
 Font font2 = new Font("Arial" ,Font.ROMAN_BASELINE,20 );
 txt1.setBounds(180 , 60 ,150,30);
 txt1.setFont(font2);
 panel.add(txt1);
 
 JLabel lbl2 =new JLabel();
 lbl2.setText("Password:");
 lbl2.setBounds(50, 110,200, 30);
 lbl2.setFont(font);
 lbl2.setForeground(Color.blue);

 
 panel.add(lbl2);
 
 JPasswordField txt2 = new JPasswordField();
 //txt2.setEchoChar((char)0);
 Font font3 = new Font("Arial" ,Font.ROMAN_BASELINE,20 );
 txt2.setBounds(180 , 110 ,150,30);
 txt2.setFont(font3);
 panel.add(txt2);
 

JButton btn1 = new JButton();
ImageIcon shw = new ImageIcon("shw.png");

ImageIcon icon = new ImageIcon("clse.png");
//btn1.setIcon(icon);
btn1.setText("show");
btn1.setBackground(Color.lightGray); 
btn1.setBounds(340, 110, 70, 30);
panel.add(btn1);
 JButton btn2 = new JButton();
	  
 btn2.setText("Hide");
 //btn2.setIcon(icon);
 btn2.setBounds(340, 110, 70, 30);
 btn2.setBackground(Color.lightGray); 

 panel.add(btn2);
 
 JButton btn3 = new JButton();
 btn3.setText("Login");
 btn3.setBounds(190 , 175 ,80,30);
 btn3.setBackground(Color.lightGray); 

 panel.add(btn3);
 
 JButton btn4 = new JButton();
 btn4.setText("Close");
 btn4.setBounds(190 , 220 ,80,30);
 panel.add(btn4);

 frame.add(panel, BorderLayout.CENTER);
 frame.add(panel1, BorderLayout.WEST);
 frame.setVisible(true);

 frame.add(panel, BorderLayout.CENTER);
 frame.add(panel1,BorderLayout.WEST);
 frame.setSize(450 , 400);
	frame.setVisible(true); 
	 
 }
}
