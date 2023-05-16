package GUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.*;
import java.awt.event.*;
public  class myWindow implements ActionListener {
	public static void main(String  []args) {
	
JFrame frame;
JLabel lbl1, lbl2 ,lbl3;
JTextField txt1 , txt2 ,txt3;
JButton btn;


	frame = new JFrame();
	lbl1 = new JLabel();
	lbl2 = new JLabel();
	lbl3 = new JLabel();
	txt1 = new JTextField();
	txt2 = new JTextField();
	txt3 = new JTextField();
	btn = new JButton();
	


frame.setSize(350,300);
frame.setLayout(null);
frame.setResizable(false);


lbl1.setText("Enter a 1st number: ");
lbl1.setBounds(20 , 10 ,200,40);

txt1.setText(null);
txt1.setBounds(170,20,90,30);

lbl2.setText("Enter a 2nd number: ");
lbl2.setBounds(20 , 75 ,200,40);

txt2.setText(null);
txt2.setBounds(170,80,90,30);

btn.setText("Add");
btn.setBounds(130, 150, 60, 30);
btn.addActionListener(this);



lbl3.setText("Result: ");
lbl3.setBounds(70, 200, 200, 30);

txt3.setText(null);
txt3.setBounds(115, 200, 90, 30);




frame.add(lbl1);
frame.add(txt1);
frame.add(lbl2);
frame.add(txt2);
frame.add(lbl3);
frame.add(txt3);
frame.add(btn);

frame.setVisible(true);



	
	public void ActionPerformed(ActionEvent ae){
		
		
		if(ae.getSource()==btn) {
			 String str1=txt1.getText(); //read
			 int num1= Integer.parseInt(str1); //conversion
			 String str2=txt2.getText(); //read
			 int num2= Integer.parseInt(str1); //conversion
			
			 int sum = num1+num2;
			 
			 txt3.setText(Integer.toString(sum));
			 
		
			 
		}
		
		
	}
	
	
	}
	

