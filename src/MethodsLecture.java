public class MethodsLecture {
    //write functions here

    public static void sayHello() {
        System.out.println("Sorry i'm rush. Have a great day!");
    }

    public static void sayHello(String name) {
        System.out.printf("Hi there! My name is %s! Have a great day!", name);
    }

    public static void sayHello(String salutation, String name) {
        System.out.printf("%s Hi there! My name is %s! Have a great day!", salutation, name);
    }

    public static void sayHello(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("Hello darling");
        }
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }


    public static void main(String[] args) {
        // call the function here

        sayHello("Carlos");
        System.out.println(multiply(5, 2));
        int product = multiply(7, 3);
        System.out.printf("Did you know that %d x %d = 's %d \n", product, product, product * product);
        sayHello("Charlotte", "Carlos \n");
        sayHello();
        sayHello(4);
    }
}
