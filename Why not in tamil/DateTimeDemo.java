package com.java8;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeDemo {
	public static void main(String[] args) {
		LocalDate localDate=LocalDate.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyy");
		System.out.println(dtf.format(localDate));

//		LocalDate d = LocalDate.of(1999, Month.DECEMBER, 28);
//		System.out.println(d);
		LocalDateTime t = LocalDateTime.now(ZoneId.of("GMT"));
		System.out.println(t);
		
		Instant i=Instant.now();
		System.out.println(i);


//		for (String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
		//Instantiate date object
		Date date=new Date();
	    System.out.println(date );
	    //display time and date using toString()
	    System.out.println(date.toString());
	    //date format
	    SimpleDateFormat now=new SimpleDateFormat("dd-MM-yyyy 'at' HH.mm.ss");
	    String s=now.format(date);
	    System.out.println(s);
	    
	    //ZoneDateTime
	    ZonedDateTime zdt=ZonedDateTime.now();
	    System.out.println(zdt); 
	    
	    Clock c=Clock.systemDefaultZone();
	    System.out.println(c);
	}

}
