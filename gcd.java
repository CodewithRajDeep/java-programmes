// find gcd of two numbers 

public class gcd {
    public static void main(String arg[]) {
        int num1 = 10, num2 = 10, gcd = 0;
        for (int i = 1; i <= num1; i++) {
            for (i = 1; i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0)
                    gcd = i;

            }
        }
        System.out.println("gcd of num1 and of num2 is" +  gcd);
    }
}