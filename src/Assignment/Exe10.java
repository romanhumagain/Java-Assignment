package Assignment;

import java.util.Scanner;

public class Exe10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number between 1,000 and 999,999: ");
    String input = scan.next();
    String output = input.replace(",", "");
    System.out.println("The number without a comma: " + output);
  }
}