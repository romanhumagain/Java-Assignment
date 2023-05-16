package NewAssign;
import java.util.*;
public class Class {

	public static void main(String[] args) {
		//String to Byte
byte bt = 0;
	Scanner sc = new Scanner(System.in);
	String str1 ;
	System.out.print("Enter a number(BYTE): ");
	str1 = sc.nextLine();
	bt = Byte.parseByte(str1);
	System.out.println("Byte: " +bt);
	
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	
short st = 0;
	
	String str2 ;
	System.out.print("Enter a number(SHORT): ");
	str1 = sc.nextLine();
	st = Short.parseShort(str1);
	System.out.println("Short: " +st);
	
	System.out.println(Short.MAX_VALUE);
	System.out.println(Short.MIN_VALUE);
	
int it = 0;
	
	String str3 ;
	System.out.print("Enter a number(INT): ");
	str3 = sc.nextLine();
	it = Integer.parseInt(str3);
	System.out.println("Int: " +it);
	
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	
long lg = 0;
	String str4 ;
	System.out.print("Enter a number(LONG): ");
	str4 = sc.nextLine();
	lg = Long.parseLong(str4);
	System.out.println("Long: " +lg);
	
	System.out.println(Long.MAX_VALUE);
	System.out.println(Long.MIN_VALUE);
	
float ft = 0;
	
	String str5 ;
	System.out.print("Enter a number(FLOAT): ");
	str5 = sc.nextLine();
	ft = Float.parseFloat(str5);
	System.out.println("Float: " +ft);
	
	System.out.println(Float.MAX_VALUE);
	System.out.println(Float.MIN_VALUE);
	
double db = 0;
	
	String str6 ;
	System.out.print("Enter a number(FLOAT): ");
	str6 = sc.nextLine();
	db = Double.parseDouble(str6);
	System.out.println("Double: " +db);
	
	System.out.println(Double.MAX_VALUE);
	System.out.println(Double.MIN_VALUE);
	
	
	String str7 = new String();
boolean res = false;
	System.out.print("Enter booleam value: ");
	str7 = new Scanner(System.in).nextLine();
	res = Boolean.parseBoolean(str7);
	System.out.println("Boolean: " +res);
	
	String str8 = new String();
char ch;
	System.out.print("Enter character value: ");
	str8 = sc.nextLine();
	ch = str8.charAt(0);
	System.out.println("Character: " +ch);

	
	}

}
