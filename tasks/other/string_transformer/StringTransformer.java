package tasks.other.string_transformer;

import java.util.ArrayList;

@FunctionalInterface
interface StringTransformerFI {
    String transform(String text);
}

public class StringTransformer {
    public static void processStrings(ArrayList<String> words, StringTransformerFI transformer) {
        for (int i = 0; i < words.size(); i++) {
            words.set(i, transformer.transform(words.get(i)));
        }
    }
}
