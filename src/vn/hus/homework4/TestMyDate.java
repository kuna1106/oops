package vn.hus.homework4;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(2012, 2, 29);
        System.out.println(myDate1);             // Tuesday 29 Feb 2012
        myDate1.setDate(2021, 7, 5);
        System.out.println(myDate1);
        System.out.println(myDate1.getDay());
        System.out.println(myDate1.getMonth());
        System.out.println(myDate1.getYear());
        System.out.println(myDate1.getDayOfWeek(2021, 7, 10));
        myDate1.setDay(29);
        myDate1.setMonth(2);
        myDate1.setYear(2021);
        myDate1.setDate(2021, 2, 29);
        System.out.println("More than 20 year ago: " + myDate1);
        
        System.out.println(myDate1.nextDay());   // Wednesday 29 Feb 2012
        System.out.println(myDate1.nextDay());   // Thursday 1 Mar 2012
        System.out.println(myDate1.nextMonth()); // Sunday 1 Apr 2012
        System.out.println(myDate1.nextYear());  // Monday 1 Apr 2013

//        MyDate myDate2 = new MyDate(2013, 2, 29);
//        System.out.println(myDate2);                 // Monday 2 Jan 2012

//	        System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
//	        System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
//	        System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
//	        System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010

//	        MyDate d3 = new MyDate(2012, 2, 29);
//	        System.out.println(d3.previousYear());  // Monday 28 Feb 2011

//	        MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
//	        MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
    }
}
