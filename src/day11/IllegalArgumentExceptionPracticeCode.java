package day10.solved;

class UserAccount {

	public static void validateUsername(String username) throws IllegalArgumentException {
		if (username == null) {
			// throw an Illegal Argument Exception 
			// error message "Invalid Username"
		}

		if (username.length() < 8) {
			// throw an Illegal Argument Exception  
			// with message "Username must have atleast 8 chars";
		}
	}
	
	public static void validateAge(int age)  {
		// Add your code here to validate 
		// Throw an IllegalArgumentException
		// With error msg "Invalid age"
	}
}

public class IllegalArgumentExceptionPracticeCode {

	public static void main(String[] args) {
// Fix the compiler Errors as well after removing the 
       //valid lines of code
		String username = "n";

//		try {
			UserAccount.validateUsername(username);
			// Add code to validate age
			//UserAccount.validateAge();
	//		} catch ( e) { 
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

	}

}
