package SimplePrograms;

import java.util.Scanner;

public class PrimeNumOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num ");
		int num = scanner.nextInt();
		int count=0;

		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(num+" is prime number");
			}
			else
			{
				System.out.println(num+" is not a prime number");	
			}
		}
		else
		{
			System.out.println(num+" is not a prime number");	
		}
	}

}
