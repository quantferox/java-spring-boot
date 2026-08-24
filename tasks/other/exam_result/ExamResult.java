package tasks.other.exam_result;

import java.util.Scanner;

public class ExamResult {
  public static void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a score:");
    int score = scanner.nextInt();

    if (score >= 91 && score <= 100) {
      System.out.println("A");
    } else if (score >= 81 && score <= 90) {
      System.out.println("B");
    } else if (score >= 71 && score <= 80) {
      System.out.println("C");
    } else if (score >= 51 && score <= 70) {
      System.out.println("D");
    } else if (score >= 0 && score <= 50) {
      System.out.println("F");
    } else {
      System.out.println("Incorrect score!");
    }

    scanner.close();
  }
}
