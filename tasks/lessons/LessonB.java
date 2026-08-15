//Вам дается ArrayList<String>, состоящий из слов. Вы должны создать универсальную систему, которая преобразует эти слова в различные форматы (например, делает все буквы заглавными или добавляет символ в начало).
//Создайте интерфейс StringTransformer с аннотацией @FunctionalInterface. В нем должен быть метод String transform(String text);.
//Напишите метод processStrings. Этот метод должен изменить каждый элемент списка согласно переданному правилу (Lambda) и обновить оригинальный список (используя метод set).
//ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "lambda", "interface"));

package tasks.lessons;

import java.util.ArrayList;
import java.util.Arrays;

@FunctionalInterface
interface StringTransformer {
  String transform(String text);
}

public class LessonB {
  public static void processStrings(ArrayList<String> words, StringTransformer transformer) {
    for (int i = 0; i < words.size(); i++) {
      String transformed = transformer.transform(words.get(i));
      words.set(i, transformed);
    }
  }

  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "lambda", "interface"));
    processStrings(words, word -> word.toUpperCase());
    System.out.println(words);
  }
}
