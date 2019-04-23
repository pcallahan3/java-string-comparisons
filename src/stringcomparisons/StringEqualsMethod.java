package stringcomparisons;

import java.util.Scanner;

/*
 * 1.)Declare and initialize a Scanner object
 * 2.)Ask use to enter a word to compare
 * 3.)Declare and initialize a reference variable to the Scanner using the nextLine()
 * 4.)Create a if-else block comparing the entered word using the equals()
 * 
 */
public class StringEqualsMethod {

	public StringEqualsMethod() {
		
	}
	
	public void equalsCompare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to compare:");
		String wordToCompare = sc.nextLine();
		if(wordToCompare.equals("Hello World")) {
			System.out.println("You are in the Hello World block");
		}
		else {
			System.out.println("You are in the else block");
		}
		
	}

}
