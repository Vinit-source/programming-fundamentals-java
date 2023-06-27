/**
 * 
 */
package day19.solved;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class TimeoutTest {

	@Test
	public void testMethodExecutionTime() {
		assertTimeout(Duration.ofMillis(100), () -> {
			// Code that should execute within 100 milliseconds
			// Add your code here
			int result = performComplexCalculation(5, 1000000);
			System.out.println("Result: " + result);
		});
	}

	private int performComplexCalculation(int a, int b) {
		// Simulate a complex calculation that takes time
		int sum = 0;
		for (int i = 0; i < b; i++) {
			sum += a*b;
		}
		return sum;
	}
}
