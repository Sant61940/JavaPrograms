package SimplePrograms;

import java.util.Random;

public class GenerateRandomStringAndNums {

	public static void main(String[] args) {

		//1. Using Random
		/*
		 * Random random = new Random(); int num = random.nextInt(999); double num1 =
		 * random.nextDouble(); System.out.println(num); System.out.println(num1);
		 */
		
		//2. Math(only decimal numbers)
		/* System.out.println(Math.random()); */

		//3. Random String
		int length = 10; // Length of the random string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        // You can customize the characters as per your requirements

        StringBuilder randomString = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            randomString.append(randomChar);
        }

        System.out.println("Random String: " + randomString.toString());
		
	}

}
