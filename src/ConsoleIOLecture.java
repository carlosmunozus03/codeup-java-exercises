
import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String name = "Eduardo";
        System.out.printf("Hello, %s%n", name);

        System.out.format("%d is %s's favorite number%nThis is a %b statement%n", 42, name, false);
        System.out.println("I'm on a new line.");

        System.out.println("Hello, " + name);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey friend-o, how's it going?");
        String userInput = scanner.nextLine();

        System.out.printf("You're feeling: %s%n", userInput);

        System.out.println("Give me a number.");
        int num = scanner.nextInt();

        System.out.printf("Your number: %d%n", num);

//exercise

        System.out.println("Hello user! Give me a NO decimal number");
        int userNum = scanner.nextInt();
        System.out.println("You number is : " + userNum);

        System.out.println("Please enter the first word please");
        String firstWord = scanner.next();
        System.out.println("please enter the second word");
        String secondWord = scanner.next();
        System.out.println("Finally, please enter the last word");
        String lastWord = scanner.next();
        System.out.println("yours words are\n " + firstWord + "\n " + secondWord + "\n " + lastWord + "\n");

        System.out.println("Now, enter a sentence please");
        scanner.nextLine();

        String userSentence = scanner.nextLine();
        System.out.println("Your sentence was: " + userSentence);

        System.out.println("Enter a height value");
        int height = scanner.nextInt();
        System.out.println("enter a width value");
        int width = scanner.nextInt();
        int perimeter = height * 2 + width * 2;
        int area = height * width;
        System.out.println("The perimeter is: " + perimeter + " and the area is: " + area);
    }
}