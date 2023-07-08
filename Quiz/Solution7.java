import java.util.Scanner;

public class Solution7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    int duplicate = num;
    int count = 0;

    while (duplicate > 0) {
      count += 1;
      duplicate /= 10;
    }

    System.out.println(num + " has " + count + " digits");

    scanner.close();
  }
}
