public class Experiments {
  public static void main(String[] args) {
    String x = "FB"; // collision - 2236
    String b = "Ea"; // collision - 2236

    System.out.println(x.hashCode()); // 2236
    System.out.println(b.hashCode()); // 2236
  }
}
