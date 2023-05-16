package Assignment;
import java.util.Scanner;
public class Exe7 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the cost of new car: ");
int a = Integer.parseInt(new Scanner(System.in).nextLine());	
  int d = 15000;
System.out.println("Miles per year is " +d );
int f = d*5;// for 5 year

System.out.println("Miles for 5 year is " +f);
System.out.print("Enter the estimated petrol price: ");
int b = sc.nextInt();
	
System.out.print("Enter the efficiency in miles per gallon: ");
	
	int c = sc.nextInt();
	
	System.out.print("Enter the estimated resale value after 5 years: ");
	 int e = sc.nextInt();
	 
	 
	// 1 gallons gives m1 miles then 1 miles is given by 1/m1 =g1 gallons
	 //car run 75,000 miles in 5 year, which takes g1*15,000 gallons of petrol
	 double dbl1 = f/c;
	 
	 
	System.out.println("Car takes " +dbl1 +" gallons per year");
	//let cost per gallons of petrol is 100, for dbl1 gallons it takes dbl*100
	double dbl2 = dbl1*b;
	System.out.println("The car required " +dbl2 +" Rupees of petrol in 5 year");
	
	double dbl3 = a+dbl2; 
	System.out.println("The Required Cost For Owning A Car For 5 year is " +dbl3 +"  Rupees");
	
	}

}

