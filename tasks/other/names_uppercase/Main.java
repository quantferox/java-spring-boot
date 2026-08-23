package tasks.other.names_uppercase;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sada", "Sehane", "Aysen", "Aysel");
        List<String> upperCaseNames = names.stream().map(name -> name.toUpperCase()).toList();
        System.out.println(upperCaseNames);
    }
}
