//to calculate the sum of natural numbers 

import java.util.*;

public class Sum {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        n = sc.nextInt();
        System.out.println("user entered number" + n);
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum + "sum of the natural numbers");
    }
}

// same program in while loop

/**
 * import java.util.*;
 * public class sum{
 * public static void main(String arg[]){
 * Scanner sc = new Scanner(System.in);
 * int num=sc.nextInt(),i,sum=0;
 * while(i<=num){
 * sum+=i;
 * i++;
 * }
 * System.out.println(sum + "is the sum of natural numbers");
 * 
 * }
 * }
 */

 // same program using recursion functions
/**
 * 
 * sum of natural numbers using recursion
 * 
 * import java.util.Scannner;
 * public class Sum{
 * public static void main(String arg[])
 * {
 * Scanner sc = new Scanner(System.in);
 * int num = sc.nextInt(), sum=0, s=num-1;
 * 
 * for (int i=1; i<=num; i++){
 * if (num!=0)
 * {
 * sum = num+s;
 * System.out.println(sum+"is the sum of natural numbers")
 * }
 * else
 * return num;
 * }
 * }
 * }
 */