package tasks.other.math_operations;

public class Main {
    public static void main(String[] args) {
        double sum = MathOperations.executeMath(100, 50, (a, b) -> a + b);
        double multiplication = MathOperations.executeMath(100, 50, (a, b) -> a * b);
        double percent = MathOperations.executeMath(100, 50, (a, b) -> (b / a) * 100);

        System.out.println(sum);            // 150.0
        System.out.println(multiplication); // 5000.0
        System.out.println(percent);        // 50.0
    }
}
