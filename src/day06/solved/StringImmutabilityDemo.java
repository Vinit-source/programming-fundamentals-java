/**
 * 
 */
package day06.solved;

/**
 * @author VinitGore
 *
 */
public class StringImmutabilityDemo {
	public static void main(String[] args) {
		// Declaring a string
		String originalString = "Hello";
		System.out.println("Original String: " + originalString);

		// Concatenating another String to the Original String
		String modifiedString = originalString.concat(" World!");

		// ModifiedString after concatenation
		System.out.println("Modified String: " + modifiedString);

		// Unchanged Original String
		System.out.println("Original String after modification: " + originalString);
	}
}