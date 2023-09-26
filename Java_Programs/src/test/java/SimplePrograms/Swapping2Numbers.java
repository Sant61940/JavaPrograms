package SimplePrograms;

public class Swapping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b =20;
		System.out.println("Before swapping a is "+a+" b is "+ b );

		//logic1 third variable

		int temp =a ;
		a=b;
		b=temp;
		System.out.println("After swapping a is "+a+" b is "+ b );

		//logic 2 using - and +
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a is "+a+" b is "+ b );

		//logic3 without third variable
		a=a*b;	//10*20=200
		b=a/b;	//200/20=10
		a=a/b;	//200/10=20
		System.out.println("After swapping a is "+a+" b is "+ b );

		//logic4  bitwise XOR(^)

		a= a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping a is "+a+" b is "+ b );


		//logic5 single statement
		//a=10,b=20

		a=a+b-(a=b);
		System.out.println("After swapping a is "+a+" b is "+ b );

	}

}
