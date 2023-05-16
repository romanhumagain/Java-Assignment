package Assignment;
import java.util.*;
public class Exe11{
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String number;
    String postfix;
    String prefix;
    
    System.out.print("Enter a number between 1000 and 999999: ");
    number = input.next();
    
    input.close();
    
    postfix = number.substring(number.length() - 3);
    prefix = number.substring(0, number.length() - 3);
    
    System.out.println(prefix + "," + postfix);
}
}