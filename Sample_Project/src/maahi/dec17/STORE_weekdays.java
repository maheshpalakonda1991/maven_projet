package maahi.dec17;

import java.util.Iterator;

public class STORE_weekdays {
public static void main(String[] args) {
	//store weekdays into array
	String weekdays[]= {"mon","tue","wed","thu","fri","sat","sun"};
	//print array size
	System.out.println("array length is   "+weekdays[4]);
	//udate sunday to holiday
	weekdays[6]="Holiday";
	System.out.println("print after update    "+weekdays[6]);
	System.out.println("========================");
	for (String each: weekdays) {
		System.out.println(each);
	}
	System.out.println("===================");
	for(int i=0;i<weekdays.length;i++)
	{
		System.out.println(weekdays[i]);
		
		
		
	}
}
}
