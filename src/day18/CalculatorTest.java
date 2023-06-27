/**
 * 
 */
package day18;

//import day18.Calculator;
/**
 * @author Vinit Gore
 *
 **/
public class CalculatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Calculator calc = new Calculator();

		int addition = calc.add(7, 5);
		if (addition == 12) {
			System.out.println("Calculator addition is Working");
		} else {
			System.out.println("Calculator addition is not Working");
		}

		int result = calc.sub(7, 5);
		if (result == 2) {
			System.out.println("Calculator subtraction is working.");
		} else {
			System.out.println("Calculator subtraction is not working.");
		}

		result = calc.mul(7, 5);
		if (result == 35) {
			System.out.println("Calculator multiplication is working");
		} else {
			System.out.println("Calculator multiplication is not working");
		}

		double div_result = calc.div(3.0, 2.0);
		if (div_result == 1.5) {
			System.out.println("Calculator division is working");
		} else {
			System.out.println("Calculator division is not working");
		}

		try {
			div_result = calc.div(3.0, 0.0);
			System.out.println("Calculator division is not working");
		} catch (ArithmeticException e) {
			System.out.println("Calculator division is working");
		} catch (Exception e) {
			System.out.println("Calculator division is not working");
		}
	}

}
