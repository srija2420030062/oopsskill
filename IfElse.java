package oops_skill;

import java.util.Scanner;
public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = sc.nextInt();
		if(input%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
			sc.close();
		}
	}
	

}
