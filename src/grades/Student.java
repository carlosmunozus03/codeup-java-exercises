package grades;

import java.util.ArrayList;

public class Student {
    //Properties
    private String studentName;
    private ArrayList<Integer> grades = new ArrayList<>();

    // constructor
    Student(String name) {
        this.studentName = name;

    }

    // returns the student's name
    public String getName() {
        return studentName;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);

    }

    // returns the average of the students grades
    public int getGradeAverage() {
        int x = 0;
        for (int number : grades) {
            x = x + number;
        }
        return x / grades.size();
    }

    public static void main(String[] args) {
        Student test = new Student("Buddy");
        test.addGrade(5);
        test.addGrade(10);
        test.addGrade(15);

        System.out.println(test.getName());
        System.out.println(test.getGradeAverage());
    }
}