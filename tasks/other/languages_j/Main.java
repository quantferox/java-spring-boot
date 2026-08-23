package tasks.other.languages_j;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> programmingLanguages = Arrays.asList("Java", "Python", "JavaScript", "C++", "C#");
        programmingLanguages.stream()
                .filter(programmingLang -> programmingLang.toLowerCase().startsWith("j"))
                .forEach(System.out::println);
    }
}
