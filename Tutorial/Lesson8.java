// Basic data structures

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Lesson8 {
  public static void main(String[] args) {
    // Arrays
    int[] numbers = {56, 51, 75, 88, 99};
    System.out.println(numbers[0]);
    
    // list
    List<String> subjects = new ArrayList<>();
    subjects.add("Physics");
    subjects.add("Biology");
    subjects.add("Chemistry");
    System.out.println(subjects.get(0));
    System.out.println("All subjects are shown below: ");
    for (String s : subjects) {
      System.out.println(s);
    }
    
    Map<String, Integer> examScores = new HashMap<>();
    examScores.put("Alice", 90);
    examScores.put("Bob", 85);
    int aliceScore = examScores.get("Alice");
    System.out.println("Alice gets " + aliceScore + " marks");
  }
}

// Practice: Find min/max, reverse in int array, 
// Practice: hashmap - calculate average grade, highest grade student name  
