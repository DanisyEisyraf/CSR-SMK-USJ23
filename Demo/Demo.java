package Demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Demo {
	private static final String FILE_PATH = "users.txt";

	public static void main(String[] args) {
		// Create the main frame
		JFrame frame = new JFrame("Long & Register Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setLayout(new GridLayout(3, 2));

		// Create labels
		JLabel nameLabel = new JLabel("Username:");
		JLabel passwordLabel = new JLabel("Password:");

		// Create text fields
		JTextField nameField = new JTextField();
		JPasswordField passwordField = new JPasswordField();

		// Create buttons
		JButton registerButton = new JButton("Register");
		JButton loginButton = new JButton("Login");

		// Add components to the frame
		frame.add(nameLabel);
		frame.add(nameField);
		frame.add(passwordLabel);
		frame.add(passwordField);
		frame.add(registerButton);
		frame.add(loginButton);

		// Register button action listener
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String password = new String(passwordField.getPassword());

				// Write user information to the file
				try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
					writer.write(name + "," + password);
					writer.newLine();
					writer.flush();
					JOptionPane.showMessageDialog(frame, "Register successful!");
				} catch (IOException ex) {
					ex.printStackTrace();
				}

				// Clear text fields
				nameField.setText("");
				passwordField.setText("");
			}
		});

		// Login button action listener
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String password = new String(passwordField.getPassword());

				// Read user information from the file
				try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
					String line;
					boolean loggedIn = false;
					while ((line = reader.readLine()) != null) {
						String[] userData = line.split(",");
						if (userData.length == 2 && userData[0].equals(name) && userData[1].equals(password)) {
							loggedIn = true;
							break;
						}
					}
					if (loggedIn) {
						JOptionPane.showMessageDialog(frame, "Login successful!");
					} else {
						JOptionPane.showMessageDialog(frame, "Invalid credentials!");
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}

				// Clear text fields
				nameField.setText("");
				passwordField.setText("");
			}
		});

		// Display the frame
		frame.setVisible(true);
	}
}

// space of improvements: check duplicate username, check username/password strength, perform hasing   