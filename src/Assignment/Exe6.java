package Assignment;
import javax.swing.*;
public class Exe6 {

	public static void main(String [] args) {
	String str1 =	JOptionPane.showInputDialog("Enter the value of radius");
	int num1 =Integer.parseInt(str1);
	
	double num2 =  Math.pow(num1, 2);
	double num3 = 3.14159;
	double num4 = Math.pow(num1, 3);
	double area = num3*num2;
	System.out.println("The required AREA is " +area);
	
	double circumference = 2*(num3*num1);
	System.out.println("The required CIRCUMFERENCE is " +circumference);
	
	double volume =1.3333*num3*num4; 
	System.out.println("The required VOLUME is " +volume);
	
	double surface = 4*num3*num2;
	System.out.println("The required Surface Area is " +surface);
	}
}
