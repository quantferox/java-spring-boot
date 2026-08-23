package tasks.other.functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 12, 25, 8, 30, 7, 18));

        ArrayList<Integer> evenNumbers = FunctionalInterfaces.filterNumbers(numbers, n -> n % 2 == 0);
        ArrayList<Integer> greaterThan20 = FunctionalInterfaces.filterNumbers(numbers, n -> n > 20);

        System.out.println(evenNumbers);    // [12, 8, 30, 18]
        System.out.println(greaterThan20);  // [25, 30]
    }
}
