/**
 * 
 */
package day05.solved;

/**
 * @author VinitGore
 *
 */
public class Bicycle {
	int speed = 0;
	int gear = 1;

	void changeGear(int newValue) {
		gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println(" speed:" + speed + " gear:" + gear);
	}
	// Create a new Bicycle object

	public static void main(String[] args) {

		Bicycle bicycle1 = new Bicycle();

		// Speed up by 10

		bicycle1.speedUp(10);

		// Show the current speed
		System.out.println("after speedup(10), the current speed is :" + bicycle1.speed);

		// Change gear to 3
		bicycle1.changeGear(3);

		// Show the current gear
		System.out.println("after change gear (03), the current gear is :" + bicycle1.gear);

		// Speed up by 30
		bicycle1.speedUp(30);
		// Apply Brake to reduce the speed to 20
		bicycle1.applyBrakes(20);

		// Change gear to 2
		bicycle1.changeGear(2);
		// Print the current state
		bicycle1.printStates();

	}

}