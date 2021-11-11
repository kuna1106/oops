package vn.hus.homework4;

public class TestMyTime {
	public static void main(String[] args) {
        // Test Constructor
        MyTime myTime0 = new MyTime();
        System.out.println(myTime0);

        // Test another Constructor
        MyTime myTime = new MyTime(17,15,23);
        System.out.println(myTime.getHour());
        System.out.println(myTime.getMinute());
        System.out.println(myTime.getSecond());

        System.out.println("Time is: " + myTime);
        myTime.setHour(21); // Test Setters
        myTime.setMinute(30);
        myTime.setSecond(43);
        System.out.println("Now time is: " + myTime);
        myTime.setTime(0,0,0);

        System.out.println("Another change and is: " + myTime);
        // Test methods to change the time
        System.out.println(myTime.previousHour());
        System.out.println(myTime.previousMinute());
        System.out.println(myTime.previousSecond());
        System.out.println(myTime.nextSecond());
        System.out.println(myTime.nextMinute());
        System.out.println(myTime.nextHour());
	}
}
