package SimplePrograms;

import java.util.Scanner;

public class CountNumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num ");
		int num = scanner.nextInt();
		int count =0;

		while(num>0) {
			num =num/10;
			count++;
		}
		System.out.println("Count of numbers is "+count);
	}

}
