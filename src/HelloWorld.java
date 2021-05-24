
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

        //exercise

        int myFavoriteNumber = 23;
        System.out.println(myFavoriteNumber);

        String myString = "Hello World From Java!";
        System.out.println(myString);
//=== ERRORS
//        char myStringChar = "This is a character from myString in Java!";
//        myString = 3.14159;
//        long myNumber;
//        System.out.println(myNumber);
//        long myNumber = 3.14;
        long myNumber = 123L;
        System.out.println(myNumber);

        long myNUmber123 = 123;
        System.out.println(myNUmber123);

//        float myFloatNumber = 3.14;
//        System.out.println(myFloatNumber);

        //2 ways for print this
        float myNumberF = 3.14F;
        System.out.println(myNumberF);

        double myNumberD = 3.14;
        System.out.println(myNumberD);

        // post increment
        int x = 5;
        System.out.println(x++); // 5
        System.out.println(x); // 6

        //pre increment
        int y = 5;
        System.out.println(++y); // 6
        System.out.println(y); // 6

//        var class;

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o; // error  cannot be cast to class
//        int three = (int) "three"; // error incompatible type

        int myX = 4;
        myX = myX + 5;
        System.out.println(myX); // 9

        int myx = 3;
        int myy = 4;
        myy = myy * myx;
        System.out.println(myy); // 12

        int myxx = 10;
        int myyy = 2;
        myxx = myxx / myyy;
        myyy = myyy - myxx;
        System.out.println(myyy); // -3

//        Integer.MAX_VALUE;

    }
}


