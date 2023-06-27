/**
 * 
 */
package day19.solved;

/**
 * @author Vinit Gore
 *
 **/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

	@Test
	public void testException() {
		String nullString = null;
		assertThrows(NullPointerException.class, () -> {
			nullString.length();
		});
	}
}
