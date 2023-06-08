//check whether a number is even or odd using ternary operator 

import java.util.Scanner;

public class ternary {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num;
        num = sc.nextInt();

        String evenodd = (num % 2 == 0) ? "even number" : "odd number";
        System.out.println(num + "" + " is" + " " + evenodd);
    }
}