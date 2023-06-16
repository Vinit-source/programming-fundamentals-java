package day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeExceptionDemo2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		CompileTimeExceptionDemo2 f = new CompileTimeExceptionDemo2();
		try {
			f.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("File not exists");
//			e.printStackTrace(); // Handle the exception by printing the stack trace
		}

	}

	public void readFile() throws FileNotFoundException {
		FileReader fileReader = new FileReader("example.txt"); // This line may throw a FileNotFoundException
	}
}