package chapter9;

import java.sql.Date;
import java.text.DateFormat;

public class Main9_3_2 {
	//DateFormatを作成する
	DateFormat format = fprmat.SimpleDateFormat("yyyy年MM付dd日HH時mm分ss秒");

	//文字列をDateクラスにへんかんする
	try {
		Date date = format.parse("2017年01月01日01時23分45秒");
		System.out.println(date);
	} catch (parseException ex) {
		System.out.println("バースエラー");

	}
}
