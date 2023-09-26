package SimplePrograms;

import java.util.Scanner;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num ");
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		System.out.println("A is "+A+" B is "+B+" C is "+C);

		/*
		 * if(A>B&&A>C) { System.out.println("A is largest "+A); } else if(B>A&&B>C) {
		 * System.out.println("B is largest "+B); } else {
		 * System.out.println("C is largest "+C); }
		 */
		int large = A>B?A:B;
		int large1 = C>large?C:large;

		System.out.println(large1);
	}

}
