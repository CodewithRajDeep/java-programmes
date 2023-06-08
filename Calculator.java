// simple calculator using java switch statement 

import java.util.Scanner;

public class Calculator {
    public static void main(String arg[]) {
        char operator;
        double num1, num2, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Choose your operation : +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        num1 = input.nextDouble();

        System.out.println("Enter the second number");
        num2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println("The result is" + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The result is" + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("The result is" + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println("The result is" + result);
                break;

            default:
                System.out.println("Invalid operation");
        }
        input.close();
    }

}
