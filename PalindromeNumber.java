//Program to check for a Palindrome number
package oops_skill;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int rev = 0, temp = num;
        while(temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if(rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
        sc.close();
    }
}

