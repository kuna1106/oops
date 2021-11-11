package vn.hus.homework4;

public class MyDate {
	private int year;
	private int month;
	private int day;
	public static final String[] MONTHS = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
			"Dec" };
	public static final String[] DAYS = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
			"Saturday" };
	public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isValidDate(int year, int month, int day) {
			if (year < 1 || year > 9999) {
				return false;
			}
			if (month < 1 || month > 12) {
				return false;
			}
			int dayOfMonth = DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0); 
			return (day >= 1 && day <= dayOfMonth);
			
	}
	// gauss's algorithm
	public int getDayOfWeek(int year, int month, int day) {
		int d1 = (1 + 5*((year - 1) % 4) + 4 * ((year - 1) % 100) + 6 * ((year - 1) % 400)) % 7;
		int dayOfMonth = DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0); 
		return (d1 + dayOfMonth + day) % 7;
	}
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setYear(int year) {
		if (year >= 1 && year <= 9999) {
			this.year = year;
		} else {
			throw new IllegalArgumentException("Year must be between 1 and 9999");
		}
	}
	
	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			throw new IllegalArgumentException("Month must be between 1 and 9999");
		}
	}
	
	public void setDay(int day) {
		if (day >= 1 && day <= DAYS_IN_MONTHS[month-1]) {
			this.day = day;
		} else if (month == 2 && day == 29 && isLeapYear(year)) {
			this.day = day;
		} else {
			throw new IllegalArgumentException("For this month and year, day is out of range");
		}
	}
	
	public String toString() {
		if (!isValidDate(year, month, day)) {
			return "not a valid date!";
		}
		int d = getDayOfWeek(year, month, day);
		return DAYS[d] + " " + day + " " + MONTHS[month - 1] + " " + year;
	}
	
	public MyDate nextDay() {
		if (isValidDate(year, month, day)) {
			day++;
		}
		if (day >= DAYS_IN_MONTHS[month - 1]) {
			month++;
		}
		if (month >= 12) {
			year++;
		}
		return this;
	}
	
	public MyDate nextMonth() {
		if (isValidDate(year, month, day)) {
			month++;
		}
		if (month >= 12) {
			year++;
		}
		return this;
	}
	
	public MyDate nextYear() {
		if(isValidDate(year, month, day)) {
			year++;
		}
		return this;
	}
}
