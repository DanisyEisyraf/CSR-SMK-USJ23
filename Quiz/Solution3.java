public class Solution3 {
  public static void main(String[] args) {
    int diamond_size = 7;

    for (int i = 1; i <= diamond_size; i += 2) {
      System.out.println(" ".repeat((diamond_size - i) / 2) + "*".repeat(i));
    }

    for (int i = diamond_size - 2; i >= 1; i -= 2) {
      System.out.println(" ".repeat((diamond_size - i) / 2) + "*".repeat(i));
    }
  }
}
