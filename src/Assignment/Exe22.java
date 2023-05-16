package Assignment;
import java.util.*;
public class Exe22 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print(" Enter Intitial Balance: ");
	double balance = sc.nextDouble();
	System.out.print(" Enter Annual Interest Rate (%): ");
	double y_rate = sc.nextDouble();
	
	
	double y_int = y_rate;
	double m_interest =y_rate / 12 / 100;
	
	
	double month1= balance + balance*m_interest;
		 double month2 = month1 + month1*m_interest;
		 double month3 = month2 + month2*m_interest;
	 System.out.println("Balance after first month: " + month1);
	 System.out.println("Balance after second month: " + month2);
	 System.out.println("Balance after third month: " + month3);

	}

}
