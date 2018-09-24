package chapter9;

import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;

public class Main9_5_1 {

	JapaneseDate date = JapaneseDate.of(2017,  2,  4)；
			System.out.println(date);

	JapaneseDate date = JapaneseDate.of(JapaneseEra, HEISEI, 29, 2, 4);
	System.out.println(date);
}




