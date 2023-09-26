package SimplePrograms;

import java.util.Scanner;

public class PalindromeText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text ");
		String input = scanner.nextLine();
		String org_string = input;
		String rev ="";
		int len = input.length();
		for (int i = len-1;i>=0;i--) {
			char ch = input.charAt(i);
			rev=rev+ch;
			System.out.println(rev);
		}

		if(org_string.equals(rev)) {
			System.out.println(org_string+" text is a palidrome");
		}
		else
		{
			System.out.println(org_string+" text is not a palindrome");
		}
	}
}
