package tasks.other.scholarship_eligibility;

import java.util.Scanner;

public class ScholarshipEligibility {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter average grade:");
    double average = scanner.nextDouble();

    System.out.println("Enter attendance percentage:");
    double attendance = scanner.nextDouble();

    System.out.println("Has discipline penalty (true/false):");
    boolean hasDisciplinePenalty = scanner.nextBoolean();

    if (hasDisciplinePenalty) {
      System.out.println("You cannot receive a scholarship.");
    } else if (average > 90 && attendance > 85) {
      System.out.println("You received a full scholarship.");
    } else if (average > 75 && attendance > 75) {
      System.out.println("You received a partial scholarship.");
    } else if (average < 50 || attendance < 50) {
      System.out.println("You are in the academic risk group.");
    } else if (!hasDisciplinePenalty && average > 60) {
      System.out.println("You did not receive a scholarship, but your results are satisfactory.");
    } else {
      System.out.println("Your results are insufficient.");
    }

    scanner.close();
  }
}
