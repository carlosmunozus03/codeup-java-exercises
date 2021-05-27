import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello User Im Bob the IA, you want to talk with me");
        String response = "";
        while (!response.equalsIgnoreCase("QUIT")) {
            System.out.println("What do you want");
            response = sc.nextLine();
            if (response.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (response.endsWith("?")) {
                System.out.println("Sure");
            } else if (response.endsWith("!")) {
                System.out.println("Wow, chill out");
            } else if (response.equalsIgnoreCase("quit")) {
                System.out.println("Finally...");
            } else {
                System.out.println("Whatever.");
            }
        }
        System.out.println("Im out of here...");
    }
}

