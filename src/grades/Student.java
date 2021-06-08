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
    public double getGradeAverage() {
        double x = 0;
        for (double grade : grades) {
            x = x + grade;
        }
        return x / grades.size();
    }

    public static void main(String[] args) {
        Student buddy = new Student("Buddy");
        buddy.addGrade(5);
        buddy.addGrade(10);
        buddy.addGrade(15);
        buddy.addGrade(20);

        System.out.println(buddy.getName());
        System.out.println(buddy.getGradeAverage());
    }
}