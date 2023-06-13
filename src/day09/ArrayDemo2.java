package Day09.Solved;

public class ArrayDemo2 {

	String name;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[3];


		for(int i=0; i<names.length;i++) {
			String m = names[i];
			System.out.println("The name is "+m);
		}

		System.out.println("Total Array length is " + names.length);

		for(int i=0; i<names.length;i++) {
			String m = names[i];
			System.out.println("The name is "+m);
		}

//		Character Array

		char[] letters = new char[3];

		for(int i=0; i<letters.length;i++) {
			char m = letters[i];
			System.out.println("The letter is "+m);
			System.out.println((int)m);
		}

		letters[0] = 'F';
		letters[1] = 'A';
		letters[2] = 'N';



		for(int i=0; i<letters.length;i++) {
			char m = letters[i];
			System.out.println("The letter is "+m);
			System.out.println("The integer value is: " +(int)m);
		}

//		// object Array
		ArrayDemo2[] details = new ArrayDemo2[3];  // create array of objects
		System.out.println(Arrays.toString(details));
		System.out.println(details[0]);



		// creating objects
		ArrayDemo2 student1 = new ArrayDemo2();
		student1.name ="Batman";
		student1.age =16 ;
		ArrayDemo2 student2 = new ArrayDemo2();
		student2.name ="Superman";
		student2.age = 17;
		ArrayDemo2 student3 = new ArrayDemo2();
		student3.name ="Spiderman";
		student3.age = 48;

		// assigning the objects into Array
		details[0] = student1;
		details[1] = student2;
		details[2] = student3;

		// loop for printing the value
		for(ArrayDemo2 e : details) {
			System.out.println(e);
			System.out.println("Student name is " + e.name + " he is " + e.age + " yrs old ");
		};


	}
}
