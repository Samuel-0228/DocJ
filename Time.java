/* 3.	Write a function that takes the time as three integer arguments, days, hours, and minutes, and
 returns the number of minutes since the start of the current month, 
 i.e., days=0; hours=0 and months=0; Use this function to calculate 
 the amount of time in minutes between two times, both of
  which are within the same calendar month. */

import java.util.Scanner;

public class Time {

    static int Min(int days, int hrs, int min) {
        int minutes = 24 * 60 * days + 60 * hrs + min;
        return minutes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first time (days, hours, minutes): ");
        int days1 = sc.nextInt();
        int hrs1 = sc.nextInt();
        int min1 = sc.nextInt();
        System.out.println("Enter the second time (days, hours, minutes): ");
        int days2 = sc.nextInt();
        int hrs2 = sc.nextInt();
        int min2 = sc.nextInt();
        int time1 = Min(days1, hrs1, min1);
        int time2 = Min(days2, hrs2, min2);
        int diff = time2 - time1;
        System.out.println(time1);
        System.out.println(time2);
        System.out.println("The difference in minutes is: " + diff);
    }

}
