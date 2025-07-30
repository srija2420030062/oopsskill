//Program to display sum of digits of a number to a single digit
package oops_skill;
import java.util.Scanner;

public class DigitSumToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        while(num > 9) {
            int sum = 0;
            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        System.out.println("Single digit sum: " + num);
        sc.close();
    }
}



