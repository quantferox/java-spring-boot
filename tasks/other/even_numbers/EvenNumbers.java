package tasks.other.even_numbers;

public class EvenNumbers {
    public static void printEvenDescending(int from) {
        // Выводим чётные числа от from до 0 включительно
        byte i = (byte) from;
        while (i >= 0) {
            System.out.println(i);
            i -= (byte) 2;
        }
    }
}
