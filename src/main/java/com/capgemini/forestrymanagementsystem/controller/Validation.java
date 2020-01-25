package com.capgemini.forestrymanagementsystem.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {
	public static boolean isWord(String name) {
		return (Pattern.matches("[a-zA-Z]+", name));
	}

	public static boolean isTelePhoneNumber(String telePhNum) {
		return Pattern.matches("^[0-9]{10}$", telePhNum);
	}

	public static boolean isNumber(String number) {
		return Pattern.matches("^[0-9]{1,3}$+", number);
	}

	public static boolean hasQuantity(String quantity) {
		return Pattern.matches("^[0-9]{3}$", quantity);
	}

	public static boolean isPostalCode(String postalCode) {
		return Pattern.matches("^[0-9]{6}$+", postalCode);
	}

	public static boolean valEmail(String customerEmail) {
		String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern emailpattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailpattern.matcher(customerEmail);
		return matcher.find();
	}

	public static int countDigits(int number) {
		int count = 0;
		while (number != 0) {
			number /= 10;
			++count;
		}
		return count;
	}

	public static boolean isValidDate(String date) {
		String dateValid = "^[0-3]?[0-9]/[0-1]?[0-2]/(?:[0-9]{2})?[0-9]{4}$";
		Pattern exp = Pattern.compile(dateValid);
		Matcher match = exp.matcher((CharSequence) date);
		if (match.matches()) {
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/mm/yyyy");
			LocalDateTime local = LocalDateTime.now();
			String date1 = dateFormat.format(local);
			if (date.compareTo(date1) < 0 || date.compareTo(date1) == 0) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public static boolean deliveryDate(String date) throws ParseException {
		String dateValid = "^[0-3]?[0-9]/[0-1]?[0-2]/(?:[0-9]{2})?[0-9]{4}$";
		Pattern exp = Pattern.compile(dateValid);
		Matcher match = exp.matcher((CharSequence) date);
		if (match.matches()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isValidfuture(String d) {
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
		simpleDate.setLenient(false);
		try {
			java.util.Date date = simpleDate.parse(d); // if date invalid throw exception
			Date today = new Date();
			return date.after(today); // return false if future date
		} catch (Exception e) {
			return true;
		}
	}

	public static boolean DayValid(String day) {
		if (day.equalsIgnoreCase("monday")) {
			return true;
		} else if (day.equalsIgnoreCase("tuesday")) {
			return true;
		} else if (day.equalsIgnoreCase("wednesday")) {
			return true;
		} else if (day.equalsIgnoreCase("thursday")) {
			return true;
		} else if (day.equalsIgnoreCase("friday")) {
			return true;
		} else if (day.equalsIgnoreCase("saturday")) {
			return true;
		} else if (day.equalsIgnoreCase("sunday")) {
			return true;
		} else if (day.equalsIgnoreCase("mon")) {
			return true;
		} else if (day.equalsIgnoreCase("tue")) {
			return true;
		} else if (day.equalsIgnoreCase("wed")) {
			return true;
		} else if (day.equalsIgnoreCase("thu")) {
			return true;
		} else if (day.equalsIgnoreCase("fri")) {
			return true;
		} else if (day.equalsIgnoreCase("sat")) {
			return true;
		} else if (day.equalsIgnoreCase("sun")) {
			return true;
		} else if (day.equals("Monday")) {
			return true;
		} else if (day.equals("Tuesday")) {
			return true;
		} else if (day.equals("Wednesday")) {
			return true;
		} else if (day.equals("Thursday")) {
			return true;
		} else if (day.equals("Friday")) {
			return true;
		} else if (day.equals("Saturday")) {
			return true;
		} else if (day.equals("Sunday")) {
			return true;
		} else {
			return false;
		}
	}
}
