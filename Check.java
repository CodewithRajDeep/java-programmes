//check whether number is positive or negative 

import java.util.Scanner;

public class Check {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num < 0)
            System.out.println(num + "is a Negative number");
        else if (num >= 0)
            System.out.println(num + "is a Positive number");
        else
            System.out.println(num + "is a Default number");

    }
}
