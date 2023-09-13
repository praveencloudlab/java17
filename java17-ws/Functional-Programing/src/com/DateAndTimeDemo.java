package com;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTimeDemo {
	
	public static void main(String[] args) {
		
		LocalDate d=LocalDate.now();
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(d);
		System.out.println(dt);
		
		LocalDate date = LocalDate.of(2011, 6, 20);
		LocalDate newDate = date.plusMonths(3);
		System.out.println(date);
		System.out.println(newDate);
		
		
	}

}
