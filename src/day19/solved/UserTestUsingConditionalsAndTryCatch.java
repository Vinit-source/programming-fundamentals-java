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
		
		// Capital letter missing
		System.out.println("vinit@1234");
		user.setPassword("vinit@1234");
		

		// Small letter missing
		System.out.println("VINIT@1234");
		user.setPassword("VINIT@1234");
		
		// Special character missing
		System.out.println("Vinit1234");
		user.setPassword("Vinit1234");
		
		// Length < 8
		System.out.println("Abc@123");
		user.setPassword("Abc@123");
		

		// Number missing
		System.out.println("Vinit@Gore");
		user.setPassword("Vinit@Gore");
	}
}
