//public class Person {
//    // instance variables
//    private String name;
//    private String email;
//    private String phoneNumber;
//
//    // constructor: construct a Person copying in the data into the instance variables
//    public Person(String initName, String initEmail, String initPhone) {
//        name = initName;
//        email = initEmail;
//        phoneNumber = initPhone;
//    }
//
//    // Print all the data for a person
//    public void print() {
//        System.out.println("Name: " + name);
//        System.out.println("Email: " + email);
//        System.out.println("Phone Number: " + phoneNumber);
//    }
//
//    // main method for testing
//    public static void main(String[] args) {
//        // call the constructor to create a new person
//        Person p1 = new Person("Carlos", "carlos@gmail.com", "333-444-5555");
//        // call p1's print method
//        p1.print();
//        Person p2 = new Person("Javier", "javier@gmail.com", "111-222-6677");
//        p2.print();
//    }
//}

public class Person {
    private String name;


    public String getName() {
//TODO: return the person's name
        return String.format(name);
    }

    public void setName(String name) {
//TODO: change the name property to the passed value
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
    }
}