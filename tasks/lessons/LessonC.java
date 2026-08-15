//Мы напишем калькулятор, способный выполнять различные математические операции над двумя числами.
//Создайте интерфейс MathOperation с аннотацией @FunctionalInterface. В нем должен быть метод double calculate(double a, double b);.
//Напишите метод executeMath, который принимает два числа и MathOperation, а затем возвращает результат.
//В методе main через этот интерфейс выполните 3 разные операции (Сложение, Умножение и нахождение процента второго числа от первого).

package tasks.lessons;

@FunctionalInterface
interface MathOperation {
  double calculate(double a, double b);
}

public class LessonC {
  public static double executeMath(double a, double b, MathOperation operation) {
    return operation.calculate(a, b);
  }

  public static void main(String[] args) {
    double sum = executeMath(100, 50, (a, b) -> a + b);
    double multiplication = executeMath(100, 50, (a, b) -> a * b);
    double percent = executeMath(100, 50, (a, b) -> (b / a) * 100);
    System.out.println(sum);
    System.out.println(multiplication);
    System.out.println(percent);
  }
}
