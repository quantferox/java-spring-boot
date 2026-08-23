package tasks.other.student;

public class Student implements Comparable<Student> {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public double getScore() {
        return this.score;
    }

    @Override
    public int compareTo(Student student) {
        return Double.compare(student.score, this.score);
    }

    @Override
    public String toString() {
        return this.name + "-" + this.score;
    }
}
