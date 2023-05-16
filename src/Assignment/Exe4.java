package Assignment;
import javax.swing.*;
public class Exe4 {
public static void main(String [] args) {
	String n1 = JOptionPane.showInputDialog("Enter 1st number");
	String n2 = JOptionPane.showInputDialog("Enter 2nd number");

	
	int num1 = Integer.parseInt(n1);
	int num2 = Integer.parseInt(n2);
	
	int sum = num1+num2;
    JOptionPane.showMessageDialog(null, "The sum is " +sum);
	int sub = num1-num2;
	JOptionPane.showMessageDialog(null, "The difference is " + sub);
	int mul = num1*num2;
	JOptionPane.showMessageDialog(null, "The product is " + mul);
	int div = num1/num2;
	JOptionPane.showMessageDialog(null, "The division is " + div);
	double avg = sum/2;
	JOptionPane.showMessageDialog(null,"The average number is " +avg);
	int abs =Math.abs(sub);
	JOptionPane.showMessageDialog(null , "The absolute value is " +abs);
	int max = Math.max(num1, num2);
	JOptionPane.showMessageDialog(null , "The maximum value is " +max);
	int min = Math.min(num2, num1);
	JOptionPane.showMessageDialog(null , "The minimum value is " +min);
	
	  
}
}
