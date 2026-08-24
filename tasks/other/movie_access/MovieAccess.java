package tasks.other.movie_access;

import java.util.Scanner;

public class MovieAccess {

  private enum TicketType {
    REGULAR,
    VIP
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your age:");
    int age = scanner.nextInt();

    System.out.println("Enter your ticket type:");
    String ticketType = scanner.next();

    try {
      TicketType ticket = TicketType.valueOf(ticketType.toUpperCase());
      if (age >= 18) {
        System.out.println("Access granted!");
      } else if (age < 18 && (ticket == TicketType.VIP)) {
        System.out.println("Access granted! You are our VIP.");
      } else {
        System.out.println("Access denied!");
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Unknown ticket type!");
    }

    scanner.close();
  }
}
