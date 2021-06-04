
public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.print(", World!\n");

        // Syntax, Variables, and Data Types
        String geoff = "Geoff";
        System.out.println("Line 8: " + geoff);

        // 12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        System.out.println(o);
//        int three = (int) o; // This throws an issue

        // 9

//        float myNumber = 3.14F;
        float myNumber = (float) 3.14;
        System.out.println(myNumber);

        int myFavoriteNumber = 21;
        System.out.println(myFavoriteNumber);
        String myString = "Hello honey I'm here!";
        System.out.println(myString);
        float myNumberF = 3.14F;
        System.out.println(myNumberF);
        double myNumberD = 3.14;
        System.out.println(myNumberD);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        short red = Short.MAX_VALUE;
        System.out.println(red);
    }
}
