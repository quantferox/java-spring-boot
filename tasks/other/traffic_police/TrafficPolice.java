package tasks.other.traffic_police;

import java.util.Scanner;

public class TrafficPolice {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter speed:");
    double speed = scanner.nextDouble();

    System.out.println("Enter whether the seat belt was fastened:");
    boolean isSeatBeltFastened = scanner.nextBoolean();

    if (speed > 120 && !isSeatBeltFastened) {
      System.out.println("Two fines: speeding and seat belt");
    } else if (speed > 120) {
      System.out.println("One fine: speed");
    } else if (!isSeatBeltFastened) {
      System.out.println("One fine: seat belt");
    } else {
      System.out.println("No problem");
    }

    scanner.close();
  }
}
