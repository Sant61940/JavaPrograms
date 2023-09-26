package Little_Complex;

import java.util.Scanner;

public class primeFactorCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		scanner.close();

		boolean isPrimeFactorOf235 = true; // Assume it's a prime factor initially

		if (number != 0) {
			// Check if the number is divisible by 2, 3, and 5
			for (int divisor :new int[]{2, 3, 5}) {
				if (number % divisor != 0) {
					isPrimeFactorOf235 = false; // Not a prime factor
					break; // No need to check further
				}
			}
		} else {
			isPrimeFactorOf235 = false; // Zero is not a prime factor of anything
		}

		if (isPrimeFactorOf235) {
			System.out.println(number + " is a prime factor of 2, 3, and 5.");
		} else {
			System.out.println(number + " is not a prime factor of 2, 3, and 5.");
		}
	}
}
