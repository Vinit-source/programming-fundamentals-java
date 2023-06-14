/**
 * 
 */
package day10;

/**
 * @author VinitGore
 *
 */
public class ExceptionHandlingDemo3 {
	public static void main(String[] args) {
		try {
			int[] intArr = { 49, 50, 70 };

			// Trying access an element which is not initialised and declared
			intArr[4] = 80;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
