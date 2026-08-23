package tasks.other.even_filter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 19, 24, 3, 10);
        List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(evenNumbers);
    }
}
