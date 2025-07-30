//Program to check whether a given character is an alphabet or not
package oops_skill;
import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println("Alphabet");
        else
            System.out.println("Not an Alphabet");
        sc.close();
    }
}

