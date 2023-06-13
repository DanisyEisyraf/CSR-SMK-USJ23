public class Solution3 {
  public static void main(String[] args) {
    int diamond_size = 7;
    
    for (int i = 1; i <= diamond_size; i += 2) {
      for (int j = 0; j < (diamond_size - i) / 2; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    for (int i = diamond_size - 2; i >= 1; i -= 2) {
      for (int j = 0; j < (diamond_size - i) / 2; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    // I consider this more idiomatic java, so I'll keep this here just to show 
    // the students there are multiple ways to solve a problem
    //
    // for (int i = 1; i <= diamond_size; i += 2) {
    //   System.out.println(" ".repeat((diamond_size - i) / 2) + "*".repeat(i));
    // }
    //
    // for (int i = diamond_size - 2; i >= 1; i -= 2) {
    //   System.out.println(" ".repeat((diamond_size - i) / 2) + "*".repeat(i));
    // }

  }
}
