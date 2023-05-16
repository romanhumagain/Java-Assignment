package NewAssign;
import java.util.*;
public class Class2 {
public static void main(String []args) {
	
Scanner sc = new Scanner(System.in);
	
System.out.print("Enter a Number(Integer): ");
int num1 ;
num1 = sc.nextInt();
	//converting integer to string we use toString() method
String str1 = Integer.toString(num1);
System.out.println("String str1 = " + str1);
	
System.out.print("Enter a Number(Byte): ");
byte num2 ;
num2 =  sc.nextByte();
		
String str2 = Byte.toString(num2);
System.out.println("String str2 = " + str2);	 
		 
		 
System.out.print("Enter a Number(long): "); 
long num3 ;
num3 = sc.nextLong();
String str3 = Long.toString(num3);
System.out.println("String str3 = " + str3);	
			 
System.out.print("Enter a Number(Short): ");
short num4 ;
num4 = sc.nextShort();
String str4 = Short.toString(num4);
System.out.println("String str4 = " + str4);
				 
System.out.print("Enter a Number(float): ");
float num5 ;
num5 = sc.nextFloat();
String str5 = Float.toString(num5);
System.out.println("String str5 = " + str5);
					 								 
System.out.print("Enter a Number(Double): ");
double num6 ;
num6 = sc.nextDouble();
String str6 = Double.toString(num6);
System.out.println("String str6 = " + str6);
						 
System.out.print("Enter a Boolean value: ");
boolean res ;
res = sc.nextBoolean();
String str7 = Boolean.toString(res);
System.out.println("String str7 = " + str7);
					 
}
}
