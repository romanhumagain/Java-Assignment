
package Assignment;

import java.util.Scanner;

public class Exe20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a 10-digit phone number: ");
		String phone = sc.nextLine();

		String formattedNumber = "(" + phone.substring(0, 3) + ") " + phone.substring(3, 6) + "-" + phone.substring(6);

		System.out.println("Formatted Phone Number: " + formattedNumber);
	}
}
