package Assignment;
import java.util.*;
public class Exe24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter R1: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter R2: ");
		double num2 = sc.nextDouble();
		System.out.print("Enter R3: ");
		double num3 = sc.nextDouble();
		
		double mul = num2*num3;
		double add = num2 + num3;
		double div = mul/add;
		double total = div +num1;
		 System.out.println("the total resistane: " +total +" ohm");
		
	}

}
