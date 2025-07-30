package oops_skill;
import java.util.Scanner;
public class WhileExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
			int i = sc.nextInt();
			while(i<=5) {
				System.out.println("i = " + i);
				i++;
				sc.close();
			}
		
	}

}
