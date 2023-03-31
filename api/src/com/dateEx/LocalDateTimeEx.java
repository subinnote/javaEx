package com.dateEx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {
	 public static void main(String[] args) {
		 /**
		  * 자바 8부터 날짜, 시간을 나타내는 java.time 패키지를 제공
		  */
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime when = LocalDateTime.of(2021, 5, 25, 22, 30, 25);
		
		System.out.println(now);
		System.out.println(when);
		
		System.out.println(now.toLocalDate());
		System.out.println(now.toLocalTime());
		
		System.out.println(now.format
						(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초")));
		
		System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));
		
		
		
	}
	 
}
