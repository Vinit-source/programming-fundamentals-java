/**
 * 
 */
package day10;

/**
 * @author VinitGore
 *
 */
class UserAccount {

	public static void validateUsername(String username) throws IllegalArgumentException {
		if (username == null) {
			throw new IllegalArgumentException("Invalid Username");
		}

		if (username.length() < 8) {
			throw new IllegalArgumentException("Username must have at least 8 characters");
		}
	}
	
	public static void validateAge(int age) throws IllegalArgumentException {
		if (age < 0 || age > 120) {
			throw new IllegalArgumentException("Invalid age");
		}
	}
}

public class IllegalArgumentExceptionPracticeCode {

	public static void main(String[] args) {
		String username = "n";

		try {
			UserAccount.validateUsername(username);
			// Add code to validate age
			int age = -5; // Example age, replace with your own value
			UserAccount.validateAge(age);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
