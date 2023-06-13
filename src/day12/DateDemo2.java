package day12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDemo2 {

	public static void main(String[] args) {

		// today's Date
		LocalDate today = LocalDate.now();

		// Expected format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

		// Converting date to the format
		String formattedDate = today.format(formatter);
		System.out.println(formattedDate);
	}

}
