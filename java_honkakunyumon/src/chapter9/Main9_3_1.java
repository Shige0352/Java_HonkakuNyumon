package chapter9;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main9_3_1 {

	Date date = new Date();

	//DateFormatを生成する
	DateFormat format = new SimpleDateFormat("yyy年MM付dd日HH時mm分ss秒");
	System.out,println(format.format(date));



}
