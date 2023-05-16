package Assignment;
import javax.swing.*;
public class Exe5 {
 	public static void main(String [] args) {
String str1 =JOptionPane.showInputDialog("Enter a length in meters");

int num1 = Integer.parseInt(str1);

double num2 = 0.000621371;  //miles
double num3 = 3.28084;     //feet
double num4 = 39.3701;    //inches

double miles = num1*num2;
JOptionPane.showMessageDialog(null, miles +" miles");
double feet = num1*num3;
JOptionPane.showMessageDialog(null, feet +" feet");
double inches = num1*num4;
JOptionPane.showMessageDialog(null, inches +" inches");
}
}
