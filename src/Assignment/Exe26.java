package Assignment;
import java.util.*;
public class Exe26 {
	 public static void main(String args[]) {
	       
	        Scanner input = new Scanner(System.in);

	        System.out.print("Value of Thermistor Resistance:");
	        double R = input.nextDouble();

	        double R0 = 1075;
	        double T0 = 85+273;
	        double B = 3969;
	        double e = 2.718;

	        double div = (R/R0);
	        double ln = Math.log(div);

	        double T = (((B*T0)/((T0*ln)+B))-273);

	        System.out.println("The required Liquid Temperature in Celsius: "+T);


	    }
}