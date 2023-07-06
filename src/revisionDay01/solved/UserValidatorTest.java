/**
 * 
 */
package revisionDay01.solved;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Vinit Gore
 *
 **/
public class UserValidatorTest {

	@Test
	public void testCorrectPassword() {
		User user = new User();
		UserValidator userValidator = new UserValidator();
		System.out.println("Vinit@1234");
		user.setPassword("Vinit@1234");
		if (userValidator.validatePassword(user.getPassword())) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		assertTrue(userValidator.validatePassword(user.getPassword()));
	}

	@Test
	public void testCapitalLetterMissingInPassword() {
		// Capital letter missing
		User user = new User();
		UserValidator userValidator = new UserValidator();
		System.out.println("vinit@1234");
		user.setPassword("vinit@1234");
		if (userValidator.validatePassword(user.getPassword())) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(userValidator.validatePassword(user.getPassword()));
		
	}

	@Test
	public void testSmallLetterMissingInPassword() {
		// Small letter missing
		User user = new User();
		UserValidator userValidator = new UserValidator();
		System.out.println("VINIT@1234");
		user.setPassword("VINIT@1234");
		if (userValidator.validatePassword(user.getPassword())) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(userValidator.validatePassword(user.getPassword()));
	}
	
//	public 
}
