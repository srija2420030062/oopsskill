//program using switch case
package oops_skill;
import java.util.Scanner;
public class Switchcase {
	public static void main (String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a day: ");
int day = sc.nextInt();
switch (day) {
  case 1: System.out.println("Monday"); break;
  case 2: System.out.println("Tuesday"); break;
  case 3: System.out.println("Wednesday"); break;
  case 4: System.out.println("Thursday"); break;
  default: System.out.println("Other day");
  sc.close();
}

		
	
	}

}
