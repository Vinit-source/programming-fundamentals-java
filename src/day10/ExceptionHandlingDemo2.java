package day10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {

		String dateStr = "2023/05/21"; // Expected in "yyyy-MM-dd" format, but it's in "yyyy/MM/dd" format.
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		try {

			LocalDate parsedDate = LocalDate.parse(dateStr, formatter);
			System.out.println(parsedDate);

		} catch (Exception e) {

			System.out.println("Failed to parse the date: " + e.getMessage());
			e.printStackTrace();

		}

	}

}
