/**
 * 
 */
package day19.solved;

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
		System.out.println("Vinit@1234");
		user.setPassword("Vinit@1234");
		if (user.validatePassword()) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		assertTrue(user.validatePassword());
	}

	@Test
	public void testCapitalLetterMissingInPassword() {
		// Capital letter missing
		User user = new User();
		System.out.println("vinit@1234");
		user.setPassword("vinit@1234");
		if (user.validatePassword()) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(user.validatePassword());
		
	}

	@Test
	public void testSmallLetterMissingInPassword() {
		// Small letter missing

		User user = new User();
		System.out.println("VINIT@1234");
		user.setPassword("VINIT@1234");
		if (user.validatePassword()) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		assertFalse(user.validatePassword());
	}
}
