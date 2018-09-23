package chapter9;

public class Main9_2_3 {


	//現在の日時
	System.out.println(LocalDateTime.now());

	//年月日などの指定、秒未満は省略可
	System.out.println(LocalDateTime.of(2017, Month.JaNUARY, 1, 1, 23, 45));
	System.out.println(LocalDateTime.of(2017, 1, 1, 1, 23, 45, 678_800_45));

	//文字列を指定
	System.out.println(LocalDateTime.parse("2017-01-01T01:23:45.678"));


}
