package tasks.other.castle_access;

import java.util.Scanner;

public class CastleAccess {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter level:");
    int level = scanner.nextInt();

    System.out.println("Enter gold:");
    int gold = scanner.nextInt();

    System.out.println("Has key (true/false):");
    boolean hasKey = scanner.nextBoolean();

    System.out.println("Is wanted (true/false):");
    boolean isWanted = scanner.nextBoolean();

    if (isWanted) {
      System.out.println("Entry to the castle is forbidden!");
    } else if (level > 15 && hasKey) {
      System.out.println("You entered the castle.");
    } else if (level > 15 && gold >= 500) {
      System.out.println("You don't have a key, but you bought the door.");
    } else if (level < 5 && gold < 100) {
      System.out.println("You are too weak. Train more.");
    } else if (!hasKey && gold > 100 && gold < 500) {
      System.out.println("You don't have enough gold to buy the door.");
    } else {
      System.out.println("The requirements are not met.");
    }

    scanner.close();
  }
}
