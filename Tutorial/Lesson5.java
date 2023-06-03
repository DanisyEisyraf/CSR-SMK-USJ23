// If else, switch
import java.util.Scanner;

public class Lesson5 {
  public static void main(String[] args) {
    boolean isRaining = true;
    if (isRaining == true) {
      System.out.println("I'll take bus to school.");
    } else {
      System.out.println("I'll walk to school.");
    }
    
    int num1 = 5;
    int num2 = 10;
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter operator: ");
    char operator = scanner.next().charAt(0);
    double result = 0;
    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      default:
        break;
    }
    System.out.println("Result of calculation: " + result);
    scanner.close();
  }
}

// arithmetic operators: modulus, remainder
// Practice: grade calculator using if-else & time, day, month converter using switch