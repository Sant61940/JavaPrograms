package Little_Complex;

import java.util.Scanner;


public class ExpandString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string in the format a1b10: ");
		String input = scanner.nextLine();

		String expandedString = expandString(input);

		System.out.println("Expanded string: " + expandedString);
	}

	private static String expandString(String input) {
		StringBuilder result = new StringBuilder(); // Initialize the result using StringBuilder

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (Character.isLetter(c)) {
				result.append(c); // Append the letter directly
			} else if (Character.isDigit(c)) {
				int num = c - '0'; // Convert the character to its numeric value

				// Append the current letter num times
				for (int j = 0; j < num; j++) {
					result.append(input.charAt(i - 1)); // Append the previous letter
				}
			}
		}

		return result.toString(); // Convert StringBuilder to String and return the expanded string
	}
}
