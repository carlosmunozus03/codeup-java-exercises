import java.util.Locale;
import java.util.Scanner;

public class MethodsExercises {
    //1.-
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {
        getInteger(1, 10);
        factorial(1, 10);
    }

    public static int getInteger(int min, int max) {
        int num = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ": ");

        for (; true; ) {
            int userNum = scanner.nextInt();
            if (userNum < min || userNum > max) {
                System.out.println("Please enter a number between " + min + " and " + max + "\n");

            } else {
                System.out.println("Thank you for your number!\n");
                break;
            }
        }
        return num;
    }

    public static int factorial(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int ghost = 12;
        System.out.println("Enter a number between 1 and 10 \n");
        int userNum = scanner.nextInt();
        int factorial = 1;
        System.out.println("Your number is: " + userNum);
        System.out.println("Do you want to  continue?\n Answer yes or not");
        String userAnswer = scanner.next().toLowerCase(Locale.ROOT);
        if (userAnswer.equals("yes")) {
            for (int i = 1; i <= userNum; i++) {
                if (userNum < min | userNum > max) {
                    System.out.println("\nEnter a number between 1 and 10 \n");
                } else {
                    factorial = factorial * i;
                    if (i == userNum) {
                        System.out.println(userNum + "!" + factorial);
                    } else {
                        System.out.println(userNum + "!" + factorial);
                    }
                }
            }
        } else {
            System.out.println("Have a great day!");
        }
        return ghost;
    }

}





