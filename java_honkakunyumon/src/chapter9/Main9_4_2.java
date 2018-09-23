package chapter9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Main9_4_2 {
	TemporalAccessor parsed = DateTimeFormatter
			.ofPattern("yyyy/MM/dd HH:mm:ss")
			.parse("2017/02/25 19:09:59");

	LocalDateTime dateTime = LocalDateTime.from(parsed);



	//エラー
	TemporalAccessor parsed = DateTimeFormatter
			.ofPattern("yyyy/MM/dd HH:mm:ss")
			.parse("2017/02/25");

	LocalDateTime dateTime = LocalDateTime.from(parsed);




	//エラー
	TemporalAccessor parsed = DateTimeFormatter
			.ofPattern("yyyy/MM/dd HH:mm:ss")
			.parse("2017/02/25");

	LocalDateTime dateTime = LocalDateTime.from(parsed);


}
