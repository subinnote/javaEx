package com.dateEx;

import java.util.Calendar;

public class CalenderEx {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; 
		int day = now.get(Calendar.DAY_OF_MONTH); // 일을 리턴
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일을 리턴
		int ampm = now.get(Calendar.AM_PM);		  // 오전, 오후 리턴
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(ampm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		
	}
}
