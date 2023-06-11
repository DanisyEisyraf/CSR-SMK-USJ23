import java.util.Scanner;

public class Solution2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    int duplicate = num;
    int reversed = 0;

    while (duplicate > 0) {
      reversed = reversed * 10 + duplicate % 10;
      duplicate /= 10;
    }

    System.out.println(num + " reversed is " + reversed);

    scanner.close();
  }
}
