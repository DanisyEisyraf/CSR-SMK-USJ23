import java.util.Scanner;

public class Solution1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    if (num1 > num2) {
      System.out.println("The larger number is: " + num1);
    } else {
      System.out.println("The larger number is: " + num2);
    }

    scanner.close();
  }
}
