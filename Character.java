
// check whether a character is alphabet or not 
import java.util.Scanner;

public class Character {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " " + "is a aplhabet character");
        else
            System.out.println(ch + " " + "is not an alphabet character");
    }
}