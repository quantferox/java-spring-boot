package tasks.other.count_vowels;

public class Main {
    public static void main(String[] args) {
        System.out.println(CountVowels.countVowels("Hello World")); // 3
        System.out.println(CountVowels.countVowels("Java"));        // 2
        System.out.println(CountVowels.countVowels(null));          // 0
        System.out.println(CountVowels.countVowels(""));            // 0
    }
}
