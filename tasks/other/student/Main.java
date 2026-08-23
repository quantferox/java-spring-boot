package tasks.other.student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Student1", 8));
        students.add(new Student("Student2", 19));
        students.add(new Student("Student3", 27));
        students.add(new Student("Student4", 36));
        students.add(new Student("Student5", 48));
        students.add(new Student("Student6", 69));
        students.add(new Student("Student7", 100));
        Collections.sort(students);
        System.out.println(students);
    }
}
