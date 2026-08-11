package day_1;

public class Lesson {
  public static void main(String[] args) {
    Thread thread1 = new Thread(() -> {
      System.out.println("Hello i am thread 1");
    });
    Thread thread2 = new Thread(() -> {
      System.out.println("Hello i am thread 2");
    });

    thread1.start();
    thread2.start();
  }
}
