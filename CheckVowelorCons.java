//Program to check whether a given character is a vowel or a consonant
package oops_skill;
import java.util.Scanner;
public class CheckVowelorCons {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter character: ");
	        char ch = sc.next().toLowerCase().charAt(0);
	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	            System.out.println("Vowel");
	        else if(Character.isLetter(ch))
	            System.out.println("Consonant");
	        else
	            System.out.println("Not a valid letter");
	        sc.close();
	    }
	}


