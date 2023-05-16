package Hotel.UNI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import practice01.Jlabel;
public class Assign01 {
public static void main(String [] args)  {
	 
	 ImageIcon roman= new ImageIcon("hotel.jpg");
	   JFrame frame = new JFrame();
	   JPanel panel = new JPanel();
	   JPanel panel1 = new JPanel();
	   
	   
	   
	   frame.setTitle("Login Page");
	   frame.setSize(700,500);
	   //frame.setLayout(null);
	   frame.setResizable(false);
	   frame.setLocation(200, 50);
	   frame.setIconImage(roman.getImage());
	   //Container c = frame.getContentPane();
	   Color cl = new Color(0,153 ,153);
	  
	   //c.setBackground(cl);
	   //c.setBounds(10,20,400 ,300);
	   
	   //ImageIcon icon = new ImageIcon("C:\\Users\\Victus\\Documents\\CV.coding\\hotel.jpg");
	  panel.setBackground(cl);
	   panel.setPreferredSize(new Dimension(250,100));
	   panel.setLayout(null);
	   
	   panel1.setBackground(Color.DARK_GRAY);
	   panel1.setLayout(null);
	   panel1.setPreferredSize(new Dimension(150, 100));
	   
	   
	 
	   JButton btn1 =new JButton();
	   btn1.setText("Home");
	   btn1.setForeground(Color.white);
	   btn1.setFont(new Font("Arial" , Font.BOLD , 20));
	   btn1.setBounds(20 , 25 , 100 , 30);
	   btn1.setBackground(Color.DARK_GRAY);
	   btn1.setFocusable(false);
	   btn1.setBorderPainted(false); 
	   panel1.add(btn1);
	   
	   JButton btn2 =new JButton();
	   btn2.setText("About");
	   btn2.setForeground(Color.white);
	   btn2.setFont(new Font("Arial" , Font.BOLD , 20));
	   btn2.setBounds(20, 95, 100, 30);
	   btn2.setBackground(Color.DARK_GRAY);
	   btn2.setFocusable(false);
	   btn2.setBorderPainted(false);
	   panel1.add(btn2);
	   
	   JButton btn3 =new JButton();
	   btn3.setText("Contact");
	   btn3.setForeground(Color.white);
	   btn3.setFont(new Font("Arial" , Font.BOLD , 20));
	   btn3.setBounds(10, 165, 120, 30);
	   btn3.setBackground(Color.DARK_GRAY);
	   btn3.setFocusable(false);
	   btn3.setBorderPainted(false);
	   panel1.add(btn3);
	   
	   JButton btn4 =new JButton();
	   btn4.setText("Help");
	   btn4.setForeground(Color.white);
	   btn4.setFont(new Font("Arial" , Font.BOLD , 20));
	   btn4.setBackground(Color.DARK_GRAY);
	   btn4.setFocusable(false);
	   btn4.setBorderPainted(false);
	   btn4.setBounds(20, 235, 100, 30);
	   panel1.add(btn4);
	 
	 
	   
	   JLabel lbl = new JLabel();
		 lbl.setText("Hotel Booking System ");
		 lbl.setBounds(140 , 10 , 400 , 50);
		 lbl.setVerticalAlignment(JLabel.TOP);
		 lbl.setFont(new Font("Mv Boli" , Font.PLAIN , 25));
		  
		  
		   JLabel  lbl1 = new JLabel();
		   lbl1 = new JLabel();
		   Font font = new Font("Mv Boli",Font.ITALIC, 20);
		   
		   lbl1.setText("USERNAME:");
		   lbl1.setBounds(50 , 100,200, 20);
		   lbl1.setFont(font);
		   lbl1.setForeground(Color.blue);
		  
		   panel.add(lbl);
		   panel.add(lbl1);
		   
		   JTextField txt1;
		   txt1 = new JTextField();
		   
		   Font font2 = new Font("Arial" ,Font.ROMAN_BASELINE,25 );
		   txt1.setBounds(200 , 95 ,150,35);
		   txt1.setFont(font2);
		   panel.add(txt1);
		  
		   JLabel lbl2 =new JLabel();
		   lbl2.setText("Password:");
		   lbl2.setBounds(50, 150,200, 30);
		   lbl2.setFont(font);
		   lbl2.setForeground(Color.blue);
		  
		   
		   panel.add(lbl2);
		   
		   JPasswordField txt2 = new JPasswordField();
		   //txt2.setEchoChar((char)0);
		   Font font3 = new Font("Arial" ,Font.ROMAN_BASELINE,20 );
		   txt2.setBounds(200 , 150 ,150,35);
		   txt2.setFont(font3);
		   panel.add(txt2);
		   
	 
		  JButton btn5 = new JButton();
		  ImageIcon shw = new ImageIcon("shw.png");
		  
		  ImageIcon icon = new ImageIcon("clse.png");
		 //btn1.setIcon(icon);
		  btn5.setText("show");
		 btn5.setBackground(Color.lightGray); 
		 btn5.setBounds(360, 150, 70, 30);
		 panel.add(btn5);
		   JButton btn6 = new JButton();
			  
		   btn6.setText("Hide");
		   //btn2.setIcon(icon);
		   btn6.setBounds(360, 150, 70, 30);
		   btn6.setBackground(Color.lightGray); 
		 
		   panel.add(btn6);
		   
		 JButton btn7 = new JButton();
		   btn7.setText("Login");
		   btn7.setBounds(190 , 200 ,80,30);
		   btn7.setBackground(Color.lightGray); 
		 
		   panel.add(btn7);
		   
		   JButton btn8 = new JButton();
		   btn8.setText("Close");
		   btn8.setBounds(190 , 230 ,80,30);
		   panel.add(btn8);
		 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  /*JLabel lbl = new JLabel();
	 lbl.setText("Please Provide Your Information !!");
	 lbl.setBounds(100 , 10 , 400 , 200);
	 lbl.setVerticalAlignment(JLabel.TOP);
	 lbl.setFont(new Font("Mv Boli" , Font.PLAIN , 20));
	  
	  
	   JLabel  lbl1 = new JLabel();
	   lbl1 = new JLabel();
	   Font font = new Font("Mv Boli",Font.ITALIC, 25);
	   
	   lbl1.setText("USERNAME:");
	   //lbl1.setBounds(100 , 400,200, 30);
	   lbl1.setFont(font);
	   lbl1.setForeground(Color.blue);
	  
	   panel.add(lbl);
	   panel.add(lbl1);
	   
	   JTextField txt1;
	   txt1 = new JTextField();
	   
	   Font font2 = new Font("Arial" ,Font.ROMAN_BASELINE,20 );
	   txt1.setBounds(180 , 200 ,150,30);
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
	   panel.add(btn4);*/
	 
	 
	 
	   
	   frame.add(panel, BorderLayout.CENTER);
	   frame.add(panel1, BorderLayout.WEST);
	   frame.setVisible(true);
	   
	   /*btn1.addActionListener(new ActionListener () {
		   public void actionPerformed(ActionEvent e) { 
		   if(e.getSource()==btn1) {
			   txt2.setEchoChar((char)0);
			   btn1.setVisible(false);
			   btn2.setVisible(true);
		   }
		   }
	   });
	   btn2.addActionListener(new ActionListener () {
		   public void actionPerformed(ActionEvent e) { 
		   if(e.getSource()==btn2) {
			   txt2.setEchoChar('*');
			   btn1.setVisible(true);
			   btn2.setVisible(false);
		   }
		   }
	   });
	   Color coll = new Color(255 , 204 ,203);
	   btn3.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent ae) {
		   if((JButton) ae.getSource()==btn3) {
			   c.setBackground(coll);
			   
			 
			    }
		   }

		

	   } );
	   btn4.addActionListener(new ActionListener (){
		   public void actionPerformed(ActionEvent ae) {
			   if (ae.getSource() ==btn4) {
			   System.exit(0);
			   }
		   }
	   });*/
	 
	   }	
}
	  
	
 
 
 

