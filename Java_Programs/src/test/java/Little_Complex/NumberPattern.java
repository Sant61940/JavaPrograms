package Little_Complex;

import java.util.Scanner;

public class NumberPattern {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("Enter the number of rows/columns: ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n - i; space++) {
				System.out.print("  "); // Print spaces
			}

			int num = (i - 1) * n + 1; // Calculate starting number for each row
			for (int j = 1; j <= n; j++) {
				System.out.print(num + " ");
				num++;
			}

			System.out.println(); // Move to the next line
		}
	}
}
