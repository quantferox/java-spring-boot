package tasks.other.string_transformer;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "lambda", "interface"));
        StringTransformer.processStrings(words, word -> word.toUpperCase());
        System.out.println(words); // [JAVA, LAMBDA, INTERFACE]
    }
}
