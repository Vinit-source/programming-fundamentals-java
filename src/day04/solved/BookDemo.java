package day04.solved;

public class BookDemo {

	public static void main(String[] args) {
		
		BookDemo newBook = new BookDemo();	//Created an object
		System.out.println(newBook);	
		newBook.display();		// Calling the display method
	}
	
	public void display() {
		System.out.println("Display Method is invoked");
	}

}
