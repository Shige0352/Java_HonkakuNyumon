package chapter9;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main9_2_5 {
	LocalDateTime dateTime = LocalDateTime.of(2017,  2, 3, 21, 30, 15);

	//3日後
	System.out.println("3日後 :" + dateTime.plusDays(3));

	//100日前
	System.out.println("100日前 :" + dateTime.minuDays(100));

	//30秒前
	System.out.println("30秒前 :" + dateTime.minusSecond(30));

	//元のインスタンス
	System.out.println("元の値 :" + datetime);




}
