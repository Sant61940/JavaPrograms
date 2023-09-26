package SimplePrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num = scanner.nextInt();

		//1.Using Algorithm
		/*
		 * int rev =0; while(num!=0) { rev = rev*10+num%10; num = num/10; }
		 * System.out.println("Reversed number is "+rev);
		 */

		//2.Using StringBuffer
		/*
		 * StringBuffer buffer = new StringBuffer(String.valueOf(num)); StringBuffer rev
		 * = buffer.reverse(); System.out.println("Reversed number is "+rev);
		 */

		//3. Using StringBuilder
		StringBuilder builder = new StringBuilder();
		builder.append(num);
		StringBuilder rev = builder.reverse();
		System.out.println("Reversed number is "+rev);
		scanner.close();
	}

}
