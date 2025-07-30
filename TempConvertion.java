//program to convert temperature from celsius to fahreinheit
package oops_skill;
import java.util.Scanner;

public class TempConvertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Celsius: " + c);
        sc.close();
    }
}
