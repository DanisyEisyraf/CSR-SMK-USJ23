// File I/O, try catch exception

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson8 {
  public static void main(String[] args) {
    String rFileName = "input.txt";
    
    // reading from file
    try {
      BufferedReader reader = new BufferedReader(new FileReader(rFileName));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (IOException e) {
      System.out.println("An error occurred while reading the file: " + e.getMessage());
    }
    
    // writing to file
    String wFileName = "output.txt";
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(wFileName));
      writer.write("This is a sample text.");
      writer.newLine();
      writer.close();
      System.out.println("Data has been written to the file.");
      writer.close();
    } catch (IOException e) {
      System.out.println("An error occurred while reading the file: " + e.getMessage());
    }
  }
}

// File handling works on online compiler
// Practice: File copying, word count from file