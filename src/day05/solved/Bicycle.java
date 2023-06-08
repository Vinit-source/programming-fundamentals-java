/**
 * 
 */
package day05.solved;

/**
 * @author VinitGore
 *
 */
public class Bicycle {
	int speedOfBike = 0;		// this is an instance variable/attribute
	int gear = 1;				// this is an instance variable/attribute
	static int price = 15000;	// This is a static/class variable/attribute

	void changeGear(int newValue) {	// this is an instance method
		gear = newValue;
	}

	void speedUp(int increment) {	// this is an instance method
		speedOfBike = speedOfBike + increment;
	}

	void applyBrakes(int decrement) { // this is an instance method
		speedOfBike = speedOfBike - decrement;
	}

	void printStates() {			// this is an instance method
		System.out.println(this + " speed:" + speedOfBike + " gear:" + gear);
	}
	
	static void printPrice() {		// this is an static/class method
		System.out.println(price);
	}
	
	public static void main (String [] args) {
		// Create a new Bicycle object
		Bicycle bike1 = new Bicycle();	// new instance/object created
		
		// Speed up by 10 
		bike1.speedUp(10); 		// instance method called
		
		// Show the current speed
		System.out.println("After speedUp(10), current speed is:" + bike1.speedOfBike);	// instance attribute accessed
		
		// Change gear to 3
		bike1.changeGear(3); 	// instance method called
		
		// Show the current gear 
		System.out.println("After changeGear(3), Current gear is: " + bike1.gear); // instance attribute accessed
		
		// Speed up by 30
		bike1.speedUp(30);		// instance method called
		
		// Apply Brake to reduce the speed by 20
		bike1.applyBrakes(20);	// instance method called
		
		// Change gear to 2
		bike1.changeGear(2);	// instance method called
		
		// Print the current state
		bike1.printStates();	// instance method called
		


		// Create a second object
		Bicycle bike2 = new Bicycle();	// Second instance/object created
		bike2.printStates();	// instance method called
		


		// Call a static method
		Bicycle.printPrice();	// static/class method called
		System.out.println(Bicycle.price);	// static/class attribute/variable accessed
		System.out.println(bike1.gear);		// instance attribute accessed
		
		
	}
}