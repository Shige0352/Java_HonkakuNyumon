package chapter9;

import java.time.LocalDateTime;
import java.time.Month;

public class Main9_2_4 {


	LocalDateTime dateTime = LocalDateTime.of(2017, Month.JANUARY, 2, 3, 45, 67, 890_000_000);

	System.out.println("年: " + dateTime.getValue());
	System.out.println("月: " + dateTime.getMonth());
	System.out.println("月: " + dateTime.getMonthValue());
	System.out.println("日: " + dateTime.getDayOfMonth());
	System.out.println("時: " + dateTime.getHour());
	System.out.println("分: " + dateTime.getMinitus());
	System.out.println("秒: " + dateTime.getSecond());
	System.out.println("ナノ秒: " + dateTime.getNano());
}







