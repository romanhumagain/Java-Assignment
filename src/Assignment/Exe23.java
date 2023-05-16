package Assignment;
import java.util.*;

import javax.swing.JOptionPane;


public class Exe23 {
	public static int CalculateDiscount(int rental , int referal) {
	int discount = rental+referal;
	return Math.min(discount, 75);
	
	}
	
	
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		String str1 = JOptionPane.showInputDialog("enter a number of movie rental: ");
        int rental = Integer.parseInt(str1);
        String str2 = JOptionPane.showInputDialog("enter the number of referal: ");
        int referal = Integer.parseInt(str2);
		 int discount =CalculateDiscount( rental ,  referal);
        
        System.out.println("Required Discount: " +discount +"%");
	}
	
}
