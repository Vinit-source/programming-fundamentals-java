/**
 * 
 */
package day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author VinitGore
 *
 */
public class CompileTimeExceptionDemo {

	public static void main(String[] args) {
//		try {
			FileReader fileReader = new FileReader("example.txt"); // This line may throw a FileNotFoundException
//		} catch (FileNotFoundException e) {
//			e.printStackTrace(); // Handle the exception by printing the stack trace
//			System.out.println("Please provide valid Filename.");
//		}
	}
}
