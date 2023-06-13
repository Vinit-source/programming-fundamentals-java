package day05;

public class BookDemo {

	public static void main(String[] args) {
		
		BookDemo newBook = new BookDemo();
		System.out.println(newBook);
		newBook.display();

	}
	
	public void display() {
		System.out.println("Display Method is invoked");
	}

}
