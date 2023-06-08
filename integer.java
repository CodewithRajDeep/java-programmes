// WAP to print an integer entered by an user 

import java.util.Scanner;

public class integer {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");

        int number;

        number = sc.nextInt();

        System.out.println("User entered number" + number);
    }
}