package chapter9;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main9_4_1 {

	LocalDateTime date = LocalDateTime.now();
	System.out.println(DateTimeFormatter.of("yyyy/MM/dd HH:mm:ss.SSS").format(date);


	LocalDate date = LocalDate.now();
	System.out.println(DateTimeFormatter
			.ofPattern("yyyy/MM/dd HH:mm:ss.SSS"));





}







