package oops_skill;
import java.util.*;
public class DateExample {

	    public static void main(String[] args) {
	        Date d = new Date();
	        System.out.println("Current date is: " + d);

	        Calendar cal = Calendar.getInstance();
	        cal.setTime(d);

	        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1)); // 0-based
	        System.out.println("Year: " + cal.get(Calendar.YEAR));
	        System.out.println("Hour: " + cal.get(Calendar.HOUR_OF_DAY));
	        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
	    }
	}

