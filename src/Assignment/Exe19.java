package Assignment;
import java.util.*;
public class Exe19 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.print("Total Book Price: ");
int num1 = sc.nextInt();
System.out.print("Number Of Books: ");
int num2 = sc.nextInt();

double per = (7.5*num1)/100;
System.out.println("Required tax (7.5 percent of the total book price) is : "+ "£"+per );
int charge = 2*num2;
System.out.println("Required shipping charge (£2 per book) is: "+"£"+charge);

double total = num1+charge +per;
System.out.println("The required price of the order is: "+"£" +total );
	}

}
