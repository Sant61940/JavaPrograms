package SimplePrograms;

import java.util.Scanner;

public class NumOfOddEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num ");
		int num = scanner.nextInt();
		int odd =0;
		int even=0;

		while(num>0) {

			int rem = num%10;
			System.out.println(rem);
			if(rem%2==0) {
				even++;
			}
			else {
				odd++;
			}
			
			num=num/10;
		}
		System.out.println("Num of odd is "+odd+" "+"Num of even is "+even);

	}

}
