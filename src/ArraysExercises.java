//public class ArraysExercises {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//
//        String[] Person = new String[3];
//
//        Person[0] = "Greg";
//        Person[1] = "Jim";
//        Person[2] = "Geoff";
//    }
//
//}

import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] array, Person newPerson) {
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson; // Also works: people[people.length - 1]
        return people;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("Dorothy");
        people[1] = new Person("Rose");
        people[2] = new Person("Blanche");
        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~");
        Person sophia = new Person("Sophia");
        people = addPerson(people, sophia);
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}