package tasks.other.math_operations;

@FunctionalInterface
interface MathOperation {
    double calculate(double a, double b);
}

public class MathOperations {
    public static double executeMath(double a, double b, MathOperation operation) {
        return operation.calculate(a, b);
    }
}
