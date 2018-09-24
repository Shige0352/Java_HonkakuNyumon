package chapter9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Main9_4_3 {
	TemporalAccessor parsed = DateTimeFormatter.ISO_LOCAL_DATE.parse("2017-02-25");
	LocalDate date = LocalDate.from(parsed);


}
