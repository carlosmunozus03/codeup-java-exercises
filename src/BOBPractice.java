import java.util.Scanner;

public class BOBPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Im Bob lets talk");
        String userAnswer = "";
        while (!userAnswer.equalsIgnoreCase("quit")) {
            userAnswer = scanner.nextLine();
            System.out.println("Tell me something");
            if (userAnswer.endsWith("?")) {
                System.out.println("sure");
            } else if (userAnswer.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userAnswer.isEmpty()) {
                System.out.println("Fine. Be that way");
            } else {
                System.out.println("Whatever");
            }
        }

    }
}
