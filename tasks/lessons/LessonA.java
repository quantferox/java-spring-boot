//Вам дается ArrayList<Integer>, состоящий из различных чисел. Ваша задача — написать метод, который принимает как сам список, так и "условие". Условия вы будете передавать извне с помощью лямбда-выражений.
//Создайте интерфейс NumberCondition с аннотацией @FunctionalInterface. В нем должен быть метод boolean test(int number);.
//Напишите метод filterNumbers. Этот метод должен пройти по списку с помощью классического цикла for и вернуть новый список, содержащий только те числа, которые прошли проверку условия.
//В методе main, используя Lambda, отфильтруйте и выведите на экран только четные числа, а также только те числа, которые больше 20.
// ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 12, 25, 8, 30, 7, 18));

package tasks.lessons;

import java.util.ArrayList;
import java.util.Arrays;

@FunctionalInterface
interface NumberCondition {
  boolean test(int number);
}

public class LessonA {
  public static ArrayList<Integer> filterNumbers(ArrayList<Integer> numbers, NumberCondition condition) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < numbers.size(); i++) {
      if (condition.test(numbers.get(i))) {
        result.add(numbers.get(i));
      }
    }
    return result;
  }

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(5, 12, 25, 8, 30, 7, 18));
    ArrayList<Integer> evenNumbers = filterNumbers(numbers, number -> number % 2 == 0);
    ArrayList<Integer> greaterThan20 = filterNumbers(numbers, number -> number > 20);

    System.out.println(evenNumbers);
    System.out.println(greaterThan20);
  }
}
