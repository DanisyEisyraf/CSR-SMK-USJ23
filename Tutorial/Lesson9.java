// GUI development

import javax.swing.*;

public class Lesson9 {
  public static void main(String[] args) {
    // Create the main frame
    JFrame frame = new JFrame("GUI Tutorial");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);

    // Create a label
    JLabel label = new JLabel("Hello there");
    label.setHorizontalAlignment(SwingConstants.CENTER);

    // Add the label to the frame
    frame.getContentPane().add(label);

    // Display the frame
    frame.setVisible(true);
  }
}

// Note: online compiler won't work for GUI
// Practice: basic/bmi/grade calculator, study timer, to-do list