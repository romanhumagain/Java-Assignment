package Assignment;
import java.util.*;
public class Exe13 {
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("enter a five digit number: ");
	int numb = sc.nextInt();
	int num1 = numb/100000%10;
	int num2 = numb/10000%10;
	int num3 = numb/1000%10;
	int num4 = numb/100%10;
	int num5 = numb/10%10;
	int num6 = numb%10;
	System.out.println(num1+"," +num2 + "," +num3 +","+num4 +","+num5+"," +num6+",");
}
}
