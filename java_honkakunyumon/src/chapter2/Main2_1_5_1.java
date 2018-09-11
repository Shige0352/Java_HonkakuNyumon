package chapter2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main2_1_5_1 {
	public static void main(String[] args) {
		int second = LocalDateTime.now().getSecond();

		if (second %2 == 0) {
			System.out.println(second + "は偶数です");
		}else {
			System.out.println(second + "は奇数です");
		}
	}
	public  void tuika() {
		int month = LocalDate.now().getMonthValue();

		if (3 <= month && month <= 5) {
			System.out.println(month + "月は春です");

		} else if (6 <= month && month <= 8){
			System.out.println(month + "月は夏です");

		} else if (9 <= month && month <= 11){
			System.out.println(month + "月は秋です");

		} else {
			System.out.println(month + "月は冬です");

		}
	}
}

