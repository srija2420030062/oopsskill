//program to check whether the num is pos , neg or zero
package oops_skill;

import java.util.Scanner;

public class PosNegZero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    if (num > 0)
      System.out.println("Positive number");
    else if (num < 0)
      System.out.println("Negative number");
    else
      System.out.println("Zero");
    sc.close();
  }
}

