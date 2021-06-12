import javax.swing.*;
import java.util.Scanner;

public class CEPractice {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %3.2f%n", pi);
//
//        // Enter a integer number
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a Integer number");
//        int userInput = scanner.nextInt();
//        System.out.println("You enter the number: " + userInput);
//
//        // Enter 3 words
//        System.out.println("Enter a word");
//        String firstWord = scanner.next();
//        System.out.println("Enter a second word");
//        String secondWord = scanner.next();
//        System.out.println("Enter the last word");
//        String lastWord = scanner.next();
//        System.out.format("You first word was: %s%nYour second word was: %s%nYou last word was: %s%n", firstWord, secondWord, lastWord);
//
//        // or i can show that
//        System.out.println("----------");
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(lastWord);
//
//        // Enter a sentence
//        System.out.println("Enter a sentence");
//        scanner.nextLine(); // use this for fix the nextLine problem...
//        String userSentence = scanner.nextLine();
//        System.out.format("You sentence is: %s%n", userSentence);

        //Calculate the perimeter and area of Codeup's classrooms.

        System.out.println("Enter a rectangle length value");
        int userLength = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a rectangle width value");
        int userWidth = Integer.parseInt(scanner.nextLine());
        System.out.println("Length: " + userLength);
        System.out.println("Width: " + userWidth);
        System.out.println("\nArea: " + userLength * userWidth);
        System.out.println("Perimeter: " + (2 * userLength) + (2 * userWidth));

    }
}
