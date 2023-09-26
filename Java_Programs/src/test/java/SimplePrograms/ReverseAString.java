package SimplePrograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string ");
		String text = scanner.nextLine();
		//String rev ="";

		//1.Using + Concat operator
		/*
		 * int len = text.length();
		 * 
		 * for(int i=len-1;i>=0;i--) { char ch = text.charAt(i); rev = rev+ch; }

		System.out.println("Reversed String is "+rev);*/

		//2. Using character array
		/*
		 * char a[] = text.toCharArray(); int len = a.length; for(int i =
		 * len-1;i>=0;i--) { rev= rev+a[i]; }
		 * System.out.println("Reversed String is "+rev);
		 */
		
		//3. Using StringBufffer Class
		StringBuffer buffer = new StringBuffer(text);
		StringBuffer rev1 =buffer.reverse();
		System.out.println("Reversed String is "+rev1);
		scanner.close();
	}

}
