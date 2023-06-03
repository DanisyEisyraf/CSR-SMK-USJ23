// Input/Output

import java.util.Scanner;

public class Lesson3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    System.out.print("Enter your score: ");
    int passScore = scanner.nextInt();

    System.out.println("Your Score is " + passScore + "!"); 
    scanner.close();
  }
}

// Practice: I/O using other data type