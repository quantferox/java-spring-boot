package tasks.other.shopping_discount;

import java.math.BigDecimal;
import java.util.Scanner;

public class ShoppingDiscount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Purchase amount:");
    BigDecimal amount = scanner.nextBigDecimal();

    System.out.println("Do you have a debit card?:");
    boolean isCardExist = scanner.nextBoolean();

    if (amount.compareTo(BigDecimal.valueOf(100)) > 0) {
      if (isCardExist) {
        System.out.println("20% Discount!");
      } else {
        System.out.println("10% Discount!");
      }
    } else {
      System.out.println("No discount!");
    }

    scanner.close();
  }
}
