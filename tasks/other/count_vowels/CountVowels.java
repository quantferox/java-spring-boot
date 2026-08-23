package tasks.other.count_vowels;

public class CountVowels {
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
