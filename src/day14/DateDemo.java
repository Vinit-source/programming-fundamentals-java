package day14;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	}

}
