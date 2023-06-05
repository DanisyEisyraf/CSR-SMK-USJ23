package Demo;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashing {
	public static void main(String[] args) {
		String inputData = "abc123";

		try {
			// Create a MessageDigest object with the desired hash function (SHA-256)
			MessageDigest digest = MessageDigest.getInstance("SHA-256");

			// Convert the input data to bytes
			byte[] inputDataBytes = inputData.getBytes(StandardCharsets.UTF_8);

			// Compute the hash value
			byte[] hashBytes = digest.digest(inputDataBytes);

			// Convert the hash bytes to a hexadecimal representation
			String hash = bytesToHex(hashBytes);

			System.out.println("Input Data: " + inputData);
			System.out.println("Hash Value (SHA-256): " + hash);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	// Helper method to convert bytes to hexadecimal string
	private static String bytesToHex(byte[] bytes) {
		StringBuilder hexString = new StringBuilder();
		for (byte b : bytes) {
			String hex = Integer.toHexString(0xff & b);
			if (hex.length() == 1) {
				hexString.append('0');
			}
			hexString.append(hex);
		}
		return hexString.toString();
	}
}
