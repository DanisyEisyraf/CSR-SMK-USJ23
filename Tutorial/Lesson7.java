// Methods/Functions

public class Lesson7 {
  public static void main(String[] args) {
    greet("John Wick");
    System.out.println(add(1, 3));
  }

  static void greet(String name) {
    System.out.println("Hello my name is " + name);
  }
  static int add(int num1, int num2) {
    return num1 + num2;
  }
}

// Practice: Different return types, different parameters - Area of circles, maximum number compare, even or odd, leap year