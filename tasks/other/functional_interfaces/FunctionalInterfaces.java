package tasks.other.functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;

@FunctionalInterface
interface NumberCondition {
    boolean test(int number);
}

public class FunctionalInterfaces {
    public static ArrayList<Integer> filterNumbers(ArrayList<Integer> numbers, NumberCondition condition) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (condition.test(numbers.get(i))) {
                result.add(numbers.get(i));
            }
        }
        return result;
    }
}
