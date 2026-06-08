package com.tarang.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;

public class DateDuration {

	public static void printDuration(LocalDate inputDate) {
		LocalDate currentDate = LocalDate.now();

		Period period = Period.between(inputDate, currentDate);

		System.out.println("Years: " + period.getYears());
		System.out.println("Months: " + period.getMonths());
		System.out.println("Days: " + period.getDays());
	}

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 6, 8);
		DateDuration.printDuration(date);
	}
}