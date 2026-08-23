package tasks.other.second_max;

public class SecondMax {
    public static int findSecondMax(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number != max) {
                secondMax = number;
            }
        }
        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
    }

    public static int length(String value) {
        return value == null ? 0 : value.length();
    }

    public static int countVowels(String value) {
        if (value == null) {
            return 0;
        }
        int count = 0;
        value = value.toLowerCase();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
