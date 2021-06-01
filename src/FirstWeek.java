public class FirstWeek {
    public static void main(String[] args) {
        //Hello Word
        System.out.println("Hello world from the new line");
        System.out.print("Hello world from a line \n");

        //Syntax, Type of Data and Variables

        //Primitive  8 DATA

        /* === Numbers
        byte
        short
        int
        long
         */

        /* === Decimals
        float
        double
         */

         /* === Others
        char
        boolean
         */

        //variables
        int id;
        boolean isLoggedIn;
        float bankAccountBalance;

        id = 123;
        isLoggedIn = false;
        bankAccountBalance = 1000.23F;

        int theAnswer;
        String question;

        theAnswer = 42;
        question = "What is your favorite number?";

        // or

        int theAnswer2 = 42;
        String question2 = "What is your favorite number?";

        //Constants

        final int SIDES_OF_A_DICE = 6;

        //Math Operators

        /* === Binary Operators

        +
        -
        *
        /
        %

         */

         /* === Urinary Operators

        ++
        --
        +
        -

         */

        int myNumber = 12 + 12 * 2;

        // Casting

//value of a less precise data type to a variable whose types is of a higher precision

        int myInteger = 900;
        long morePrecise = myInteger;

//from a higher precision type to a lower precision type
        //This is also called a narrowing conversion.

        double pi = 3.14159;
        int almostPi = (int) pi;

        //Exercises

        int myFavoriteNumber = 42;
        String myString = "Your Favorite number is: " + myNumber;
        System.out.println(myFavoriteNumber);
        System.out.println(myString);

        int a = 4;
        a += 5;
        System.out.println(a);

        int b = 3;
        int c = 4;
        b *= c;
        System.out.println(b);

        int d = 10;
        int e = 2;
        d /= e;
        e -= d;
        System.out.println(e);

        // IO

        // Scanner class for get user information
        //sout + tab (print in console)
        //scanner.next(print only first string until space)
        // scanner.nextLine(print all line)

// Declarations, controls, comparison and loops

        //boolean expresion
        //Logic operators || && !=
        //if (numbers)
        //String comparison .equals or .equalsIgnoreCase (comparison a string)
        //.starsWith / endWith (comparison string)
        // Control Structures if() / else switch
        // while / do while / for loop
        //break and continue

        //string methods
        //char charAt(int index)
        //int indexOf(String subString)
        //int lastIndexOf(String subString)
        //int length()
        //String replace(String pattern, String replacement)
        //String substring(int beginIndex[, int endIndex])
        //String toLowerCase() / String toUpperCase() / String trim()



    }
}
