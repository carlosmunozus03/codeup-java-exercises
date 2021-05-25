import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5) {
//            System.out.println("Hey user. If you are reading this, it means x is 5");
//        }
//        System.out.println("On the other hans, this says nothing about x, because it runs regardless of what x is");
        int y = 2;
        if (y == 2) {
            System.out.println("I've carried out a conditional test and i can confirm that the statement y==2 is " +
                    "true");
        } else {
            System.out.println("I've tested to see if y==2 is true, and it is not. It is false");
        }
        short z = -5;
        if (z < 0) {
            System.out.println("The variable z contains a negative number value");
        } else if (z >= 0 && z < 30000) {
            System.out.println("The variable z contains a positive number value");
        } else {
            System.out.println("The variable z contains a numeric value thats is dangerously close to the max value " +
                    "for short type variable, eich is: " + Short.MAX_VALUE);
        }

        //Switch statement
        String customerChoice;
        customerChoice = "chocolate";
        switch (customerChoice) {
            case "vanilla":
                System.out.println("One vanilla coming right up");
                break;
            case "chocolate":
                System.out.println("chocolate coming right up");
                break;
            case "strawberry":
                System.out.println("strawberry coming up");
                break;
            default:
                System.out.println("we haven't that! go away!");
                break;
        }

        //Operators

        int c = 0, d = 100, e = 50;
        // short circuit operator
        if (c == 1 && e < 100) {
            //do something
        }
        System.out.println("e = " + e);
        if (c == 0 && e++ < 100) {
            //do something
            d = 150;
        }
        System.out.println("e = " + e);
        if (c == 1 & e++ < 100) {
            //do something
        }
        System.out.println("e = " + e);

        // booleans
        boolean existence = true;
        boolean solipsism = false;
        boolean weAllLiveInSomeElsesDream = false;
        boolean thisDeskIsRealNotAProjectionOfMyMind = false;
        if (thisDeskIsRealNotAProjectionOfMyMind | weAllLiveInSomeElsesDream) {
            System.out.println("common sense is victorious");
        } else {
            System.out.println("Im really confused now");
        }
        if (solipsism || weAllLiveInSomeElsesDream) {
            System.out.println("common sense is victorious");
        } else {
            System.out.println("Im really confused now");
        }
        //comparison operator ==
        //there is not strict equality operator
        //inequality !=
        //there is no strict inequality don't do this !==

        String myName = "Javier";
        String anotherJavier = "Javier";
        String javier = new String("Javier");

        System.out.println(myName == anotherJavier);
        System.out.println(myName == javier);

//Scanner scanner = newScanner(System.in) Whit this you can interactive with the keyboard

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String userInput = scanner.next();
//        if (userInput == myName) {
//            System.out.println("Hello, me");
//        } else {
//            System.out.println("You are not me");
//        }
        //Use .equals
        if (userInput.equals(myName)) {
            System.out.println("Hello, me");
        } else {
            System.out.println("You are not me");
        }
//        Loops

//        int i = 1;
//        while (i < 10) {
//            System.out.println("Now I'm in the Loop. I has not incremented yet and its value is: " + i);
//            // i++ is short hand for i = i + 1
//            i++;
//            System.out.println("I'm still in the Loop, but i has incremented now, and its value is: " + i);
//        }
//        System.out.println("This is outside the Loop, after it has executed. The conditional has tested false. The " +
//                "value of i is now: " + i);

//        for (int i = 0; i < 10; i++) {
//            System.out.println("Now I'm in the Loop. I has not incremented yet and its value is: " + i);
//        }
        for (int i = 100; i > 0; i--) {
            String word = "cans";
            if (i == 1) {
                System.out.println(i + " can of Big Red on the wall");
                System.out.println(i + " can of Big Red");
            } else if (i == 0) {
                System.out.println("No more cans of big red on the wall");
            } else {
                System.out.println(i + " cans of Big Red on the wall");
                System.out.println(i + " cans of Big Red");
                System.out.println("Take one down, pass it around ");
            }

        }
    }
}
