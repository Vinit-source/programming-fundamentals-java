package day14;

import java.time.LocalDate;	// https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html#field.detail
import java.time.format.DateTimeFormatter;	// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#field.summary

public class DateDemo2 {

	public static void main(String[] args) {

		// today's Date
		LocalDate today = LocalDate.now();

		// Expected format
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d LLL yyyy");

		// Converting date to the format
		String formattedDate = today.format(formatter);
		System.out.println(formattedDate);
	}

}
