package Assignment;
import java.util.*;
public class Exe21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a price: ");
		double prc1 = sc.nextDouble();
	
	int dollars = (int) prc1;
	
	double cents = (int)((prc1-dollars)*100 +0.5);
		
		
		System.out.println("Dollars: " +dollars);
		System.out.println("Cents: " +cents);
		
	}

}
