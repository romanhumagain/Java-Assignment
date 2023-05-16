package Assignment;
import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first time in military format (HHMM): ");
        int time1 = sc.nextInt();
        
        System.out.print("Enter second time in military format (HHMM): ");
        int time2 = sc.nextInt();
        
        int diffMinutes = (time2 - time1 + 1440) % 1440;
        int diffHours = diffMinutes / 60;
        diffMinutes %= 60;
        
        System.out.println("Difference in time is " + diffHours + " hours and " + diffMinutes + " minutes");
    }
}
