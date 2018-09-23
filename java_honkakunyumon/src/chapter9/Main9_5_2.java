package chapter9;

import java.time.chrono.JapaneseDate;

public class Main9_5_2 {

	JapaneseDate date = JapaneseDate.of(2017, 2017, 2, 4);
	System.out.println(DateTimeFormatter
			.ofPattern("GGGGy年M月d日")
			.format(date));
}







