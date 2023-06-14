/**
 * 
 */
package day14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TatkalTicketTimeComparison {

	public static void main(String[] args) throws Exception {
		LocalDate currentDate = LocalDate.now();
		LocalDate journeyDate = LocalDate.parse("2023-06-14");

		System.out.println("Todays Date :" + currentDate + ", Journey Date:" + journeyDate);
		if (journeyDate.isBefore(currentDate)) {
			throw new Exception("Journey Date cannot be less than current date");
		}
		LocalDate tatkalDate = currentDate.plusDays(1);
		System.out.println("Note:Tatkal ticket can be booked on or before :" + tatkalDate);
		if (tatkalDate.isBefore(journeyDate)) {
			System.out.println("Tatkal ticket cannot be booked:" + journeyDate);
		} else {
			System.out.println("Tatkal Ticket booked for :" + journeyDate);
		}
	}
}