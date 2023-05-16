package Assignment;
import java.util.*;
public class Exe8 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of gallons of gas in the tank: ");
int num1 = sc.nextInt();	
System.out.print("The fuel efficiency in miles per gallons: ");		
int num2 = sc.nextInt();
System.out.print("The price of gas per gallons: ");
int num3 = sc.nextInt();
 

// 1 gallons provide m1 miles , 1 miles is provided by 1/m1 =(g)1 gallons. so 100 miles is provided by g1*100 gallons
double dl1 =  100/num2; 

// cost per gallons is g2 . cost for dl1 = dl1*300
 int in1 = (int) (dl1*num3);
System.out.println("the requires cost per 100 miles is : " +in1 +" Rupees");
	
	
	int dl2 =num1*num2;
	System.out.println("the car can go with the gas in the tank is " +dl2 +" Miles");
	}

}
