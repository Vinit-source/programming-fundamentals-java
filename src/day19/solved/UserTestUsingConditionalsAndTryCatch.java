/**
 * 
 */
package day19.solved;

/**
 * @author Vinit Gore
 *
 **/
public class UserTestUsingConditionalsAndTryCatch {

	public static void main(String[] args) {
		User user = new User();
		
		// Correct case
		System.out.println("Vinit@1234");
		user.setPassword("Vinit@1234");
		user.validatePassword();
		
		// Capital letter missing
		System.out.println("vinit@1234");
		user.setPassword("vinit@1234");
		user.validatePassword();

		// Small letter missing
		System.out.println("VINIT@1234");
		user.setPassword("VINIT@1234");
		user.validatePassword();
		
		// Special character missing
		System.out.println("Vinit1234");
		user.setPassword("Vinit1234");
		user.validatePassword();
		
		// Length < 8
		System.out.println("Abc@123");
		user.setPassword("Abc@123");
		user.validatePassword();

		// Number missing
		System.out.println("Vinit@Gore");
		user.setPassword("Vinit@Gore");
		user.validatePassword();
	}
}
