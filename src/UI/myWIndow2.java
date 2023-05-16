package UI;
//import java.awt.Color;
//import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import Library.Class2;
import Library.myLibrary2;
public class myWIndow2 implements ActionListener {
	
  JFrame frame;
  JLabel lbl1 , lbl2 ,lbl3 ;
  
  JTextField txt1, txt2 , txt3;
  
  JButton btn , btn1;
 

public myWIndow2() {
	frame = new JFrame();
	
	
	lbl1 = new JLabel();
    lbl2= new JLabel();
    lbl3= new JLabel();
	txt1 = new JTextField();
	txt2= new JTextField();
	txt3= new JTextField();
	btn = new JButton();
	btn1 = new JButton();
	
	frame.setSize(450,400);
	frame.setLayout(null);
	frame.setTitle("GUI");
	
	lbl1.setText("Enter a 1st Number: ");
	lbl1.setBounds(100 , 20 ,120 , 40);
	txt1.setText(null);
	txt1.setBounds(230 , 20 , 100 , 40);
	
	
	lbl2.setText("Enter a 2nd Number: ");
	lbl2.setBounds(100 , 80 ,120 , 40);
	txt2.setText(null);
	txt2.setBounds(230 , 80 , 100 , 40);
	
	btn.setText("ADD");
	btn.setBounds(195 , 150 , 70 , 30);
	btn.addActionListener(this);
	
	
	lbl3.setText("Result: ");
	lbl3.setBounds(120, 200, 90, 40);
	txt3.setText(null);
	txt3.setBounds(185, 200, 90, 40);
	
	btn1.setText("CLOSE");
	btn1.setBounds(185 , 265 , 90 , 30);
	btn1.addActionListener(this);
	
	frame.add(lbl1);
	frame.add(txt1);
	frame.add(lbl2);
	frame.add(txt2);
	frame.add(lbl3);
	frame.add(txt3);
	frame.add(btn);
	frame.add(btn1);
	
	
	frame.setVisible(true);

}

public void actionPerformed(ActionEvent ae)
{
	if (ae.getSource() == btn) {
		String str1 =txt1.getText();
		int num1 = Integer.parseInt(str1);
		String str2 =txt2.getText();
		int num2 = Integer.parseInt(str2);
		
		
		Class2 obj = new Class2();
obj.setNum1(num1);
obj.setNum2(num2);
obj.getNum3();
obj.sum();

txt3.setText(Integer.toString(obj.getNum3()));

		myLibrary2 lib = new myLibrary2();
		lib.receiveValue(obj);
	
	}
	if(ae.getSource()==btn1) {
		System.exit(0);
	}
	
}

	public static void main(String [] args) {
		new myWIndow2();
	 	
	}
	
}