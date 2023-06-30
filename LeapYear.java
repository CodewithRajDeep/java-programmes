//WAP to calculate leap year 

import java.util.Scanner;

public class LeapYear {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        boolean leap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            leap = true;

        } else
            leap = false;

        if (leap) {
            System.out.println(year + "is leap year");
        } else
            System.out.println(year + "is not a leap year");
    }
}