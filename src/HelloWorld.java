
public class HelloWorld {
    public static void main(String[] args) {
//        System.out.print("Hello, World!");
        System.out.println("Hello");
        System.out.println(", World!");
// \n and .println used for separated line

        byte smallNumber = 34;
        System.out.println(smallNumber);

        short notSmallNumber = 30000;

        int num = 4500000;

        long postId = 14;
        System.out.print(postId);

        float decimal = 1.5F;

        double bigDecimal = 45;
        System.out.println(bigDecimal);

        final char SINGLE_LETTER = 'g';

        boolean amILearningJava = true;

        String message = "How's it going?\n Everything \"alright?\"\n\t Java isn't that scary, is it?";
        System.out.println(message);

//        “\n” significa que termina una línea y comienza otra más abajo a partir de ahí.
//
//“\t” significa que hay un espacio (equivale a presionar 'tab” en el teclado).

        int sum = 4 + 5;
        System.out.println(sum);
        int difference = 72 - 19;
        System.out.println(difference);
        int product = 11 * 9;
        System.out.println(product);
        int quotient = product / sum;
        System.out.println(quotient);
        int remainder = difference % sum;
        System.out.println(remainder);
        int whatWillThisBe = -4 * 2;
        System.out.println(whatWillThisBe);

        System.out.println(sum++);
        System.out.println(sum);

        int iAmAnInt = 44;
        long iAmALong = iAmAnInt;
        System.out.println(iAmALong);

        iAmALong = 99;
        iAmAnInt = (int) iAmALong;
        System.out.println(iAmAnInt);

        iAmAnInt = 27;
        double iAMDouble = iAmAnInt;
        System.out.println(iAMDouble);
        iAMDouble = 3.9;
        iAmAnInt = (int) iAMDouble;
        System.out.println(iAmAnInt);

        System.out.println((char) 44);
    }
}


