/**
 * 
 */
package day19.solved;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class User {
	int id;
	String name;
	String password;
	String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		try {
			if (id > 0) {
				System.out.println("The id is valid");
			} else {
				System.out.println("print some valid id.");
			}
		} catch (Exception e) {
			System.out.println("The value is valid");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		try {
			String regex = "^[A-Za-z]\\w{2,29}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(name);
			if (m.matches()) {
				System.out.println("The user name is valid.");
			} else {
				System.out.println("The user name is not valid");
			}
		} catch (Exception e) {
			System.out.println("user name is not valid");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		
	}
	
	public boolean validatePassword() {
		boolean match = false;
		try {
//			String pattern_string = "(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
//			String pattern_string = "(?=.*[0-9])(?=.*[A-Z])(?=\\S+$).{8,}";
			String pattern_string = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])(?=.*[^\\s]).{8,}$";
			match = Pattern.matches(pattern_string, password);
//			boolean match = pattern.matches(password);
//			Pattern pattern = Pattern.compile(pattern_string);
//			Matcher m = pattern.matcher(password);
			
			if (match) {
//			if (m.matches()) {
				System.out.println("Valid password.");
			} else {
				System.out.println("Invalid password.");
			}
		} catch (PatternSyntaxException e) {
			System.out.println(e.getMessage());
		}
		
		return match;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		try {
			String regex = "^.*@.*\\..*$";
			boolean isMatch = Pattern.matches(regex, email);
			if (isMatch) {
				System.out.println("The email address is: Valid");
			} else {
				System.out.println("The email address is: Invalid");
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		User details = new User();
		details.setId(45);
		details.setName("Susikumar");
		details.setPassword("2554345f");
		details.setEmail("susi@gmail.com");
	}
}
