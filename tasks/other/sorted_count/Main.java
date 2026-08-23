package tasks.other.sorted_count;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 9, 2, 7);
        numbers.stream().sorted((n1, n2) -> n1 - n2).forEach(System.out::println);
        System.out.println(numbers.stream().filter(num -> num > 5).count());
    }
}
