package tasks.other.login_system;

import java.util.Scanner;

public class LoginSystem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter login:");
    String username = scanner.nextLine();

    System.out.println("Enter password:");
    String password = scanner.nextLine();

    final String sUsername = "admin";
    final String sPassword = "12345";

    if (username.equals(sUsername) && password.equals(sPassword)) {
      System.out.println("Login successful!");
    } else {
      if (!username.equals(sUsername)) {
        System.out.println("Invalid login!");
      }
      if (!password.equals(sPassword)) {
        System.out.println("Invalid password!");
      }
    }
    scanner.close();
  }
}
