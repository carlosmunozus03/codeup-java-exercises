import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //5 to 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(" " + i);
//            i++;
//        }
        //2 to 100
//        int i = 0;
//        do {
//            System.out.println(i);
//            i +=2;
//        } while (i < 10);
        //100 to -10
//        int i = 5;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
        //2 to 1.000.000
//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 256);
        //for loop refactor last exercises
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(" " + i);
//        }
//        for (int i = 2; i <= 256; i *= i) {
//            System.out.println(i);
//        }
        //FizzBuzz test
//        int num = 100;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(" " + i);
//            }
//        }
        // power table
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int userNum = scanner.nextInt();
        System.out.println("your number was: " + userNum);

    }
}
