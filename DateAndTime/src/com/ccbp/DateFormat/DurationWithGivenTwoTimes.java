package com.ccbp.DateFormat;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalTime;

public class DurationWithGivenTwoTimes {

	public static void main(String[] args) {
		LocalTime startTime = LocalTime.of(5, 25,51);
		LocalTime endTime = LocalTime.of(5, 26,59);
	/*	LocalTime endTime = null ;
		try {
			 endTime = LocalTime.of(5, 26,60);
		}
		catch(DateTimeException date) {
			System.out.println("Please Enter Seconds in Between 0 to 59 Only ");
			date.printStackTrace();
			System.out.println(date.getMessage());
		} */
		Duration duration =Duration.between(startTime, endTime);
		System.out.println(duration.getSeconds() + "Seconds");
	}

}
