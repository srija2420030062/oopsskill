package oops_skill;
import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("enter a number: ");{
			int n = sc.nextInt();
			 for (int i = 1; i <= n; i++) {
		            System.out.println("Count: " + i);
		        }

		        sc.close();
			
		 }
	}

}
