package tasks.other.second_max;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 7, 9, 4, 3};
        System.out.println("Second max: " + SecondMax.findSecondMax(numbers)); // 7

        System.out.println("Length(null): " + SecondMax.length(null));         // 0
        System.out.println("Length(\"hello\"): " + SecondMax.length("hello")); // 5

        System.out.println("Vowels(\"Hello World\"): " + SecondMax.countVowels("Hello World")); // 3
        System.out.println("Vowels(null): " + SecondMax.countVowels(null));                     // 0
    }
}
