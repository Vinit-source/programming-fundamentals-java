package day10;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		String name = null;
		
		try {
			
			int length = name.length();
			System.out.println(length);
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		
			
		}



	}

}
