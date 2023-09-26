package Little_Complex;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" "); // Split the sentence into words
System.out.println(words);
        // Reverse each word and build the new sentence
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
        	System.out.println(word);
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            System.out.println(reversedWord);
            reversedSentence.append(reversedWord).append(" ");
            System.out.println(reversedSentence);
        }

        System.out.println("Reversed sentence: " + reversedSentence.toString().trim());
    }
}
