package com.ccbp.DateFormat;

import java.time.LocalDate;
import java.time.Period;

public class PeriodWithGivenTwoDates {

	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(1994, 1, 31);
		LocalDate endDate = LocalDate.of(2024, 1, 28);
		Period period = Period.between(startDate, endDate);
		System.out.print(period.getYears() + "Y-");
		System.out.print(period.getMonths() + "M-");
		System.out.print(period.getDays() + "D");
	}

}
