//Program to display sum of squares of numbers from 1 to n
package oops_skill;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
        sc.close();
        
    }
}
