/*write a program to generate a user-defind exception called
NegativeageException if user inputs negative value for age*/

package session6_4;

import java.util.Scanner;

public class AgeTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the age of the person ");
		int age = scanner.nextInt();

		// Try catch block to handle exceptions

		try {
			if (age < 18) {
				throw new NegativeAgeException("You are not eligible to vote");
			} else {
				System.out.println("You are eligible to vote");
			}
		} catch (NegativeAgeException e) {
			System.out.println(e);
		}
	}

}