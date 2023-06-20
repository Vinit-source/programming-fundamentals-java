package day05;

class BookDemoWithoutPublic {
	public static void main(String[] args) {

		BookDemo newBook = new BookDemo();
		System.out.println(newBook);
		newBook.display();

	}

	public void display() {
		System.out.println("Display Method of BookDemoWithoutPublic is invoked");
	}

}
