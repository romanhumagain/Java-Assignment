package Assignment;

import java.util.Scanner;

public class Exe18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int y = input.nextInt();

    int a = y % 19;
    int b = y / 100;
    int c = y % 100;
    int d = b / 4;
    int e = b % 4;
    int g = (8 * b + 13) / 25;
    int h = (19 * a + b - d - g + 15) % 30;
    int j = c / 4;
    int k = c % 4;
    int m = (a + 11 * h) / 319;
    int r = (2 * e + 2 * j - k - h + m + 32) % 7;
    int n = (h - m + r + 90) / 25;
    int p = (h - m + r + n + 19) % 32;

    int month = n;
    String str1 = Integer.toString(month);
    switch(month){
      case 1:
        str1 = "January";
        break;
      case 2:
        str1 = "February";
        break;
      case 3:
        str1 = "March";
        break;
      case 4:
        str1 = "April";
        break;
      case 5:
        str1 = "May";
        break;
      case 6:
        str1 = "June";
        break;
      case 7:
        str1 = "July";
        break;
      case 8:
        str1 = "August";
        break;
      case 9:
       str1 = "September";
        break;
      case 10:
    	  
        str1 = "October";
        break;
      case 11:
        str1 = "November";
        break;
      case 12:
        str1 = "December";
        break;
    }
    System.out.println("Easter Sunday in " + y + " falls on " + str1 + " " + p);
  }
}
