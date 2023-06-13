package day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		
		LocalDate today = LocalDate.now();
        System.out.println(today);
        
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
	}

}
