package tasks.other.atm_withdrawal;

import java.math.BigDecimal;
import java.util.Scanner;

public class AtmWithdrawal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the starting balance:");
    BigDecimal balance = scanner.nextBigDecimal();

    System.out.println("Enter the amount to withdraw:");
    BigDecimal amount = scanner.nextBigDecimal();

    if (amount.compareTo(BigDecimal.ZERO) <= 0) {
      System.out.println("Incorrect amount");
    } else if (amount.compareTo(balance) > 0) {
      System.out.println("Insufficient funds");
    } else {
      System.out.println("\u001B[32mOperation successful!");
      BigDecimal finalBalance = balance.subtract(amount);
      System.out.println(
          "Balance: " + balance + "\n" +
              "Amount: " + amount + "\n" +
              "=".repeat(16) + "\n" +
              "Final Balance: " + finalBalance + "\u001B[0m");
    }

    scanner.close();
  }
}
